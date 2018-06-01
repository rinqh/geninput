/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huylvq.geninput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.kohsuke.randname.RandomNameGenerator;

/**
 *
 * @author huylvq
 */
public class RandomFileGenerator {

    private final String fileName;
    private final int lines;

    RandomFileGenerator(String fileName, int lineCount) {
        this.fileName = fileName;
        this.lines = lineCount;
    }

    void generate() throws IOException {
        RandomNameGenerator rng = new RandomNameGenerator(0);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < lines; ++i) {
                String line = String.format("%s %s%n", rng.next(), rng.next());
                bw.write(line);
            }
        }
    }
}
