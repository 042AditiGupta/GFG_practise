class Solution {
    public int peakElement(int[] arr) {
        
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is on right side
                low = mid + 1;
            } else {
                // Peak is on left side or at mid
                high = mid;
            }
        }

        return low;  // or high (both same)
    }
}
