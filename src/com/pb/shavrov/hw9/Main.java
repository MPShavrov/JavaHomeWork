package com.pb.shavrov.hw9;

import java.io.IOException;

import static com.pb.shavrov.hw9.FileNumbers.createOddNumbersFile;


public class Main {
    public static String pathMain = FileNumbers.pathMain;
    public static void main(String[] args) throws IOException {
        int[][] a = new int[10][10];
        int max_secret = 100;

        FileNumbers.createFoulder();
        FileNumbers.createArray(a, max_secret);

        FileNumbers.createNumbersFile(a, pathMain + "numbers.txt");
        System.out.println("Преобразованный массив из файла:");
        int[][] nArr = createOddNumbersFile(pathMain + "numbers.txt");
        FileNumbers.createNumbersFile(nArr, pathMain + "odd-numbers.txt");

        FileNumbers.printArray(nArr);
    }
}
