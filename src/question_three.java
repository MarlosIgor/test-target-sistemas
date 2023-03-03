public class question_three {

    public static void main(String[] args) {

        //A
        int[] a = {1, 3, 5, 7};
        int nextElement = a[a.length - 1] + 2;
        System.out.println(nextElement);

        //B
        int[] b = {2, 4, 8, 16, 32, 64};
        int nextElement1 = b[b.length - 1] * 2;
        System.out.println(nextElement1);

        //C
        int[] c = {0, 1, 4, 9, 16, 25, 36};
        int nextElement2 = c[c.length - 1] + 2*(c.length+1);
        System.out.println(nextElement2);

        //D
        int[] d = {4, 16, 36, 64};
        int nextElement3 = d[d.length - 1] + 1;
        while (nextElement3 % 2 == 0) {
            nextElement3 += 1;
        }
        System.out.println(nextElement3);

        //E
        int[] e = {1, 1, 2, 3, 5, 8};
        int nextElement4 = e[e.length - 1] + e[e.length - 2];
        System.out.println(nextElement4);

        //F
        int[] f = {2, 10, 12, 16, 17, 18, 19};
        int nextElement5 = f[f.length - 1] + 1;
        System.out.println(nextElement5);
    }
}
/*
A) 9
B) 128
C) 52
D) 65
E) 13
F) 20
 */