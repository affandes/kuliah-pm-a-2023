public class Node {
    public int data;
    public Node[] children;

    public void cari(int data) {
        if (data == this.data) {
            System.out.println("Ketemu");
        } else {
            for (int i = 0; i < children.length; i++) {
                children[i].cari(data);
            }
        }
    }
}
