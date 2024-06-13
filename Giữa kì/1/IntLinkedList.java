class IntLinkedList implements ListInterface {
  private Node head;

  IntLinkedList() { head = null; }

  public Node getHead() { return head; }

  public void addFirst(int data) { head = new Node(data, head); }

  public boolean isOnlyEven() {
    Node current = head;
    while (current != null) {
      if (current.getData() % 2 == 0) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public boolean addAfterFirstKey(int data, int key) {
    if (!isOnlyEven()) {
      return false;
    }

    Node current = head;
    while (current != null) {
      if (current.getData() == key) {
        Node nextCurrent = current.getNext();
        Node dataNode = new Node(data, nextCurrent);

        current.setNext(dataNode);
        return true;
      }

      current = current.getNext();
    }
    return false;
  }

  public void print() {
    Node current = head;
    while (current != null) {
      System.out.print(current.getData() + " -> ");
      current = current.getNext();
    }

    System.out.println("");
  }

  public static void main(String[] argsStrings) {
    IntLinkedList ls = new IntLinkedList();
    ls.addFirst(6);
    ls.addFirst(3);
    ls.addFirst(5);
    ls.addFirst(2);

    ls.print();
    ls.addAfterFirstKey(7, 5);
    ls.print();
  }
}
