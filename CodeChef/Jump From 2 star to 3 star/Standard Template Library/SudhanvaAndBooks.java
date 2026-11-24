import java.util.*;
public class SudhanvaAndBooks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int q = sc.nextInt();

        ArrayDeque<Long> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {

            long type = sc.nextLong();

            if (type == 1) {

                long num = sc.nextLong();
                stack.push(num);

            } else {

                if (stack.isEmpty()) {
                    sb.append("kuchbhi?\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}
