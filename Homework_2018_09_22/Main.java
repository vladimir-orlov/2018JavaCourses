package Homework_2018_09_22;

public class Main {

    public static void main(String[] args) {
	int hstart=9;
	int mstart=30;
	int harrival=10;
	int marrival=0;
	if (hstart==harrival&&mstart==marrival)
        {
            System.out.println("Ученик пришёл вовремя");
        }
    else if (hstart>harrival||mstart>marrival)
        {
            int hearly=Math.abs(hstart-harrival);
            int mearly=Math.abs(mstart-marrival);
            System.out.println("Ученик пришел заранее на "+hearly+" часов "+mearly+" минут.");
        }
    else if (hstart<harrival||mstart<marrival)
        {
            int hlate=Math.abs(harrival-hstart);
            int mlate=Math.abs(marrival-mstart);
            System.out.println("Ученик опоздал на "+hlate+" часов "+mlate+" минут.");
        }
    }
}
