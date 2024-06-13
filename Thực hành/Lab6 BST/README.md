# Binary Search Tree (BST)

## what

binary search tree is a data structure whichs extends form binary tree but it has a rule

`x.left.key < x.key < x.right.key`

## create node in bst

```java
public class Node {
    Integer key;
    Node left, right;

    Node(Integer key) {
        this.key = key;
        this.left = this.right = null;
    }
}
```

## insert a node to bst

```java
public Node insert(Node x, Integer key) {
    if(x == null) {
        return new Node(key);
    }

    int cmp = key.compareTo(x.key);

    if (cmp < 0) {
        return insert(x.left, key);
    } else if (cmp > 0) {
        return insert(x.right, key);
    } else {
        // duplicate
        return x.key = key;
    }

    return x;
}
```

## traversal

### pre oder

```java
// Node Left Right
public void NLR(Node x) {
    if (x != null) {
        System.out.println(x.key + "->");
        NLR(x.left);
        NLR(x.right);
    }
}
```

### in oder

```java
// Left Node Right
public void LNR(Node x) {
    if (x != null) {
        LNR(x.left);
        System.out.println(x.key + "->");
        LNR(x.right);
    }
}
```

### post oder

```java
// Left Right Node
public void LRN(Node x) {
    if (x != null) {
        LRN(x.left);
        LRN(x.right);
        System.out.println(x.key + "->");
    }
}
```

## search

```java
public Node search(Node x, Integer key) {
    if(x == null) {
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
```

## find minimum and maximum

```java
public Node min(Node x) {
    if (x.left == null) {
        return x;
    }
    return min(x.left);
}
```

```java
public Node max(Node x) {
    if (x.right == null) {
        return x;
    }
    return max(x.right);
}
```

## delete node minimum

```java
private Node deleteMin(Node x) {
    if (x.left == null) {
        return x.right;
    }
    x.left = deleteMin(x.left);
    return x);
}
```

## delete node

we will have 3 cases when we want to delete a node in bst

1. node to be deleted is a leaf
2. node to be deleted has only one child
3. node to be deleted has two children

in case 1 or 2 simply the node to be deleted with a left or right child node
in case 3 we find the successor of the node to be deleted. Use the successor to replace the node which we want to delete and delete the successor. The successor can be obtained by finding the minimum value in the right child of the node to be deleted

**Node**:
The predecesssor can be obtained by finding the maximum value in the left child of the node to be deleted

```java
private Node delete(Node x, Integer key) {
    if (x == null) return null;

    int cmp = key.compareTo(x.key);
    if (cmp < 0) {
        x.left = delete(x.left, key);
    } else if(cmp > 0) {
        x.right = delete(x.right, key);
    } else {
        // node with only one child or no child
        if (x.left == null) {
            return x.right;
        }
        if (x.right == null) {
            return x.left;
        }

        // node with two children; get the successor (smallest in the right subtree)
        Node t = x;
        x = min(t.right);
        // delete the successor
        x.right = deleteMin(t.right);
        // re-link left subtree to the node which was replaced
        x.left = t.left;
    }
    return x;
}
```
