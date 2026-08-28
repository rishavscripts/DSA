import java.util.*;
public class ChefinFantasyLeague {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int purse=100-s;
            int[] prices=new int[n];
            int[] players= new int[n];
            for(int i=0;i<n;i++){prices[i]=sc.nextInt();}
            for(int i=0;i<n;i++){players[i]=sc.nextInt();}
            int minDef=Integer.MAX_VALUE,minFor=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(players[i]==0 && prices[i]<minDef) minDef=prices[i];
                if(players[i]==1 && prices[i]<minFor) minFor=prices[i];
            }
            if(minDef+minFor>purse){System.out.println("no");}
            else{System.out.println("yes");}
        }
    }
}
