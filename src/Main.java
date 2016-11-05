public class Main {

    public static void main(String[] args) {
        int a = 15 - 1;
        int b = -a + 48;
        int c = 14 +b;
        int d = 128 - c;

        int e = (a <= b +d) ? 0 : (a/b);
        int f = (c > d - b - a) ? 0 : (d/c+b);

        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        System.out.println("d=" +d);
        System.out.println("a/b=" +e);
        System.out.println("d/c+b =" +f);

    }
}
