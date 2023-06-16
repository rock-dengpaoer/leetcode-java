package Chapters01;

import java.util.Arrays;

/**
 * @author XDT
 * @ClassName Chapters01_04_InsertionSort
 * @Description: 插入排序的实现
 * @Date 2023/6/15 21:45
 **/
public class Chapters01_04_InsertionSort {

    public static  void insertionSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr, j, j + 1);
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*1000);//0~1乘数1000，内容变为0~1000，强转为整型
        }
        System.out.println(Arrays.toString(array));
        insertionSort(array);
    }
}
