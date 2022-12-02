package de.inckmann.adventOfCode2022.tag1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tag1 {
    public static void main(String[] args) {
        File file = new File("inputTag1.txt");

        List<Integer> values = new ArrayList<>();
        int currAmount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            while (br.ready()) {
                String line = br.readLine();
                if (line.equals("")) {
                    values.add(currAmount);
                    System.out.println(currAmount);
                    System.out.println("----------------");
                    currAmount = 0;
                }
                else currAmount += Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        values.add(currAmount);
        values.sort(Integer::compareTo);
        values.forEach(System.out::println);
        System.out.println(values.get(values.size()-1) + values.get(values.size()-2) + values.get(values.size()-3));
    }
}
