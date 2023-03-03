// Streams - Exercise 3:
// Write a method that returns the average of a list of integers using streams

package Streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamsTask3 {
    public static void main(String[] args) {
        // creating a stream of integers
        IntStream streamOfInt = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Method call and print out the average of the integers in the list
        System.out.println("The average is: " + countAverage(streamOfInt));
    }

    // Creating a method to count the average of a stream of integer list
    public static double countAverage(IntStream stream) {
        // Using average method
        OptionalDouble average = stream.average();
        return average.getAsDouble();
    }
}
