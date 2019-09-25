package linear_progs;
//40. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии
//операций.

public class Lin40 {
    public static void task(int x) {
        int res1, res2, origX = x;
        res1 = -2*x;
        res2 = -res1;
        x *= origX;
        res1 += 3*x;
        res2 += 3*x;
        x *= origX;
        res1 -= 4*x;
        res2 += 4*x;
        System.out.println(res1 + " " + res2);
    }
}
