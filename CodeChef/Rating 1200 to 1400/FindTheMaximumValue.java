import java.util.*;
public class FindTheMaximumValue {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            ArrayList<Integer> a= new ArrayList<>();
            String line = sc.nextLine().trim();
            while(line.isEmpty()) line = sc.nextLine().trim(); // skip blanks
            String[] parts = line.split(" ");
            for(String p : parts) a.add(Integer.parseInt(p));

            for(int i:a){
                if(i==a.size()-1) {a.remove(i); break;}
            }
            int max=a.get(0);
            for(int i:a){max=Math.max(max,i);}
            System.out.println(max);
        }
    }
}
