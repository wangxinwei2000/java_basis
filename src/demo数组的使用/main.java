package demo数组的使用;

import java.lang.reflect.Array;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[] arr = {23,54,64,13,53,675};
        sortArr(arr,false);
        printArr(arr);
//        java数组转换为string
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArr(int[] arr,boolean flag){
        for(int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(flag){
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                else {
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
