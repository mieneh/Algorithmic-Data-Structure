public class Test{
    public static void main(String[] args) {
        IntLinkedList list=new IntLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(7);
        
        System.out.println("Them vao cuoi danh sach:"+list.addLast(0));
        list.print();
    
        System.out.println("Xoa tai vi tri so 2:"+list.removeAt(2));
        list.print();
        System.out.println("Dem so le:"+list.countOdd());
        System.out.println("tim vi tri co key=7 posivite=:"+list.searchKey(7));
        list.print();
        System.out.println("checkSorted:"+list.checkSorted());
        
    }
}