package linear_progs;
//39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме
//умножения, сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.

public class Lin39 {
    public static void task(double x) {
        double res = 6 - 5*x;
        double origX = x;
        x *= x;
        res = res + 4*x;
        x *= origX;
        res = res - 3*x;
        x *= origX;
        res = res + 2*x;
        System.out.println(res);
    }
}
