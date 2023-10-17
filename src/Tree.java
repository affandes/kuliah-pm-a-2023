public class Tree {
    public Node root;

    public void cari(int data) {
        if (root != null) {
            root.cari(data);
        }
    }
}
