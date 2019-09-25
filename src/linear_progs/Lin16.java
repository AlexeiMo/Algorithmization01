package linear_progs;
//16. Найти произведение цифр заданного четырехзначного числа.

public class Lin16 {
    public static void task(int x) {
        String num = Integer.toString(x);
        int a = num.charAt(0) - 48;
        int b = num.charAt(1) - 48;
        int c = num.charAt(2) - 48;
        int d = num.charAt(3) - 48;
        int res = a*b*c*d;
        System.out.println(res);
    }
}
