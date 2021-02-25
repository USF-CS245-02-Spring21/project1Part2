package sorting;

public class SortingImplementationII {

    /**
     * Implement a linear time algorithm that sorts a given list of A and B characters so that all A characters
     * come before B characters. The algorithm must run in one pass and NOT use extra memory except for
     * two indices i and j.  Hint: modify the "partition" method of quicksort;
     * you do not need to use a pivot in this case.
     * @param letters array that contains A and B characters in any order.
     */
    public void sortAB(String[] letters) {
        // FILL IN CODE


    }

    /**
     * Suppose some city has n people, and these people need to vote to select a mayor of the city. There are three candidates for a mayor: "A",  "B" and "C".  We are given an array of n Strings where each element represents a vote for either candidate "A" or candidate "B", or candidate "C". For the purpose of this problem, let's assume there is a clear winner (so one candidate has more votes than the other two).
     * Design and implement (in Java) an in-place algorithm for sorting this array and determining who wins the election, "A", "B" or "C".
     * Example: if we are given the following array that represents votes of 11 people:
     *             ["A", "B", "A", "C", "A", "A", "A", "B", "C", "A", "B"],
     *     your method should return "A" and change the array so that it is sorted:
     *             ["A", "A", "A", "A", "A", "A", "B", "B", "B",  "C", "C"]
     *  The algorithm must satisfy the following requirements:
     - Use the variation of the partition method of quicksort)
     - Should run in linear time
     - Use no extra memory (except for two integer indices and a tmp variable for swapping).
     - Run in two passes
     * Important: Do NOT just iterate over the array and count the number of "A"s, "B"s and "C"s  - such solutions will get 0 points.
     * Do NOT use counting sort. Instead, this of how you can modify the algorithm you wrote in sortAB.
     *
     * @param votes input array of votes
     * @return winner
     */
    public String sortAndFindWinner (String[] votes) {
        // FILL IN CODE

        return ""; // change
    }

    /**
     * Sorts a sub-array of records using bucket sort.
     * @param array array of "records" (see class Elem)
     * @param lowindex the beginning index of the sublist to sort
     * @param highindex the end index of the sublist to sort, inclusive
     */
    public void bucketSort(Elem[] array, int lowindex, int highindex) {
        // FILL IN CODE
        // You may use a built in class LinkedList in java to store a list for each bucket.

    }

}
