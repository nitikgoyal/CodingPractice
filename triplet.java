import java.util.*;
class triplet
{
    public static void pytha(int arr[],int n)
    {
    Arrays.sort(arr);
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int c=arr[i]*arr[i];
            for(int j=0;j<n-1;j++)
            {
                if(Math.pow(arr[j],2) +Math.pow(arr[j+1],2)==c)
             {
                flag++;
             }
            }
           
        }
         if(flag>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[i]=scan.nextInt();
            }
            pytha(arr,n);
        }
        
        
    }
}