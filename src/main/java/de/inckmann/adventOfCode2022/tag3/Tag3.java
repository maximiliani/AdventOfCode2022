package de.inckmann.adventOfCode2022.tag3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Tag3 {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        part1();
        System.out.println();
        System.out.println("Part 2:");
        part2();
    }

    public static void part1() {
        File file = new File("inputTag3");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);

                int[] values = new int[line.length()];
                for (int i = 0; i < line.length(); i++) {
                    values[i] = getValueToLetter(line.charAt(i));
                }

                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < values.length / 2; i++) {
                    for (int j = values.length / 2; j < values.length; j++) {
                        if (values[i] == values[j]) set.add(values[i]);
                    }
                }

                System.out.println("Set: " + set);
                for (int i : set) score += i;

                System.out.println("Score: " + score);
                System.out.println("-----");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(score);
    }

    public static void part2() {
        File file = new File("inputTag3");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String line2 = br.readLine();
                String line3 = br.readLine();
                System.out.println(line);
                System.out.println(line2);
                System.out.println(line3);

                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < line.length(); i++) {
                    char x = line.charAt(i);
                    if (line2.contains(x + "") && line3.contains(x + "")) {
                        System.out.println(line.charAt(i));
                        set.add(getValueToLetter(line.charAt(i)));
                    }
                }

                for (int i : set) score += i;
                System.out.println("Score: " + score);
                System.out.println("-----");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(score);
    }

    static int getValueToLetter(char x) {
        if ((int) x >= 65 && (int) x <= 90) return (int) x - 64 + 26;
        else if ((int) x >= 97 && (int) x <= 122) return (int) x - 96;
        else return 0;
    }
}
