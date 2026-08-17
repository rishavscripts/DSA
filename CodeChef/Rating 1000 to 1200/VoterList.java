import java.util.*;
public class VoterList {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int totalCount = n1 + n2 + n3;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < totalCount; i++){
            int id = sc.nextInt();
            map.put(id, map.getOrDefault(id, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int n : map.keySet()){
            if(map.get(n) >= 2){
                result.add(n);
            }
        }
        
        // Sort the result in ascending order as required by the problem
        Collections.sort(result);
        
        System.out.println(result.size());
        for(int n : result){
            System.out.println(n);
        }
	}
}
