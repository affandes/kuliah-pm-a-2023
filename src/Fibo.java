public class Fibo {
    public static void main(String[] args) {

        int hasil = F(10);
        System.out.println("Hasil = " + hasil);

    }

    public static int F(int n) {
        if (n > 1) {
            return F(n-1) + F(n-2);
        } if (n == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
