public class Test {

    public static BST createTree(String strKey) {
        String[] keys = strKey.split(" ");
        BST tree = new BST();

        for (int i = 0; i < keys.length; i++) {
            tree.insertNode(Integer.valueOf(keys[i]));
        }

        return tree;
    }

    public static void main(String[] args) {
        // ex1
        System.out.println("bai 1: ");
        BST tree = new BST();

        tree.insertNode(40);
        tree.insertNode(25);
        tree.insertNode(10);
        tree.insertNode(32);
        tree.insertNode(78);

        System.out.println("pre oder: ");
        tree.printPreOder();
        System.out.println("in oder: ");
        tree.printInOder();
        System.out.println("post oder: ");
        tree.printPostOder();

        // ex2
        System.out.println("bai 2: ");
        String strKey = "45 25 78 10 3 17 32 30 38 50 93";
        BST tree2 = createTree(strKey);
        System.out.println("string la: " + strKey);
        System.out.println("tree: ");
        tree2.printPostOder();

        // ex3
        System.out.println("bai 3: ");
        System.out.println("tang dan: ");
        tree2.printInOder();

        // ex4
        System.out.println("bai 4: ");
        System.out.println("giam dan: ");
        tree2.printDecendingOder();

        // ex5
        System.out.println("bai 5: ");
        int key = 11;
        boolean isContain = tree2.constains(key);
        System.out.println("key: " + key);
        System.out.println("function contains: " + isContain);

        // ex6
        System.out.println("bai 6: ");
        System.out.println("truoc khi xoa max: ");
        tree2.printPreOder();
        tree2.deleteMax();
        System.out.println("sau khi xoa max: ");
        tree2.printPreOder();

        // ex7
        System.out.println("bai 7: ");
        key = 32;

        System.out.println("truoc khi xoa " + key);
        tree2.printPreOder();

        tree2.delete_pre(key);
        // tree2.delete(key);

        System.out.println("sau khi xoa " + key);
        tree2.printPreOder();

        // ex8
        System.out.println("bai 8: ");
        System.out.println("height = " + tree2.height());

        // ex9
        System.out.println("bai 9: ");
        key = 25;
        System.out.println("node subtree: " + key);
        System.out.println("tong subtree: " + tree2.sum(tree2.search(key)));

        // ex10
        System.out.println("bai 10: ");
        System.out.println("tong tree: " + tree2.sum());
    }

}
