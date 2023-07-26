public class Array {
    public static void max(Integer[] arr) {

        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i];
        }
        System.out.println(res);
    }

    public static Integer[] arrInit() {
        Integer[] qwer1 = new Integer[15];

        for (int i = 0; i < qwer1.length; i++) {


            qwer1[i] = new Integer((int) (Math.random() * 100));


        }
        return qwer1;
    }

    public static int Max(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }
}
