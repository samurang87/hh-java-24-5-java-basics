package de.neuefische;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class AsciiArt {
    public static void main(String[] args) {
        String message = "hello world";
        try {
            String asciiArt1 = FigletFont.convertOneLine(message);
            System.out.println(asciiArt1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
