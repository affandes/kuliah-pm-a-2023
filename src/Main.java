public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "OlavThomas";
        mahasiswa1.nim = "12242343242";
        mahasiswa1.jurusan = "Teknik Informatika";

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "OlavRichard";
        mahasiswa2.nim = "12242343243";
        mahasiswa2.jurusan = "Teknik Informatika";

        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nama = "OlavMichelle";
        mahasiswa3.nim = "12242343244";
        mahasiswa3.jurusan = "Teknik Informatika";

        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nama = "OlavChrist";
        mahasiswa4.nim = "12242343245";
        mahasiswa4.jurusan = "Teknik Informatika";

        String[] nama = {"Doni","Citra","Budi","Andi"};
        String[] nim = {"123","124","125","126"};

        Mahasiswa[] daftarMhs = {mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4};

        Mahasiswa temp = daftarMhs[0];
        daftarMhs[0] = daftarMhs[3];
        daftarMhs[3] = temp;


        for (int i = 0; i < daftarMhs.length; i++) {
            System.out.println("==========================");
            System.out.println("Nama: " + daftarMhs[i].nama);
            System.out.println("NIM: " + daftarMhs[i].nim);
            System.out.println("Jurusan: " + daftarMhs[i].jurusan);
        }
        

    }
}
