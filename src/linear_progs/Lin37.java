package linear_progs;
//37. Составить линейную программу, печатающую значение true, если указанное высказывание является
//истинным, и false — в противном случае

public class Lin37 {
    //Целое число N является четным двузначным числом.
    public static void task1(int n) {
        String num = Integer.toString(n);
        if(n%2 == 0 && num.length() == 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
    public static void task2(int x) {
        String num = Integer.toString(x);
        if((num.charAt(0) + num.charAt(1)) == (num.charAt(2) + num.charAt(3))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //Сумма цифр данного трехзначного числа N является четным числом.
    public static void task3(int n) {
        String num = Integer.toString(n);
        int sum = num.charAt(0) + num.charAt(1) + num.charAt(2);
        if(sum%2 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n
    //(m<n).
    public static void task4(int x, int y, int m, int n) {
        if(x>=m && x<=n) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
    public static void task5(int x) {
        String num = Integer.toString(x);
        byte digit1 = (byte)(num.charAt(0)-48);
        byte digit2 = (byte)(num.charAt(1)-48);
        byte digit3 = (byte)(num.charAt(2)-48);
        byte sum = (byte)(digit1 + digit2 + digit3);
        if(Math.pow(x, 2) == Math.pow(sum, 3)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    //Треугольник со сторонами а,b,с является равнобедренным.
    public static void task6(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
    public static void task7(int x) {
        String num = Integer.toString(x);
        byte digit1 = (byte)(num.charAt(0)-48);
        byte digit2 = (byte)(num.charAt(1)-48);
        byte digit3 = (byte)(num.charAt(2)-48);
        if((byte)(digit1+digit2) == digit3 ||
                (byte)(digit2+digit3) == digit1 ||
                (byte)(digit1+digit3) == digit2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //Заданное число N является степенью числа а (показатель степени может находиться в диапазоне
    //от 0 до 4).
    public static void task8(int a, int n) {
        if (Math.pow(a,0) == n
                || Math.pow(a,1) == n
                || Math.pow(a,2) == n
                || Math.pow(a,3) == n
                || Math.pow(a,4) == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    //График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
    public static void task9(int a, int b, int c, int m, int n) {
        if ((a * Math.pow(m,2) + b * m + c) == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}