import java.util.*;
public class VowelConsonant {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        char ch=sc.next().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){System.out.println("Vowel");}
        else{System.out.println("Consonant");}
    }
}
