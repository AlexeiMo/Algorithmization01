public class Lin29 {
    public static void task(int a, int b, int c) {
        double angle1Deg = Math.acos((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2))/(2*b*c));
        double angle1Rad = Math.toRadians(angle1Deg);
        double angle2Deg = Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2))/(2*a*c));
        double angle2Rad = Math.toRadians(angle2Deg);
        double angle3Deg = 180 - angle1Deg - angle2Deg;
        double angle3Rad = Math.toRadians(angle3Deg);
        System.out.println(angle1Deg + " " + angle1Rad + "\n" +
                           angle2Deg + " " + angle2Rad + "\n" +
                           angle3Deg + " " + angle3Rad);
    }
}
