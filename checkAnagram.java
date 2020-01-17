import java.util.*;
class checkAnagram
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=scan.nextLine().toLowerCase();
        System.out.println("Enter String 2:");
        String s2=scan.nextLine().toLowerCase();
        
        if(s1.length()!=s2.length())
        {
            System.out.println("Not Anagram");
        }
        else
        {
            int flag=0;
            
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<s1.length();i++)
            {
               if(ch1[i]==ch2[i])
               {
                  flag=1; 
               }
                else
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
        
    }
}