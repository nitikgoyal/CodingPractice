import java.util.*;
public class Linkedlistdu
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
     
    public static Linkedlistdu insert(Linkedlistdu li,int data)
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
    
    public static void display(Linkedlistdu li)
    {
        Node temp=li.head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void removedup(Linkedlistdu li)
    {
        Node temp=li.head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
    }
    
    
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Linkedlistdu li=new Linkedlistdu();
        System.out.println("Enter the no. of elements:");
        
        int n=scan.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            int t=scan.nextInt();
            li.insert(li,t);
        }
        System.out.println("Elements are:");
        li.display(li);
        System.out.println("After removal of Duplicates");
        li.removedup(li);
        li.display(li);
        
    }
}