public class BST {

    // Node root;
    private Node root;

    public BST() {
        root = null;
    }

    public BST(Integer key) {
        root = new Node(key);
    }

    public void insertNode(Integer key) {
        root = insert(root, key);
    }

    private Node insert(Node x, Integer key) {
        if (x == null) {
            return new Node(key);
        }
        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = insert(x.left, key);
        } else if (cmp > 0) {
            x.right = insert(x.right, key);
        } else {
            // duplicate
            x.key = key;
        }
        return x;
    }

    // pre-oder
    // node - left - right
    private void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    // in-oder
    // left - node - right
    private void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
        }
    }

    // post-oder
    // left - right - node
    private void LRN(Node x) {
        if (x != null) {
            LRN(x.left);
            LRN(x.right);
            System.out.print(x.key + " ");
        }
    }

    // decending order
    private void RNL(Node x) {
        if (x != null) {
            RNL(x.right);
            System.out.print(x.key + " ");
            RNL(x.left);
        }
    }

    public Node search(Integer key) {
        return search(root, key);
    }

    private Node search(Node x, Integer key) {
        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return search(x.left, key);
        } else if (cmp > 0) {
            return search(x.right, key);
        } else {
            return x;
        }
    }

    private Node min(Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }

    private Node max(Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }

    public boolean constains(Integer key) {
        return contains(root, key);
    }

    private boolean contains(Node x, Integer key) {
        if (x == null) {
            return false;
        }

        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            return contains(x.right, key);
        } else if (cmp < 0) {
            return contains(x.left, key);
        } else {
            return true;
        }
    }

    public void printPreOder() {
        NLR(root);
        System.out.println("");
    }

    public void printInOder() {
        LNR(root);
        System.out.println("");
    }

    public void printPostOder() {
        LRN(root);
        System.out.println("");
    }

    public void printDecendingOder() {
        RNL(root);
        System.out.println("");
    }

    public void printAscendingOder(BST tree) {
        printInOder();
    }

    public void deleteMax() {
        deleteMax(root);
    }

    private Node deleteMax(Node x) {
        if (x.right == null)
            return x.left;
        x.right = deleteMax(x.right);
        return x;
    }

    public void deleteMin() {
        deleteMin(root);
    }

    private Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    public void delete(Integer key) {
        delete(root, key);
    }

    private Node delete(Node x, Integer key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete(x.left, key);
        } else if (cmp > 0) {
            x.right = delete(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }

            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        return x;
    }

    public void delete_pre(Integer key) {
        // code
        delete_pre(root, key);
    }

    private Node delete_pre(Node x, Integer key) {
        if (x == null)
            return null;

        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = delete_pre(x.left, key);
        } else if (cmp > 0) {
            x.right = delete_pre(x.right, key);
        } else {
            if (x.left == null) {
                return x.right;
            }
            if (x.right == null) {
                return x.left;
            }

            Node t = x;
            x = max(t.left);

            x.left = deleteMax(t.left);

            x.right = t.right;
        }
        return x;
    }

    private int height(Node x) {
        if (x == null) {
            return 0;
        }
        return 1 + Math.max(height(x.left), height(x.right));

    }

    public int height() {
        return height(root);
    }

    public Integer sum(Node x) {
        if (x == null) {
            return 0;
        }

        return x.key + sum(x.left) + sum(x.right);
    }

    public Integer sum() {
        return sum(root);
    }
}
