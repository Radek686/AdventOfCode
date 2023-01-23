/*

 */
package aoc.day01;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author radek
 */
public class Day01 {


    public static void main(String[] args) {

        System.out.println("2021 Day 01 Part 01");
        // First upload everything to arraylist
        ArrayList<Integer> depths = new ArrayList<>();
        // create scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get("input depth data.txt"))) {
            // read all lines and add to array
            while (scanner.hasNextLine()) {
                depths.add(Integer.valueOf(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // Checking how often measurement increases
        int result = 0;
        for (int i = 1; i < depths.size(); i++) {
            if (depths.get(i) > depths.get(i - 1)) {
                result++;
            }
        }

        System.out.println("Part one result: " + result);

        // *********** PART 02 *************************************************
        System.out.println("");

        System.out.println("2021 Day 01 Part 02");

        // create arraylist of sums of triplets from array lines and count increasing triplets
        int output = 0;

        ArrayList<Integer> triplets = new ArrayList<>();
        for (int i = 0; i <= depths.size() - 3; i++) {
            triplets.add(i, depths.get(i) + depths.get(i + 1) + depths.get(i + 2));
            if (i == 0) {
                continue;
            }
            if (triplets.get(i) > triplets.get(i - 1)) {
                output++;
            }
        }

        System.out.println("Part two result: " + output);

    }
}
