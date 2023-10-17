public class AppTree {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new Node();
        tree.root.data = 10;
        tree.root.children = new Node[3];
        tree.root.children[0] = new Node();
        tree.root.children[0].data = 12;
        tree.root.children[1] = new Node();
        tree.root.children[1].data = 14;
        tree.root.children[2] = new Node();
        tree.root.children[2].data = 16;

        tree.cari(15);

    }
}
