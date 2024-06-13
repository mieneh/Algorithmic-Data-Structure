class Node {

    Integer key;
    Node left, right;
    int height;

    Node(Integer key) {
        this.key = key;
        this.height = 0;
        this.left = this.right = null;
    }
}