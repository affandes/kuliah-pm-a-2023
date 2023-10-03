public class Rekursi {
    public static void main(String[] args) {

        /**(
         * 0
         * 00
         * 000
         * 0000
         * 00000
         */

        int tinggi = 5;
        cetak(0,0,tinggi);

    }

    public static void cetak(int baris, int kolom, int tinggi) {
        if (baris < tinggi){
            if (kolom <= baris){
                System.out.print("0");
                cetak(baris, kolom+1, tinggi);
            } else {
                System.out.println();
                cetak(baris +1, 0, tinggi);
            }
        }
    }
}



