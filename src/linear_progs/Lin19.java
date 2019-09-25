package linear_progs;
//19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей

public class Lin19 {
    public static void task(int a) {
        double s = (Math.pow(a,2)*Math.sqrt(2))/4;
        double h = Math.sqrt(Math.pow(a,2) - Math.pow(a,2)/4);
        double smallR = a / (2*Math.sqrt(3));
        double bigR = a / Math.sqrt(3);
        System.out.println(s + " " + h + " " + smallR + " " + bigR);
    }
}
