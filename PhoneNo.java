import java.util.*;
public class PhoneNo
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
       for(int i=0;i<n;i++)
       {
           String name=scan.next();
           int no=scan.nextInt();
           hm.put(name,no);
       }
        System.out.println("Enter the number of searches u want:");
        int s=scan.nextInt();
          String str[]=new String[s];
          for(int i=0;i<s;i++)
          {
              str[i]=scan.next();
          }
        for(int i=0;i<s;i++)
        {
            if(hm.containsKey(str[i]))
            {
                System.out.println(str[i]+"="+hm.get(str[i]));
            }
            else
            {
                System.out.println("Nodata Found");
            }
        }
        
    }
}