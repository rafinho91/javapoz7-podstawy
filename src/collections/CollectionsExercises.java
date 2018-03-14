package collections;

import oop.User;
import oop.bookstore.Author;
import oop.bookstore.Book;

import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(10);
        list.add(6);
//        randomUnique(list);
//        showUsersUniqueNumbers();

//        usersDatabase();

//        bookDatabase();

    }

    private static void bookDatabase() {
        Map<Author, List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("Henryk Sienkiewicz"),
                                    Arrays.asList(new Book("Krzyzacy", 1988),
                                                    new Book("Quo vadis", 1978))
        );
        bookstore.put(new Author("Adam Mickiewicz"),
                                    Arrays.asList(new Book("Dziady", 1930),
                                                    new Book("Wiersze", 1956))
        );
        Set<Map.Entry<Author, List<Book>>> bookstoreSet = bookstore.entrySet();
        for (Map.Entry<Author, List<Book>> authorListEntry : bookstoreSet) {
            List<Book> books = authorListEntry.getValue();
            for (Book book : books) {
                if (book.getReleaseYear() > 1970){
                    System.out.println(book);
                }
            }
        }
    }

    private static void usersDatabase() {
        Map<String, User> usersDatabase = new HashMap<>();
        usersDatabase.put("123456", new User("Rafal", "Drgas"));
        usersDatabase.put("12222", new User("Jacek", "Nowak"));
        usersDatabase.put("434343", new User("Placek", "Kowalski"));
        usersDatabase.put("213334", new User("Janusz", "Kowalski"));
        Set<Map.Entry<String, User>> entries = usersDatabase.entrySet();
//        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, User> next = iterator.next();
//            System.out.println(next.getKey() + ": " + next.getValue());
//        }
        for (Map.Entry<String, User> next : entries) {
            System.out.println(next.getKey() + ": " + next.getValue());
        }

    }

    public static void showUsersUniqueNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();  // TreeSet by to tez posortowal
        for (int i = 0; i < n; i++) {
            int nextValue = scanner.nextInt();
            set.add(nextValue);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void randomUnique(List<Integer> numbers){
        List<Integer> tmpList = new ArrayList<>(numbers);
        Random random = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            int removeIndex = random.nextInt(tmpList.size());
            System.out.println(tmpList.remove(removeIndex));
        }
    }
}
