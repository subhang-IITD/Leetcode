class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = kthsmallest(nums,k);
        return result;
    }
    public static int kthsmallest(int[] arr, int k) {
        int size = arr.length;
        PriorityQueue<Integer> minh = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {
            minh.add(arr[i]); // Add element to Max-Heap
            
            if (minh.size() > k) {
                minh.poll(); // Remove the largest element when heap size exceeds k
            }
        }
        return minh.peek(); // Kth smallest element is at the top of the heap
    }
}