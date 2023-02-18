package Streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        // Streams - Exercise 3:
        // Write a method that returns the average of a list of integers using streams

        // creating a stream of integers
        IntStream streamOfInt = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using average method
        OptionalDouble average = streamOfInt.average();

        // Print out the average of the integers in the list
        System.out.println("The average is: " + average.getAsDouble());
    }
}
