public class TowerOfHanoi {
    public static void main(String[] args) {

        cetak(10, "A", "B", "C");

    }

    public static void cetak(int n, String a, String s, String t) {

        if (n > 2) {
            cetak(n-1, a, t, s);
        } else {
            System.out.println(a + " => " + s);
        }

        System.out.println(a + " => " + t);

        if (n > 2) {
            cetak(n-1, s, a, t);
        } else {
            System.out.println(s + " => " + t);
        }

    }
}
