import java.util.*;
public class Divisors {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n =sc.nextInt();
        int[] ar = div(n);
        for(int i=0;i<ar.length;i++){System.out.print(ar[i]+" ");}
    }
    public static boolean isPrime(int n){
        if(n<=1){return false;}
        for(int i=2;i*i<=n;i++){
            if(n%i==0){return false;}
        }
        return true;
    }
    public static int[] divisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i*i<=n;i++){
             if(isPrime(i)==true && n%i==0){list.add(i);}
        }
        int[] divisors = new int[list.size()];
        for(int j=0;j<list.size();j++){divisors[j]=list.get(j);}
        return divisors;
    }
    //original function
     public static int[] div(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){list.add(i);}
        }
        int[] divisors = new int[list.size()];
        for(int j=0;j<list.size();j++){divisors[j]=list.get(j);}
        return divisors;
    }
}
