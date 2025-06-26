package com.leetcodequestions;
//https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class RotaionCountInRotatedList {
    public int findKRotation(List<Integer> arr) {
        if(arr.get(0) < arr.get(arr.size() -1)){
            return 0;
        }
        int pivot = findPeakElement(0,arr.size()-1,arr);
        return pivot+1;
    }

    public int findPeakElement(int start,int end, List<Integer> arr){
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr.get(mid) > arr.get(mid+1)){
                return mid;
            }
            else if(arr.get(mid) < arr.get(mid - 1)){
                return mid - 1;
            }
            else if(arr.get(start) < arr.get(mid)){
                start = mid;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
