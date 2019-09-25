package linear_progs;
//36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Lin36 {
    public static void task(int x) {
        String num = Integer.toString(x);
        double evenMult = 1, oddMult = 1;
        int temp;
        for(int i = 0; i <(num.length());i++) {
            temp = num.charAt(i);
            if(temp%2 == 0) {
                evenMult *= (num.charAt(i)-48);
            }
            else {
                oddMult *= (num.charAt(i)-48);
            }
        }
        double res = evenMult/oddMult;
        System.out.println(res);
    }
}
