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
        System.out.println("Q.1) WHO IS OUR CURRENT PRIME MINISTER ?");
        System.out.println("A)JAWAHARNAL NEHRU B)MODI C)NARENDRA MODI D)INDIRA GANDHI ");
        String ans = sc.nextLine();
        if(ans.equals("C")){
            score++;
            }
        else{
            System.out.println("THE CORRECT OPTION IS C");
        }
        System.out.println("Q.2) WHO IS FATHER OUR NATION ?");
        System.out.println("A)JAWAHARNAL NEHRU B)DHONI C)MAHATHMA GANDHI D)INDIRA GANDHI ");
        String ans1 = sc.nextLine();
        if(ans1.equals("C")){
                score++;
            }
        else{
                System.out.println("THE CORRECT ANSWER IS OPTION C");
            }
        System.out.println("Q.2) WHO IS CALLED AS IRON MAN OF INDIA ?");
        System.out.println("A)JAWAHARNAL NEHRU B)SARDAR VALABHAI C)MAHATHMA GANDHI D)INDIRA GANDHI ");
        String ans2 = sc.nextLine();
        if(ans2.equals("B")){
                score++;
            }
        else{
                System.out.println("THE CORRECT ANSWER IS OPTION B");
            }

        System.out.println(" EXAM COMPLETED" +"  "+ "YOUR SCORE IS"+" "+score+"/3");
        int percentage = score*100/3;
        System.out.println(percentage+"%");
        if(percentage==100){
            System.out.println("EXCELLENT");
        }
        else if(percentage<100 && percentage>80){
            System.out.println("VERY GOOD");
        }
        else if(percentage<80 && percentage>60){
            System.out.println("GOOD");
        }
        else{
            System.out.println("IMPROVE YOUR SKILLS");
        }
    
    }
  

}
