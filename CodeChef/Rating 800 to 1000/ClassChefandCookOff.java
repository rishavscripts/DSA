import java.util.*;
public class ClassChefandCookOff{
	static Scanner sc = new Scanner(System.in);
    	public static void main(String[] args) {
        int N = sc.nextInt();
        while (N-- > 0) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                count += sc.nextInt();
            }
            switch (count) {
                case 0: System.out.println("Beginner"); break;
                case 1: System.out.println("Junior Developer"); break;
                case 2: System.out.println("Middle Developer"); break;
                case 3: System.out.println("Senior Developer"); break;
                case 4: System.out.println("Hacker"); break;
                case 5: System.out.println("Jeff Dean"); break;
            }
        }
    }
}