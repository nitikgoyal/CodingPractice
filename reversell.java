import java.util.*;
public class reversell
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
    
    public static reversell insert(reversell li,int data)
    {
        Node newNode=new Node(data);
        newNode.next=null;
        if(li.head==null)
            li.head=newNode;
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
    public static void display(reversell li)
    {
        Node temp=li.head;
        System.out.println("Linkedlist is:");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void reverse(Node temp)
    {
        if(temp==null)
        {
            System.out.println("NULL");
        }
        if(temp.next==null)
        {
            System.out.println("The reverse list is:");
            System.out.println(temp.data);
            
        }
        else
        {
            reverse(temp.next);
            System.out.println(temp.data);
        }
    }
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        reversell li=new reversell();
        System.out.println("Enter the size of linked list:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int t=scan.nextInt();
            li.insert(li,t);
        }
        li.display(li);
        li.reverse(li.head);

        
        
    }
}