import java.util.*;

public class StudentManagement {
    private AVL tree;
    private Stack<Node> undoState;
    private Stack<Node> redoState;

    public StudentManagement() {
        this.tree = new AVL();
        this.undoState = new Stack<Node>();
        this.redoState = new Stack<Node>();
    }

    public AVL getTree() {
        return this.tree;
    }

    public static Node copyleftright(Node root, Map<Node, Node> map)
    {
        if (root == null) 
            return null; 
        Node copyroot = new Node(root.getData());
        map.put(root, copyroot);
        copyroot.setLeft(copyleftright(root.getLeft(), map));
        copyroot.setRight(copyleftright(root.getRight(), map));
        copyroot.setHeight(root.getHeight());
        return copyroot;
    }

    public static Node copytree(Node root)
    {
        if (root == null) 
            return null; 
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node newtree = copyleftright(root, map);
        return newtree;
    }
    
    // Requirement 1
    public boolean addStudent(Student st) 
    {
        // code here
        if(!this.tree.contain(st.getId()))
        {
            Node newtree = copytree(this.tree.getRoot());
            undoState.push(newtree);
            this.tree.insert(st);
            return true;
        }
        return false;
    }

    // Requirement 2
    public Student searchStudentById(int id) 
    {
        // code here
        if(!this.tree.contain(id))
            return null;
        return this.tree.search(id).getData();
    }

    //Requirement 3
    public boolean removeStudent(int id) 
    {
        //code here
        if(this.tree.contain(id)) 
        {
            Node newtree = copytree(this.tree.getRoot());
            undoState.push(newtree);
            this.tree.delete(this.tree.search(id).getData());
            
            return true;
        }
        return false;
    }

    // Requirement 4
    public void undo() 
    {
        //code here
        Node tmp = this.undoState.pop();
        if(!this.undoState.isEmpty())  
        {
            this.redoState.push(this.tree.getRoot());
            this.tree.setRoot(tmp);
        }           
        else
        {
            this.tree.setRoot(null);
        }    
    }

    // Requirement 5
    public void redo() 
    {
        // code here
        if(this.redoState.isEmpty()) 
            return;
        Node tmp = this.redoState.pop();
        this.tree.setRoot(tmp);
    }

    //Requirement 6
    private ScoreAVL score = new ScoreAVL();
    public ScoreAVL scoreTree(AVL tree) {
        // code here
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            if (tmp.getLeft() != null)
                queue.add(tmp.getLeft());
            if (tmp.getRight() != null)
                queue.add(tmp.getRight());
            score.insert(tmp.getData());
        }
        return score;
    }
}