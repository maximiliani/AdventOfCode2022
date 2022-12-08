package de.inckmann.adventOfCode2022.tag4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Tag4 {
    public static void main(String[] args) {
//        System.out.println("Part 1:");
//        part1();
//        System.out.println();
        System.out.println("Part 2:");
        part2();
    }

    public static void part1() {
        File file = new File("inputTag4");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] split = line.split(",");
                int[] split2 = Arrays.stream(Arrays.stream(split).map(s -> s.split("-")).flatMap(Arrays::stream).toArray(String[]::new)).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
                System.out.println(line);
                System.out.println(Arrays.toString(split2));

                if (split2[0] >= split2[2] && split2[3] >= split2[1]) score ++;
                else if (split2[2] >= split2[0] && split2[1] >= split2[3]) score ++;
                System.out.println(score);
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(score);
    }

    public static void part2() {
        File file = new File("inputTag4");
        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] split = line.split(",");
                int[] split2 = Arrays.stream(Arrays.stream(split).map(s -> s.split("-")).flatMap(Arrays::stream).toArray(String[]::new)).map(Integer::parseInt).mapToInt(Integer::intValue).toArray();
                System.out.println(line);
                System.out.println(Arrays.toString(split2));

                if (split2[0] >= split2[2] && split2[3] >= split2[1]) score ++;
                else if (split2[2] >= split2[0] && split2[1] >= split2[2]) score ++;
                else if (split2[1] == split2[2] || split2[0] == split2[3]) score ++;
                else if (split2[0] >= split2[2] && split2[3] >= split2[0]) score ++;
                System.out.println(score);
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(score);
    }
}
