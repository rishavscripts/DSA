import java.util.*;
public class Genes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            char first=sc.next().charAt(0);
            char second=sc.next().charAt(0);
            
            Map<Character,Integer> map=new HashMap<>();
            map.put('R',3);
            map.put('B',2);
            map.put('G',1);

            int firstValue=map.get(first);
            int secondValue=map.get(second);
            if(firstValue>secondValue){System.out.println(first);}
            else if(firstValue<secondValue){System.out.println(second);}
            else{System.out.println(first);}
        }
    }
}
