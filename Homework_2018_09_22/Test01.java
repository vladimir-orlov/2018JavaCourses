package Homework_2018_09_22;

public class Test01 {
    public static void main(String[] args) {
        int hstart=9;
        int mstart=30;
        int harrival=20;
        int marrival=42;
        if (hstart==harrival&&mstart==marrival)
        {
            System.out.println("Ученик пришёл вовремя");
        }
        else if (hstart>harrival||mstart>marrival)
        {
            int ns=((hstart*60)+mstart);
            int na=((harrival*60)+marrival);
            int ndif=Math.abs(ns-na);
            if (ndif>=60)
                {int minearly=ndif%60;
                int hourearly=ndif/60;
                System.out.println("Ученик пришел заранее на "+hourearly+" часов "+minearly+" минут.");}
            else
                {
                System.out.println("Ученик пришел заранее на "+"0 часов "+ndif+" минут.");
                }
        }
        else if (hstart<harrival||mstart<marrival)
        {
            int ns=((hstart*60)+mstart);
            int na=((harrival*60)+marrival);
            int ndif=Math.abs(na-ns);
            if (ndif>=60)
                {int minlate=ndif%60;
                 int hourlate=ndif/60;
                 System.out.println("Ученик опоздал на "+hourlate+" часов "+minlate+" минут.");}
            else
                {
                System.out.println("Ученик опоздал на "+"0 часов "+ndif+" минут.");}
                }
    }
}
