package aoc.day02;

import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author radek
 */
public class Day02 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int length = 0;
        int depth = 0;

        //Loading input commands
        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                //Calculating length and depth
                if (line[0].equals("forward")) {
                    length = length + Integer.parseInt(line[1]);
                }
                if (line[0].equals("down")) {
                    depth = depth + Integer.parseInt(line[1]);
                }
                if (line[0].equals("up")) {
                    depth = depth - Integer.parseInt(line[1]);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        //Part One result
        System.out.println("Day Two Part One:");
        System.out.println("Length: " + length);
        System.out.println("Depth: " + depth);
        System.out.println("Result: " + length * depth);
        System.out.println("");

        int aim = 0;
        length = 0;
        depth = 0;

        //Loading input commands
        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {
            while (scanner.hasNextLine()) {
                //Calculating length, depth and aim
                String[] line = scanner.nextLine().split(" ");
                if (line[0].equals("forward")) {
                    length = length + Integer.parseInt(line[1]);
                    depth = depth + aim * Integer.parseInt(line[1]);
                }
                if (line[0].equals("down")) {
                    aim = aim + Integer.parseInt(line[1]);
                }
                if (line[0].equals("up")) {
                    aim = aim - Integer.parseInt(line[1]);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Day Two Part Two:");
        System.out.println("Length: " + length);
        System.out.println("Depth: " + depth);
        System.out.println("Result: " + length * depth);

    }

}
