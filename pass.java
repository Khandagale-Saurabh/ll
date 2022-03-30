import java.util.*;
class Main{ 
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Generate your Security Code");
    String ss=sc.nextLine();
   boolean b= ss.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#@*]).{8,}$");
   if(b)System.out.println("Security Code Generated Successfully");
   else System.out.println("Invalid Security Code, Try Again!");
}
}
