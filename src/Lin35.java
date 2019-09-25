public class Lin35 {
    public static void task(double m, double n) {
        double res = m / n;
        String intNum = Integer.toString((int) res);
        String fracNum = Double.toString(res - (int) res);
        System.out.println(fracNum.charAt(2) + " " + intNum.charAt(intNum.length()-1));
    }
}
