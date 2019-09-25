package linear_progs;
//1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

public class Lin1 {
    public static void task(double x, double y) {
        double sum = x+y;
        double sub = x-y;
        double mult = x*y;
        double div = x/y;
        System.out.println(sum + " " + sub + " " + mult + " " + div);
    }
}
