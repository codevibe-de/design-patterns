package util.xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XMLScanner {

    private final static XMLInputFactory factory = XMLInputFactory.newInstance();

    public final XMLStreamReader reader;

    public XMLScanner(InputStream in) {
        try {
            this.reader = factory.createXMLStreamReader(in);
            this.read();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isStart(String name) {
		if (this.reader.getEventType() != XMLStreamConstants.START_ELEMENT) {
			return false;
		}
		if (!name.equals(this.reader.getName().getLocalPart())) {
			return false;
		}
        return true;
    }

    public void start(String name) {
		if (this.reader.getEventType() != XMLStreamConstants.START_ELEMENT) {
			throw new RuntimeException("startElement expected (but found: "
					+ this.reader.getEventType());
		}
		if (!name.equals(this.reader.getName().getLocalPart())) {
			throw new RuntimeException("<" + name + "> expected. found: <" + this.reader.getName()
					+ ">");
		}
        this.read();
    }

    public void end(String name) {
		if (this.reader.getEventType() != XMLStreamConstants.END_ELEMENT) {
			throw new RuntimeException("endElement expected (but was: "
					+ this.reader.getEventType());
		}
		if (!name.equals(this.reader.getName().getLocalPart())) {
			throw new RuntimeException("</" + name + "> expected. found: </"
					+ this.reader.getName() + ">");
		}
        this.read();
    }

    public Map<String, String> getAttributes() {
        final Map<String, String> map = new HashMap<>();
		for (int i = 0; i < this.reader.getAttributeCount(); i++) {
			map.put(this.reader.getAttributeName(i).toString(), this.reader.getAttributeValue(i));
		}
        return map;
    }

    public String startTextEnd(String name) {
        this.start(name);
		if (this.reader.getEventType() != XMLStreamConstants.CHARACTERS) {
			throw new RuntimeException("Characters expected");
		}
        final String text = this.reader.getText();
        this.read();
        this.end(name);
        return text;
    }

    private int read() {
        try {
            while (this.reader.hasNext()) {
                final int eventType = this.reader.next();
                if (eventType == XMLStreamConstants.CHARACTERS) {
                    final String text = this.reader.getText();
					if (this.isWhite(text)) {
						continue;
					}
                    return eventType;
                }
                if (eventType == XMLStreamConstants.START_ELEMENT
                        || eventType == XMLStreamConstants.END_ELEMENT) {
                    return eventType;
                }
            }
            return this.reader.getEventType();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isWhite(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (!Character.isWhitespace(text.charAt(i))) {
				return false;
			}
		}
        return true;
    }
}
