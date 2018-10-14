package Homework_2018_10_09_ATM;

public class Request {
    boolean answer;

    public boolean AskMoney(Money money, final int request) {
        if (request % 10 != 0) {
            System.out.println("Неверная сумма, пожалуйста, попробуйте ещё раз");
        } else {
            //System.out.println(request);
            if (money.sum()>=request) {
                int[] nominal = {money.getDen20(), money.getDen50(), money.getDen100()}; //массив имеющихся купюр

                int[] count = new int[nominal.length]; //кол-во купюр выдать

                int index = nominal.length - 1;
                int money2 = request;
                while (index != -1) {
                    count[index] = money2/nominal[index];
                    money2 %= nominal[index];
                    index--;
                }
                for (int i = 0; i < count.length; i++) {
                    System.out.println("Номинал в "+nominal[i]+" руб. = "+count[i]+" шт.");
                }
                answer=true;
                System.out.println(true);}
            else {
                System.out.println("Недостаточно средств, пожалуйста, введите другую сумму");
                answer=false;
            }
        }
        return answer;
    }
}