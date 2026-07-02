import java.util.Scanner;
public class CountNotebooks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int page=n*1000;
		    int notebook=page/100;
		    System.out.println(notebook);
		}
    }
}
