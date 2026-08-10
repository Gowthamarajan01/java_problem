import java.util.*;

class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        String smallest = s;

        queue.offer(s);
        visited.add(s);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }

            // Operation 1: Add 'a' to odd indices
            String added = addOperation(curr, a);
            if (visited.add(added)) {
                queue.offer(added);
            }

            // Operation 2: Rotate right by 'b'
            String rotated = rotateOperation(curr, b);
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }
        return smallest;
    }

    // Adds 'a' to digits at odd indices
    private String addOperation(String s, int a) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            int newVal = (arr[i] - '0' + a) % 10;
            arr[i] = (char) (newVal + '0');
        }
        return new String(arr);
    }

    // Rotates string to the right by b positions
    private String rotateOperation(String s, int b) {
        int n = s.length();
        b = b % n;
        return s.substring(n - b) + s.substring(0, n - b);
    }
}