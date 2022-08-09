package cn.tedu.min;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class nn {
    public static void main(String[] args) {
/*        int[]  arr = {22,11,4,33,66,32};

        System.out.println("===============");
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int tep  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tep;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }*/

        int[]  arr  = new int[10000];
        Random random =  new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(1999)+1;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int tep  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tep;

                }

            }
            System.out.println("====="+i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
