package linear_progs;
//13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.

public class Lin13 {
    public static void task(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        double b = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2));
        double c = Math.sqrt(Math.pow(x3,2) + Math.pow(y3,2));
        double P = a+b+c;
        double S = Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("P equals: " + P + ". S equals: " + S);
    }
}
