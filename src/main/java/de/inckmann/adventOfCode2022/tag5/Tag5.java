package de.inckmann.adventOfCode2022.tag5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Tag5 {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        part1();
        System.out.println();
        System.out.println("Part 2:");
        part2();
    }

    public static void part1() {
        File file = new File("tes");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void part2() {
        File file = new File("inputTag5");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
