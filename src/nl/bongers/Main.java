package nl.bongers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while (nonNull((line = reader.readLine()))) {
            line = line.trim();
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += Character.getNumericValue(line.charAt(i));
            }
            System.out.println(sum);
        }
    }
}
