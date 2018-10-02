package Homework_2018_09_29;

public class Task03 {
    public static void main (String[] args){
        int x=456;
        int v=0;
        while (x!=0)
        {
            v +=x%10;
            x/=10;
        }
        System.out.print(v);
    }
}
