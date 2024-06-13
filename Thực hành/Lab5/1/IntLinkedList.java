import java.util.*;
public class IntLinkedList implements ListInterface{
    private Node head;
    private int numNode=0;
    public IntLinkedList()
    {
        this.head=null;
    }

    @Override
    public void addFirst(int data)
    {
        head=new Node(data,head);
        numNode++;

    }
    @Override
    public boolean addLast(int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.getData()==data)
            {
                return false;
            }
            temp=temp.getNext();
        }
        Node newNode=head;
        while(newNode.getNext()!=null)
        {
            newNode=newNode.getNext();
        }
        newNode.setNext(new Node(data,null));
        numNode++;
        return true;
    }
    @Override
    public boolean removeAt(int position)
    {
        if(position>numNode)
        {
            return false;
        }
        else{
            Node temp=head;
            Node delNode=temp.getNext();
            int count=1;
            while(count<position && temp!=null)
            {
                delNode=temp;
                temp=temp.getNext();
                count++;
            }   
            delNode.setNext(temp.getNext());
            numNode--;
            return true;
        }
    }
    @Override
    public int countOdd()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            if(temp.getData()%2==1)
            {
                count++;
            }
            temp=temp.getNext();
        }
        return count;
    }
    @Override
    public int searchKey(int key)
    {
        int position=1;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.getData()==key)
            {
                return position;
            }
            else{
                position++;
            }
            temp=temp.getNext();
        }
        return -1;
    }
    @Override
    public boolean checkSorted()
    {
        Node tmp=head;
        if(tmp.getData()<=tmp.getNext().getData())
        {
            while(tmp.getNext()!=null)
            {
            if(tmp.getData()>tmp.getNext().getData())
            {
                return false;
            }
            tmp=tmp.getNext();
            }
            return true;
        }
        else{
            while(tmp.getNext()!=null)
            {
            if(tmp.getData()<tmp.getNext().getData())
            {
                return false;
            }
            tmp=tmp.getNext();
            }
            return true;
        }
        
    }
    public void print(){
        if(head != null){
            Node tmp = head;
            System.out.print("List: " + tmp.getData());
            tmp = tmp.getNext();
            while(tmp != null)
            {
                System.out.print(" -> " + tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println();
        }
        else{
            System.out.println("List is empty!");
        }
    }

}