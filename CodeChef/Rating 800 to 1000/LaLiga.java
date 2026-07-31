import java.util.*;
public class LaLiga{
	static Scanner sc = new Scanner(System.in);
   	public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            int barca = 0, real = 0, malaga = 0, eibar = 0;

            for (int i = 0; i < 4; i++) {
                String team = sc.next();
                int goals = sc.nextInt();

                if (team.equals("Barcelona")) barca = goals;
                else if (team.equals("RealMadrid")) real = goals;
                else if (team.equals("Malaga")) malaga = goals;
                else if (team.equals("Eibar")) eibar = goals;
            }

            if (real < malaga && barca > eibar) {
                System.out.println("Barcelona");
            } else {
                System.out.println("RealMadrid");
            }
        }
    }
}