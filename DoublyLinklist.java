import java.util.*;

public class DoublyLinklist
{
    class Node
    {
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    Node head,tail=null;
    
    
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            head.prev=null;
          tail.next=null;
        }
       else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }
    
    public void display()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("ll");
        }
        else
        {
            Node last=head;
            while(last!=null)
            {
               System.out.println(last.data);
                last=last.next;
            }
        }
    }
    
    public static  void findpair(DoublyLinklist li,int sum)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            int t=temp.data;
            Node temp1=temp.next;
            while(temp1!=null)
            {
                if(t+temp1.data==sum)
                {
                 System.out.print(temp1.data+","+t+" ");
                    temp1=temp1.next;
                }
                else
                {
                    temp1=temp1.next;
                }
            }
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        DoublyLinklist li=new DoublyLinklist();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=scan.nextInt();
            li.insert(t);
        }
        li.display();
        System.out.println("Enter the Sum:");
        int sum=scan.nextInt();
        li.findpair(li,sum);
        
    }
}