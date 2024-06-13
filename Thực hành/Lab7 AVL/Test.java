public class Test {

    // public static BST createTree(String strKey) {
    // String[] keys = strKey.split(" ");
    // BST tree = new BST();

    // for (int i = 0; i < keys.length; i++) {
    // tree.insertNode(Integer.valueOf(keys[i]));
    // }

    // return tree;
    // }

    public static void main(String[] args) {

        AVL avl = new AVL();
        // avl.insert(3);
        // avl.insert(2);
        // avl.insert(1);
        // avl.insert(6);
        // avl.insert(4);
        // avl.insert(100);

        // avl.insert(102);
        // avl.insert(902);
        // avl.insert(701);
        // avl.insert(702);
        // avl.insert(101);
        // avl.insert(601);
        // avl.insert(101);
        // avl.insert(603);
        // avl.insert(602);
        // avl.insert(601);
        // avl.insert(1101);
        // avl.insert(1001);
        // avl.insert(801);
        // avl.insert(901);
        // avl.insert(501);
        // avl.insert(901);
        // avl.insert(602);
        // avl.insert(802);
        // avl.insert(803);
        // avl.insert(501);

        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        avl.insert(4);
        avl.insert(5);
        avl.insert(6);
        avl.insert(7);
        avl.insert(8);
        avl.insert(9);
        avl.insert(10);
        avl.insert(11);
        avl.insert(12);
        avl.insert(13);
        avl.insert(14);
        avl.insert(15);
        avl.insert(16);
        avl.insert(17);
        avl.insert(18);
        avl.insert(19);
        avl.insert(20);

        // avl.printPreOder();
        // avl.printInOder();
        avl.printPreOder();
        avl.printInOder();
        avl.printPostOder();

        // System.out.println(avl.getRoot().key);

        // // ex1
        // System.out.println("bai 1: ");
        // BST tree = new BST();

        // tree.insertNode(40);
        // tree.insertNode(25);
        // tree.insertNode(10);
        // tree.insertNode(32);
        // tree.insertNode(78);

        // System.out.println("pre oder: ");
        // tree.printPreOder();
        // System.out.println("in oder: ");
        // tree.printInOder();
        // System.out.println("post oder: ");
        // tree.printPostOder();

        // // ex2
        // System.out.println("bai 2: ");
        // String strKey = "45 25 78 10 3 17 32 30 38 50 93";
        // BST tree2 = createTree(strKey);
        // System.out.println("string la: " + strKey);
        // System.out.println("tree: ");
        // tree2.printPostOder();

        // // ex3
        // System.out.println("bai 3: ");
        // System.out.println("tang dan: ");
        // tree2.printInOder();

        // // ex4
        // System.out.println("bai 4: ");
        // System.out.println("giam dan: ");
        // tree2.printDecendingOder();

        // // ex5
        // System.out.println("bai 5: ");
        // int key = 11;
        // boolean isContain = tree2.constains(key);
        // System.out.println("key: " + key);
        // System.out.println("function contains: " + isContain);

        // // ex6
        // System.out.println("bai 6: ");
        // System.out.println("truoc khi xoa max: ");
        // tree2.printPreOder();
        // tree2.deleteMax();
        // System.out.println("sau khi xoa max: ");
        // tree2.printPreOder();

        // // ex7
        // System.out.println("bai 7: ");
        // key = 32;

        // System.out.println("truoc khi xoa " + key);
        // tree2.printPreOder();

        // tree2.delete_pre(key);
        // // tree2.delete(key);

        // System.out.println("sau khi xoa " + key);
        // tree2.printPreOder();

        // // ex8
        // System.out.println("bai 8: ");
        // System.out.println("height = " + tree2.height());

        // // ex9
        // System.out.println("bai 9: ");
        // key = 25;
        // System.out.println("node subtree: " + key);
        // System.out.println("tong subtree: " + tree2.sum(tree2.search(key)));

        // // ex10
        // System.out.println("bai 10: ");
        // System.out.println("tong tree: " + tree2.sum());
    }

}
