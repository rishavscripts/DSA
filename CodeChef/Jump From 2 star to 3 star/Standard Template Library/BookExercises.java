import java.util.ArrayList;
import java.util.Scanner;

public class BookExercises {
    static Scanner sc = new Scanner(System.in);

    static class Book {
        int exercises;
        String name;

        Book(int exercises, String name) {
            this.exercises = exercises;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        ArrayList<Book> stack = new ArrayList<>();

        while (n-- > 0) {

            int x = sc.nextInt();

            if (x == -1) {

                int bestIndex = -1;
                int minExercises = Integer.MAX_VALUE;

                for (int i = 0; i < stack.size(); i++) {

                    Book b = stack.get(i);

                    if (b.exercises < minExercises ||
                       (b.exercises == minExercises && i > bestIndex)) {

                        minExercises = b.exercises;
                        bestIndex = i;
                    }
                }

                Book chosen = stack.get(bestIndex);

                int removed = stack.size() - bestIndex - 1;

                System.out.println(removed + " " + chosen.name);

                stack.remove(bestIndex);

            } else {

                String name = sc.next();

                if (x > 0) {
                    stack.add(new Book(x, name));
                }
            }
        }
    }
}
