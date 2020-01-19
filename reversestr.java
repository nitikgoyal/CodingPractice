import java.util.*;
class reversestr
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            String str=scan.next();
            String arr[]=str.split("\\.");
            String st="";
            for(int j=arr.length-1;j>0;j--)
            {
                st+=arr[j]+".";
            }
            st+=arr[0];
            System.out.println(st);
        }
    }
}