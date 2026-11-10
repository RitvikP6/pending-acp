
import java.util.*;

public class PalindromePartition {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void findPartitions(
        String s, int start,
        ArrayList<String> current,
        ArrayList<ArrayList<String>> result) {

        // Base condition
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Checking all possible substrings
        for (int end = start + 1; end <= s.length(); end++) {

            String sub = s.substring(start, end);

            if (isPalindrome(sub)) {

                current.add(sub);

                findPartitions(s, end, current, result);

                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        ArrayList<String> current = new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        findPartitions(s, 0, current, result);

        System.out.println("Palindrome partitions:");

        System.out.println(result);

        sc.close();
    }
}
