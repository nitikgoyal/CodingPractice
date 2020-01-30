import java.util.*;
 public class Arraywindow
 {
     static void Maxwindow(int a[],int k,int n)
     {
         int max;
         for(int i=0;i<=n-k;i++)
         {
            max=a[i];
             for(int j=1;j<k;j++)
             {
                 if(a[i+j]>max)
                 {
                     max=a[i+j];
                 }
             }
             System.out.println(max+" ");
         }
     }
     public static void main(String args[])
     {
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=scan.nextInt();
         }
         int k=scan.nextInt();
         Maxwindow(a,k,n);
     }
 }