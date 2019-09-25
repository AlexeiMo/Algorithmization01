package linear_progs;
//21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную
// и целую части числа и вывести полученное значение числа.

public class Lin21 {
    public static void task(double x) {
        String num = Double.toString(x);
        StringBuilder numUpd = new StringBuilder(7);
        numUpd.append(num.charAt(4));
        numUpd.append(num.charAt(5));
        numUpd.append(num.charAt(6));
        numUpd.append(num.charAt(3));
        numUpd.append(num.charAt(0));
        numUpd.append(num.charAt(1));
        numUpd.append(num.charAt(2));
        System.out.println(numUpd.toString());
    }
}
