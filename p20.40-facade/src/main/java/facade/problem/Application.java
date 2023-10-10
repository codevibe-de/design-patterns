package facade.problem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        final String inputFileName = "p20.40-facade/src/main/java/facade/problem/Application.java";
        final String outputFileName = "p20.40-facade/target/upper.txt";

        final List<String> inputLines = new ArrayList<>();
        final List<String> outputLines = new ArrayList<>();

        try (final FileInputStream fis = new FileInputStream(inputFileName);
             final InputStreamReader isr = new InputStreamReader(fis);
             final BufferedReader br = new BufferedReader(isr)) {
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                inputLines.add(line);
            }
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

        inputLines.forEach(line -> outputLines.add(line.toUpperCase()));

        try (final FileOutputStream fos = new FileOutputStream(outputFileName);
             final PrintWriter pw = new PrintWriter(fos)) {
            outputLines.forEach(line -> pw.println(line.length() + " : " + line));
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
