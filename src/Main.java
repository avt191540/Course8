import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        System.out.println(findOldUser(users));
    }

    public static User findOldUser(List<User> users) {
        Set<User> userSet = new HashSet<>(users);
        List<User> userSort = new ArrayList<>(userSet);
        Comparator<User> comp = Comparator.comparing(User::getAge).thenComparing(User::getName);
        userSort.sort(comp);
        return  userSort.get(userSort.size() - 1);
    }
}