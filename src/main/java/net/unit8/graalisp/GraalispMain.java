package net.unit8.graalisp;

import java.io.Console;
import java.io.IOException;

public class GraalispMain {
    public static void main(String[] args) {

    }

    private static void startREPL() throws IOException {
        Console console = System.console();
        while (true) {
            // READ
            String data = console.readLine("~> ");
            if (data == null) {
                // EOF sent
                break;
            }
        }
    }
}
