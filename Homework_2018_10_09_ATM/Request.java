package Homework_2018_10_09_ATM;

public class Request {
    Money m = new Money();
    boolean answer;

    public boolean AskMoney(int request) {  // процесс снятия заданной суммы денег.
        if (request % 10 != 0) {                 // В функции на вход - количество денег, на выход - булевское значение.
            System.out.println("Неверная сумма, пожалуйста, попробуйте ещё раз");
        } else {
            //System.out.println(request);
            if (m.getSum()>=request) {// в строке 13-14 при использовании get передаются 0
                /*int[] nominal = {m.getDen20(), m.getDen50(), m.getDen100()}; //массив имеющихся купюр
                int[] count = new int[nominal.length]; //кол-во купюр выдать
                int index = nominal.length - 1;
                int money = request;
                while (index != -1) {
                    count[index] = money/nominal[index];
                    money %= nominal[index];
                    index--;
                }
                for (int i = 0; i < count.length; i++) {
                    System.out.println("Номинал в "+nominal[i]+" руб. = "+count[i]+" шт.");
                }*/
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