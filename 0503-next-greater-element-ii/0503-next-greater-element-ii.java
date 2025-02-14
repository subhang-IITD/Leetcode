class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int[] newNums = new int[2*size];
        for(int i = 0; i < 2*size;i++){
            newNums[i] = nums[i%size];
        }
        int[] result = NGE(newNums);
        int[] result_final = new int[size];
        for(int i = 0; i < size;i++){
            result_final[i] = result[i];
        }
        return result_final;
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