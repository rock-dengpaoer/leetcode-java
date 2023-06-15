package Chapters01;

import java.util.Arrays;

/**
 * @author XDT
 * @ClassName SelectSort
 * @Description: 选择排序的实现
 * @Date 2023/6/15 19:58
 **/
public class Chapters1_01_SelectSort {
    public static void selectSot(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i +1; j <arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
            System.out.println(Arrays.toString(arr));
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 12, 34, 12 ,314, 12, 123};
        selectSot(arr);
    }
}
