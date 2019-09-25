package linear_progs;
//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Lin9 {
    public static void task(double a, double b, double c, double d) {
        double res = (a/c) * (b/d) - (a*b-c)/(c*d);
        System.out.println(res);
    }
}
