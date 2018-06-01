/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huylvq.geninput;

import java.io.IOException;

/**
 *
 * @author huylvq
 */
public class Main {

    public static void main(String[] args) throws IOException {
        new RandomFileGenerator("input.txt", 90000000).generate();
    }
}
