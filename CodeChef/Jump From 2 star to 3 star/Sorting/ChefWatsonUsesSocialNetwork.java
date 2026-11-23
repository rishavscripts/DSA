import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class ChefWatsonUsesSocialNetwork {
     static Scanner sc = new Scanner(System.in);

    static class Post {
        int priority;
        String text;

        Post(int priority, String text) {
            this.priority = priority;
            this.text = text;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<Integer> specialFriends = new HashSet<>();

        for (int i = 0; i < n; i++) {
            specialFriends.add(sc.nextInt());
        }

        ArrayList<Post> feed = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            int friendId = sc.nextInt();
            int popularity = sc.nextInt();
            String post = sc.next();

            if (specialFriends.contains(friendId)) {
                popularity += 100000;
            }

            feed.add(new Post(popularity, post));
        }

        Collections.sort(feed, (a, b) -> b.priority - a.priority);

        for (Post p : feed) {
            System.out.println(p.text);
        }
    }
}
