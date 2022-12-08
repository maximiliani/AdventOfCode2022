package de.inckmann.adventOfCode2022.Tag6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class Tag6 {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        part1();
        System.out.println();
        System.out.println("Part 2:");
        part2();
    }

    public static void part1() {
        File file = new File("inputTag6");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    Set<Character> set = new HashSet<>();
                    for (int j = 0; j < 4; j++) set.add(line.charAt(i + j));
                    if (set.size() == 4) {
                        System.out.println("Found sequence: " + line.substring(i, i + 4));
                        System.out.println(i + 4);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void part2() {
        File file = new File("inputTag6");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                for (int i = 0; i < line.length(); i++) {
                    Set<Character> set = new HashSet<>();
                    for (int j = 0; j < 14; j++) set.add(line.charAt(i + j));
                    if (set.size() == 14) {
                        System.out.println("Found sequence: " + line.substring(i, i + 14));
                        System.out.println(i + 14);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
