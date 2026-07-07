// This code is incomplete.

import java.util.*;
public class AorB {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int Problem_A_Score_AB=500-(x*2);//System.out.println("A: "+Problem_A_Score_AB);
            int Problem_B_Score_AB=1000-((x+y)*4);//System.out.println("B: "+Problem_B_Score_AB);
            int AtoB=Problem_A_Score_AB+Problem_B_Score_AB;

            int Problem_B_Score_BA=1000-(y*4);
            int Problem_A_Score_BA=500-((x+y)*2);
            int BtoA=Problem_A_Score_BA+Problem_B_Score_BA;
            if(BtoA>AtoB){System.out.println(BtoA);}
            else{System.out.println(AtoB);};
        }
    }
}
