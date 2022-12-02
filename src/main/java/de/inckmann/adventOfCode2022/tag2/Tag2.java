package de.inckmann.adventOfCode2022.tag2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static de.inckmann.adventOfCode2022.tag2.Tag2.RPC.*;

public class Tag2 {
    public static void main(String[] args) {
        part2();
    }

    private static void part1(){
        File file = new File("inputTag2.txt");

        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] parts = line.split(" ");

                for (String part : parts) {
                    System.out.print(part);
                }
                System.out.println();
                RPC opp = switch (parts[0]) {
                    case "A" -> ROCK;
                    case "B" -> PAPER;
                    case "C" -> SCISSORS;
                    default -> throw new IllegalStateException("Unexpected value: " + parts[0]);
                };

                RPC you = switch (parts[1]) {
                    case "X" -> ROCK;
                    case "Y" -> PAPER;
                    case "Z" -> SCISSORS;
                    default -> throw new IllegalStateException("Unexpected value: " + parts[1]);
                };

                score += you.value;
                if ((opp == ROCK && you == PAPER) || (opp == PAPER && you == SCISSORS) || (opp == SCISSORS && you == ROCK)) score += 6;
                else if (opp == you) score += 3;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(score);
    }

    private static void part2(){
        File file = new File("inputTag2.txt");

        int score = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] parts = line.split(" ");

                for (String part : parts) {
                    System.out.print(part);
                }
                System.out.println();
                RPC opp = switch (parts[0]) {
                    case "A" -> ROCK;
                    case "B" -> PAPER;
                    case "C" -> SCISSORS;
                    default -> throw new IllegalStateException("Unexpected value: " + parts[0]);
                };

                RPC you;
                switch (parts[1]) {
                    case "X" -> you = switch (opp) {
                        case ROCK -> SCISSORS;
                        case PAPER -> ROCK;
                        case SCISSORS -> PAPER;
                    };
                    case "Y" -> you = switch (opp) {
                        case ROCK -> ROCK;
                        case PAPER -> PAPER;
                        case SCISSORS -> SCISSORS;
                    };
                    case "Z" -> you = switch (opp) {
                        case ROCK -> PAPER;
                        case PAPER -> SCISSORS;
                        case SCISSORS -> ROCK;
                    };
                    default -> throw new IllegalStateException("Unexpected value: " + parts[1]);
                }

                score += you.value;
                if ((opp == ROCK && you == PAPER) || (opp == PAPER && you == SCISSORS) || (opp == SCISSORS && you == ROCK)) score += 6;
                else if (opp == you) score += 3;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(score);
    }

    enum RPC {
        ROCK(1), PAPER(2), SCISSORS(3);
        private final int value;

        RPC(int value) {
            this.value = value;
        }
    }
}
