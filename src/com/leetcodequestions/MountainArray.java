//package com.leetcodequestions;
//
////https://leetcode.com/problems/find-in-mountain-array/description/
//public class MountainArray {
//    public static void main(String[] args) {
//
//    }
//
//    static int findInMountainArray(int target, MountainArray mountainArr) {
//        //find peak element in array
//        int peakElement = peakElementInArray(mountainArr);
//        // do binary search from 0 till peak element
//        int a = binarySearch(mountainArr, target, 0, peakElement);
//        //do binary search from peak element till array length
//        int b = binarySearch(mountainArr, target, peakElement, mountainArr.length());
//
//        return Math.min(a, b);
//    }
//
//    static int peakElementInArray(MountainArray mountainArr) {
//        int start = 0;
//        int end = mountainArr.length();
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
//                end = mid;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//
//    static int binarySearch(MountainArray mountainArr, int target, int start, int end) {
//        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (mountainArr.get(mid) == target) {
//                return mid;
//            }
//            if (isAsc) {
//                if (mountainArr.get(mid) > target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (mountainArr.get(mid) < target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
