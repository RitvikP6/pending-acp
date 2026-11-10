public class no4 {

    public static int findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number >= largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.println("Second-largest element: " + findSecondLargest(numbers));
    }
}
