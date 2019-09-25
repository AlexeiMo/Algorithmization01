public class Lin21 {
    public static void task(double x) {
        String num = Double.toString(x);
        char temp;
        StringBuffer numUpd = new StringBuffer(7);
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
