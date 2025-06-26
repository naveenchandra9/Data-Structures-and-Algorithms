package com.leetcodequestions;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in descending part of mountain array, we have to shift end towards left
                end = mid;
            } else {
                // we are in ascending part of mountain array, we have to shift start towards right
                start = mid + 1;
            }
        }
        return start;
    }
}
