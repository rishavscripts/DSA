import java.util.Scanner;

public class TCSExam {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int[] dragon=new int[3];
            int[] sloth= new int[3];
            
            for(int i=0;i<3;i++){dragon[i]=sc.nextInt();}
            for(int i=0;i<3;i++){sloth[i]=sc.nextInt();}
            
            int dragonSum=sum(dragon);
            int slothSum=sum(sloth);
            
            if(dragonSum>slothSum){System.out.println("DRAGON");}
            else if(slothSum>dragonSum){System.out.println("SLOTH");}
            else{
                if(dragon[0]>sloth[0]){System.out.println("DRAGON");}
                else if(dragon[0]<sloth[0]){System.out.println("SLOTH");}
                else{
                    if(dragon[1]>sloth[1]){System.out.println("DRAGON");}
                    else if(dragon[1]<sloth[1]){System.out.println("SLOTH");}
                    else{System.out.println("TIE");}
                }
            }
        }
        
	}
	public static int sum(int[] arr){
	    int sum=0;
	    for(int i=0;i<arr.length;i++){
	        sum+=arr[i];
	    }
	    return sum;
	}
}
