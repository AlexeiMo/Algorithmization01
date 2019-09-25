public class Lin8 {
    public static void task(double a, double b, double c) {
        double res = (b + Math.sqrt(Math.pow(b,2)+4*a*c)) - Math.pow(a,3)*c + Math.pow(b,-2);
        System.out.println(res);
    }
}
