import java.util.*;
public class IfElse {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Mark:");
        num = sc.nextInt();
        StudentGrade(num);
        sc.close();
    }
    public static void StudentGrade(int num){
       
        if(num>=90){ System.out.println("Grade A");}
        else if(num>=70){System.out.println("Grade B");}
        else if(num>=50){System.out.println("Grade C");}
        else if (num>=35){System.out.println("Grade D");}
        else{System.out.println("Fail");}
       }
}
