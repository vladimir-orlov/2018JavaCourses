package Homework_2018_09_29;

import java.util.Random;

public class Task02 {
    public static void main (String [] args){
        Random r=new Random();
        int array[] = new int [10];
        for(int i=0; i<array.length; i++){
            array[i]=r.nextInt(201) - 100;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max=array[0];
        for(int i=1; i<array.length; i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.print(max);
    }
}
