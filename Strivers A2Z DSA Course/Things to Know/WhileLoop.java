import java.util.*;
public class WhileLoop {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int d;
        System.out.println("Enter the last digit: ");
        d = sc.nextInt();
        System.out.println("The sum of the first 50 digits that ends with "+d+" is "+While_Loop(d));
    }
    public static int While_Loop(int d){
        int num=0,count=0,sum=0;
        num+=d;
        count++;
        sum+=num;
        while(count<50){
            num+=10;
            count++;
            sum+=num;
            System.out.println(sum);
        }
        return sum;
    }
}
