package com.yhxsr.util;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author pyh
 * @date 2019/12/27
 */
public class SearchUtil {
    public static void main(String[] args) {
        int[] arr = {2,4,23,1,66,5,6,8,11,78};
        /**
         * 不使用递归二分查找
         */
//        int num = commonBinarySearch(arr,4);
        /**
         * 递归二分查找
         */
//        int num = recursionBinarySearch(arr,1,0,arr.length-1);
//        System.out.println("数组下标为："+num+",数字为："+arr[num]);
        /**
         * 冒泡排序
         */
        int[] numbers = bubbleSort(arr);
        for(int i:numbers){
            System.out.println(i);
        }
    }

    /**
     * 使用递归查找
     * @param arr  有序数组
     * @param key 待查找关键字
     * @param low
     * @param high
     * @return  找到的位置
     */
    public static int recursionBinarySearch(int[] arr,int key,int low,int high){
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle = (low+high)/2;
        if(arr[middle] > key){
            return recursionBinarySearch(arr,key,low,middle-1);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr,key,middle+1,high);
        }else{
            return middle;
        }
    }

    /**
     * 不使用递归的二分查找
     * @param arr
     * @param key
     * @return
     */
    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int middle = 0;
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low+high)/2;
            if(arr[middle] > key){
                high = middle - 1;
            }else if(arr[middle] < key){
                low = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
