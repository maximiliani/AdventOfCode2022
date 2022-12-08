package de.inckmann.adventOfCode2022.tag5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Stack;

public class Tag5 {
    private static final Stack[] stacks = new Stack[9];

    public static void main(String[] args) {
        initStacks();
        System.out.println("Part 1:");
        part1();
        System.out.println();
        initStacks();
        System.out.println("Part 2:");
        part2();
    }

    public static void part1() {
        File file = new File("inputTag5");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] split = line.split(" ");
                System.out.println(Arrays.toString(split));
                int count = Integer.parseInt(split[1]);
                int start = Integer.parseInt(split[3])-1;
                int end = Integer.parseInt(split[5])-1;
                System.out.println(stacks[start]);
                System.out.println(stacks[end]);
                for (int i = 0; i < count ; i++) stacks[end].push(stacks[start].pop());
                System.out.println(stacks[start]);
                System.out.println(stacks[end]);
                System.out.println("----------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < stacks.length; i++) System.out.print(stacks[i].peek());
    }

    public static void part2() {
        File file = new File("inputTag5");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] split = line.split(" ");
                System.out.println(Arrays.toString(split));
                int count = Integer.parseInt(split[1]);
                int start = Integer.parseInt(split[3])-1;
                int end = Integer.parseInt(split[5])-1;
                System.out.println(stacks[start]);
                System.out.println(stacks[end]);
                Stack<Object> temp = new Stack<>();
                for (int i = 0; i < count ; i++) temp.push(stacks[start].pop());
                for (int i = 0; i < count ; i++) stacks[end].push(temp.pop());
                System.out.println(stacks[start]);
                System.out.println(stacks[end]);
                System.out.println("----------------");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Stack<String> stack : stacks) System.out.print(stack.peek());
    }

    private static void initStacks() {
        for (int i = 0; i < stacks.length; i++) stacks[i] = new Stack<>();
        stacks[0].push("D");
        stacks[0].push("L");
        stacks[0].push("J");
        stacks[0].push("R");
        stacks[0].push("V");
        stacks[0].push("G");
        stacks[0].push("F");

        stacks[1].push("T");
        stacks[1].push("P");
        stacks[1].push("M");
        stacks[1].push("B");
        stacks[1].push("V");
        stacks[1].push("H");
        stacks[1].push("J");
        stacks[1].push("S");

        stacks[2].push("V");
        stacks[2].push("H");
        stacks[2].push("M");
        stacks[2].push("F");
        stacks[2].push("D");
        stacks[2].push("G");
        stacks[2].push("P");
        stacks[2].push("C");

        stacks[3].push("M");
        stacks[3].push("D");
        stacks[3].push("P");
        stacks[3].push("N");
        stacks[3].push("G");
        stacks[3].push("Q");

        stacks[4].push("J");
        stacks[4].push("L");
        stacks[4].push("H");
        stacks[4].push("N");
        stacks[4].push("F");

        stacks[5].push("N");
        stacks[5].push("F");
        stacks[5].push("V");
        stacks[5].push("Q");
        stacks[5].push("D");
        stacks[5].push("G");
        stacks[5].push("T");
        stacks[5].push("Z");

        stacks[6].push("F");
        stacks[6].push("D");
        stacks[6].push("B");
        stacks[6].push("L");

        stacks[7].push("M");
        stacks[7].push("J");
        stacks[7].push("B");
        stacks[7].push("S");
        stacks[7].push("V");
        stacks[7].push("D");
        stacks[7].push("N");

        stacks[8].push("G");
        stacks[8].push("L");
        stacks[8].push("D");

        System.out.println("Stacks initialized");
        System.out.println(Arrays.toString(stacks));
    }
}
