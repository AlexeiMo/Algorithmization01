package linear_progs;
//18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба

public class Lin18 {
    public static void task(int a) {
        int faceS = a*a;
        int fullS = faceS * 6;
        int v = faceS * a;
        System.out.println(faceS + " " + fullS + " " + v);
    }
}
