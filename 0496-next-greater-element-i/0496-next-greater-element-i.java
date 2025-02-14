class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] result = NGE(nums2);
         // calculates the nge for all the elements of nums2
        // we have to create a final array which sees the nge value from result for the corresponding nums1 value
        // we could use a dictionary
        Map<Integer, Integer> ngeMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ngeMap.put(nums2[i], result[i]);
        }
        int m = nums1.length;
        int[] result2 = new int[m];
        for (int i = 0; i < m; i++) {
            result2[i] = ngeMap.get(nums1[i]);
        }

        return result2;

    }
    public static int[] NGE(int[] arr) {
		Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }
}