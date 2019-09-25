package linear_progs;
//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел

public class Lin17 {
    public static void task(int a, int b) {
        double ar = (Math.pow(a,3) + Math.pow(b,3))/2;
        double gm = Math.sqrt(Math.abs(a) * Math.abs(b));
        System.out.println(ar + " " + gm);
    }
}
