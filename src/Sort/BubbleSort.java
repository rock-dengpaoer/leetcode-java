package Sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author XDT
 * @ClassName BubbleSort
 * @Description: 冒泡排序
 * @Date 2023/6/15 20:24
 **/
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for(int e = arr.length - 1; e > 0; e--){
            for(int i = 0; i < e; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    //交换arr的i和j位置上的值
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
        bubbleSort(array);
    }
}
