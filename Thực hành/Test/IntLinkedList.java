class IntLinkedList {

    private Node head;

    public IntLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void addFirst(int data) {
        head = new Node(data, head);
    }

    public boolean addLast(int data) {

        if (head == null) {
            addFirst(data);
            return true;
        }
        Node current = head;
        Node pre = head;
        while(current != null) {
            if (current.getData() == data) {
                return false;
            }

            pre = current;
            current = current.getNext();
        }

        Node lastNode = new Node(data, null);
        pre.setNext(lastNode);
        return true;
    }
}