import java.util.*;
class Node 
{
    int key;
    Node left,right;
    public Node(int item)
    {
        key=item;
        left=right=null;
    }
}
public class treeh
{
    static Node root;
    treeh(int data)
    {
        root=new Node(data);
    }
    treeh()
    {
        root=null;
    }
    
    public static void inorder(Node root)
    {
        if(root!=null)
        {
        inorder(root.left);
        System.out.println(root.key);
            inorder(root.right);
        }
        return;
    }
    public static void push1(int key)
    {
        root=push(root,key);
    }
    public static Node push(Node root,int key)
    {
        Node newNode =new Node(key);
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        else if(key>root.key)
        {
            root.right=push(root.right,key);
        }
        else if(key<root.key)
        {
            root.left=push(root.left,key);
        }
        return root;
    }
    public static int height(Node root)
    {
       if(root == null)
             return 0;
         return 1+Math.max(height(root.left),height(root.right));
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        treeh tree=new treeh();
         tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
//        int n=scan.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            int t=scan.nextInt();
//            tr.push1(t);
//        }
        int h=height(tree.root);
        System.out.println("height="+h);
        
    }
}

