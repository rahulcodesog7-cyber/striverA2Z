import java.util.Scanner;

public class stringPalin {
    static void strRev(int start,int end,char[] st){
        if(start>=end){
            return;
        }
        char temp=st[start];
            st[start]=st[end];
            st[end]=temp;
        strRev(start+1, end-1, st); ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=0,end=0;
        String str=sc.nextLine();
        
        char[] st=new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            st[i]=str.charAt(i);
        }


        end=st.length-1;
        strRev(start,end,st);


        String rev = new String(st);
        if (rev.equals(str)) {
            System.out.println("it is a palindrome string");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        
        
        sc.close();
    }
}
