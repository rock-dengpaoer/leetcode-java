package Chapters01;

/**
 * @author XDT
 * @ClassName Chapters01_03_OddTimeNum
 * @Description: 找出数组中出现奇数次的数
 * @Date 2023/6/15 21:18
 **/
public class Chapters01_03_OddTimeNum {

    /* * @Author XDT
     * @Description 给出一个数组，里边只有一个数出现的次数为奇数次，其余数出现的次数为偶数次，找出这个出现奇数次的数
     * @Date 21:22 2023/6/15
     * @Param
     * @return
     */

    public static void OddTimeNum1(int[] arr){
        int eor = 0;
        for (int j : arr) {
            eor ^= j;
        }
        System.out.println(eor);
    }

    /* * @Author XDT
     * @Description 给出一个数组，里边有两个数出现的次数为奇数次，其余数出现的次数为偶数次，找出这两个出现奇数次的数
     * @Date 21:27 2023/6/15
     * @Param
     * @return
     */

    public static void OddTimeNum2(int[] arr){
        int eor = 0;
        for(int curNum : arr){
            eor ^= curNum;
        }
        // eor = a ^ b;
        // eor != 0
        // eor必然有一个位置上是1
        int rightOne = eor & (~eor + 1);

        //eor'
        int onlyOne = 0;
        for(int cur: arr){
            if((cur & rightOne) == 0){
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }

    public static void main(String[] args) {
        //只有一个数的出现次数为奇数次
        int[] arr = new int[]{1, 2, 2, 3, 3, 2, 2, 12, 12, 1, 34};
        OddTimeNum1(arr);

        int[] arr2 = new int[]{1, 2, 2, 3, 3, 2, 2, 12, 12, 1, 34, 23, 23, 23};
        OddTimeNum2(arr2);
    }
}
