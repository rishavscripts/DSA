import java.util.Arrays;
import java.util.Scanner;

public class TriangleClassification {
    static Scanner sc = new Scanner(System.in);
       public static void main(String[] args) throws java.lang.Exception {
        int subtask = sc.nextInt();
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            long x3 = sc.nextLong();
            long y3 = sc.nextLong();
            
            // Calculate squared lengths of the three sides
            long s1 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            long s2 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
            long s3 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
            
            // Put squared lengths in an array and sort them
            long[] sides = {s1, s2, s3};
            Arrays.sort(sides);
            
            // Side classification
            String sideType = "";
            if (sides[0] == sides[1] || sides[1] == sides[2]) {
                sideType = "Isosceles";
            } else {
                sideType = "Scalene";
            }
            
            // Output formatting based on SUBTASK_ID
            if (subtask == 1) {
                System.out.println(sideType + " triangle");
            } else {
                // Angle classification using Pythagorean theorem
                String angleType = "";
                long sumSq = sides[0] + sides[1];
                
                if (sumSq == sides[2]) {
                    angleType = "right";
                } else if (sumSq < sides[2]) {
                    angleType = "obtuse";
                } else {
                    angleType = "acute";
                }
                
                System.out.println(sideType + " " + angleType + " triangle");
            }
        }
    } 
}
