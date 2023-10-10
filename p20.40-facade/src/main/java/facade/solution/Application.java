package facade.solution;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {
        final String inputFileName = "p20.40-facade/src/main/java/facade/problem/Application.java";
        final String outputFileName = "p20.40-facade/target/upper.txt";

        final List<String> inputLines = new ArrayList<>();
        final List<String> outputLines = new ArrayList<>();

        try (final TextReader reader = new TextReader(inputFileName)) {
            for (final String line : reader) {
                inputLines.add(line);
            }
        }

        inputLines.forEach(line -> outputLines.add(line.toUpperCase()));

        try (final TextWriter writer = new TextWriter(outputFileName)) {
            outputLines.forEach(line -> writer.writeln(line.length() + " : " + line));
        }
    }
}
