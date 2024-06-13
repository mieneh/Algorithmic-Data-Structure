class AVL {

    // Node root;
    private Node root;
    // protected Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(Integer key) {
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
        x = balance(x);
        updateHeight(x);
        return x;
    }

    // pre-oder
    // node - left - right
    private void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            // System.out.print(String.format("[%d, %d]", x.key, x.height));
            NLR(x.left);
            NLR(x.right);
        }
    }

    // in-oder
    // left - node - right
    private void LNR(Node x) {
        if (x != null) {
            LNR(x.left);
            // System.out.print(String.format("[%d, %d]", x.key, x.height));
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
            // System.out.print(String.format("[%d, %d]", x.key, x.height));
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
        root = balance(root);
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
        updateHeight(x);
        x = balance(x);
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

    // private int height(Node x) {
    // if (x == null) {
    // return 0;
    // }
    // return 1 + Math.max(height(x.left), height(x.right));

    // }

    // public int height() {
    // return height(root);
    // }

    public Integer sum(Node x) {
        if (x == null) {
            return 0;
        }

        return x.key + sum(x.left) + sum(x.right);
    }

    public Integer sum() {
        return sum(root);
    }

    AVL() {
        root = null;
    }

    AVL(Integer key) {
        root = new Node(key);

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private int checkBalance(Node x) {
        return height(x.left) - height(x.right);
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        y.right = x;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private void updateHeight(Node node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }

    private Node balance(Node x) {
        // if (checkBalance(x) < -1) {
        // if (checkBalance(x.right) > 0) {
        // x.right = rotateRight(x.right);
        // }
        // x = rotateLeft(x);
        // } else if (checkBalance(x) > 1) {
        // if (checkBalance(x.left) < 0) {
        // x.left = rotateLeft(x.left);
        // }
        // x = rotateRight(x);
        // }
        if (checkBalance(x) < -1) {
            if (checkBalance(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        } else if (checkBalance(x) > 1) {
            if (checkBalance(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }

    // @Override
    // public void insert(Integer key) {
    // // TODO Auto-generated method stub
    // super.insert(key);
    // updateHeight(root);
    // root = balance(root);
    // }

    // @Override
    // public void delete(Integer key) {
    // // TODO Auto-generated method stub
    // super.delete(key);
    // updateHeight(root);
    // root = balance(root);
    // }
}