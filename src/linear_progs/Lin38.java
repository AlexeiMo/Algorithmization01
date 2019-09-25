package linear_progs;
//38. Для данных областей составить линейную программу, которая печатает true, если точка с координатами
//(х, у) принадлежит закрашенной области, и false — в противном случае

public class Lin38 {
    public static void task1(int x, int y) {
        if((y<=4-x || y>=4+x) && y>=0 && y<=4 && x>=-4 && x<=4) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void task2(int x, int y) {
        if((x <= 2 && x >= -2 && y <= 4 && y >= 0)
                || (x <= 4 && x >= -4 && y <= 0 && y >= -3)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void task3(int x, int y) {
        if((x <= 4 && x >= 0 && y <= 4 && y >= 0 && (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= 2))
                || (x <= 5 && x >= 0 && y <= 0 && y >= -4 && (Math.pow(x,2)/25 + Math.pow(y,2)/16) <= 1)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
