package Homework_2018_09_29;

public class Task04 {
    public static void main(String[] args){
        int x =10;
        int sum=0;
        int array[]= new int [x];
        for(int i=0; i<array.length; i++){
            array[i]=i;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0; i<array.length; i++){
            if(array[i]!=0){
                sum += array[i];
            }
        }
        System.out.print("Сумма: "+sum);
    }
}
