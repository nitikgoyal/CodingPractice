import java.util.*;
public class Linkedlistpr
{
    Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
    }
     
    public static Linkedlistpr insert(Linkedlistpr li,int data)
    {
        Node newNode = new Node(data);
        newNode.next=null;
            if(li.head==null)
            {
                li.head=newNode;
            }
        else
        {
            Node last=li.head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newNode;
        }
        return li;
    }
    
    public static void display(Linkedlistpr li)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void paireverse(Linkedlistpr li)
    {
        Node temp=li.head;
        while(temp!=null && temp.next!=null)
        {
            int k=temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Linkedlistpr li=new Linkedlistpr();
        System.out.println("Enter the no. of elements:")s;
        
        int n=scan.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            int t=scan.nextInt();
            li.insert(li,t);
        }
        System.out.println("Elements are:");
       
        
         li.paireverse(li);
        
         li.display(li);
        
    }
}