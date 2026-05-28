import java.util.*;

public class StockSpan {

    // Pair class
    static class Pair {
        int ele;
        int idx;

        Pair(int ele, int idx) {
            this.ele = ele;
            this.idx = idx;
        }
    }

    // Function to calculate stock span
    public static ArrayList<Integer> calculateSpan(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<Pair> st = new Stack<>();

        int n = arr.length;

        // First element span is always 1
        ans.add(1);

        Pair p1 = new Pair(arr[0], 0);
        st.push(p1);

        for (int i = 1; i < n; i++) {

            int ele = arr[i];

            if (st.peek().ele > ele) {

                ans.add(1);

            } else {

                while (st.size() > 0 && st.peek().ele <= ele) {
                    st.pop();
                }

                if (st.size() == 0) {
                    ans.add(i + 1);
                } else {
                    ans.add(i - st.peek().idx);
                }
            }

            Pair p2 = new Pair(ele, i);
            st.push(p2);
        }

        return ans;
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = calculateSpan(arr);

        System.out.println("Stock Span Values:");

        for (int span : result) {
            System.out.print(span + " ");
        }

        sc.close();
    }
}