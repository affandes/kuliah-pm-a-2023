public class Pangkat {
    public static void main(String[] args) {

        int hasil = pangkat(5,4);
        System.out.println("Hasil = " + hasil);

    }

    // 5 ^ 2 = 25
    public static int pangkat(int x, int y) {
        if (y > 0) {
            return x * pangkat(x, y - 1);
        } else {
            return 1;
        }
    }
}
