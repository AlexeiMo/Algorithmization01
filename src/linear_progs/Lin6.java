package linear_progs;
//6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
//бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?

public class Lin6 {
    public static void task(int n, int m) {
        double small = 80/n;
        double great = small+12;
        double res = great*m;
        System.out.println(res);
    }
}
