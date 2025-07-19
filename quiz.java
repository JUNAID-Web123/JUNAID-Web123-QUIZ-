import java.util.Scanner;
import java.io.*;
public class quiz{
    static String username ="TEAM_ATOM";
    static String password="12atom";
        public static void main(String[] args) {

        
        if(login()){
            System.out.println("LOGGED IN SUCCESSFULLY NOW YOU CAN TAKE EXAM");
            startexam();
        }
        else{
            System.out.println("ENTER VALID CREDENTIALS");
        }
        
    }
    public static boolean login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the username");
        String user = sc.nextLine();
        System.out.println("enter the password");
        String pass = sc.nextLine();
        return user.equals(username) && pass.equals(password);

    }
    public static void startexam(){
        Scanner sc = new Scanner(System.in);
        int score=0;
        System.out.println("Q.1) WHO IS OUR CURRENT PRIME MINISTER");
        System.out.println("A)JAWAHARNAL NEHRU B)MODI C)NARENDRA MODI D)INDIRA GANDHI ");
        String ans = sc.nextLine();
        if(ans.equals("C")){
            score++;
            }
        else{
            System.out.println("THE CORRECT OPTION IS C");
        }
        System.out.println("Q.2) WHO IS FATHER OUR NATION");
        System.out.println("A)JAWAHARNAL NEHRU B)DHONI C)MAHATHMA GANDHI D)INDIRA GANDHI ");
        String ans1 = sc.nextLine();
        if(ans1.equals("C")){
                score++;
            }
        else{
                System.out.println("THE CORRECT ANSWER IS OPTION C");
            }
        System.out.println("/n EXAM COMPLETED /n YOUR SCORE IS"+" "+score+"/2");
        
    }
  

}
