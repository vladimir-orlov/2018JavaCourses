package Homework_2018_10_09_ATM;

public class Money {
    private int den20; // кол-во купюр номиналом 20
    private int den50; // кол-во купюр номиналом 50
    private int den100; // кол-во купюр номиналом 100
    private int sum; // общая доступная сумма денег

    public int getDen20() {
        return den20;
    }

    public void setDen20(int den20) {
        this.den20 = den20;
    }

    public int getDen50() {
        return den50;
    }

    public void setDen50(int den50) {
        this.den50 = den50;
    }

    public int getDen100() {
        return den100;
    }

    public void setDen100(int den100) {
        this.den100 = den100;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void MoneyStart (int x20, int x50, int x100){  // задаём начальное кол-во купюр в банкомате
        setDen20(x20);
        setDen50(x50);
        setDen100(x100);
    }

    public void AddMoney (int add20, int add50, int add100){  // добавляем купюры в банкомат
        setDen20(getDen20()+add20);
        setDen50(getDen50()+add50);
        setDen100(getDen100()+add100);
        setSum(getDen20()*20+getDen50()*50+getDen100()*100);
        System.out.println("Купюр номиналом 20: "+getDen20()+". Купюр номиналом 50: "+getDen50()+". Купюр номиналом 100: "+getDen100());
        System.out.println("Доступная сумма: " + getSum());
    }

}
