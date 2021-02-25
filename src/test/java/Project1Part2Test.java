import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import sorting.Elem;
import sorting.SortingImplementationII;

public class Project1Part2Test {
    public final static int NUM_ITERS = 10; // how many times to test it

    @Test
    public void testSortAB() {
        String[] letters = {"A", "B", "A", "A", "B", "A", "B", "B", "A", "B", "B"};
        SortingImplementationII listSorter = new SortingImplementationII();
        listSorter.sortAB(letters);

        String[] expected = {"A", "A", "A", "A", "A", "B", "B", "B", "B", "B", "B"};
        Assert.assertEquals("The size of the list after sorting is wrong", letters.length, expected.length);
        for (int i = 0; i < expected. length; i++)
            Assert.assertEquals("Expected and actual results do not match", letters[i], expected[i]);

    }

    @Test
    public void testSortAndFindWinner() {
        String[] votes1 = { "A", "B", "A", "C", "A", "A", "A", "B", "C", "A", "B"};
        SortingImplementationII listSorter = new SortingImplementationII();
        String res = listSorter.sortAndFindWinner(votes1);
        Assert.assertEquals("The winner for the array votes1  was supposed to be \"A\".", "A", res);

        String[] votes2 = { "C", "B", "B", "A", "B", "C", "C", "A", "B", "A", "B", "C", "A", "A", "B", "C", "A", "B"};
        String res2 = listSorter.sortAndFindWinner(votes2);
        Assert.assertEquals("The winner for the array votes2  was supposed to be \"B\".", "B", res2);
    }

    @Test
    public void testBucketSort() {
        int n = 15;
        SortingImplementationII listSorter = new SortingImplementationII();
        Elem[] arr = new Elem[n];
        Random r = new Random();
        for (int i = 0; i < NUM_ITERS; i++) {
            int lowindex = r.nextInt(arr.length / 2);
            int highindex = arr.length / 2 + r.nextInt(arr.length / 2);
            for (int j = 0; j < n; j++) {
                int key = r.nextInt(40);
                int data = r.nextInt(1000);
                arr[j] = new Elem(key, data);
            }
            listSorter.bucketSort(arr, lowindex, highindex);

            if (!areElemsSorted(arr, lowindex, highindex)) {
                System.out.println("In Bucket Sort Test: Not sorted correctly");
                for (Elem rr : arr) {
                    System.out.print(rr.key() + " ");
                }
                System.out.println();
                System.out.println("Testing for range: low = " + lowindex + " high = " + highindex);

                Assert.fail("Bucket sort test failed.");
            }

        }
    }

    /** Helper method for bucket sort.
     * Checks if the subarray (from startIndex to endIndex)
     * of records is sorted by key in ascending order.
     * @param arr array of records (of type Elem)
     * @param startIndex the starting index of a subarray
     * @param endIndex the end index of a subarray
     * @return true if sorted
     */
    private static boolean areElemsSorted(Elem[] arr, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            if (!(arr[i].key() <= arr[i + 1].key())) {
                return false;
            }
        }
        return true;
    }

}
