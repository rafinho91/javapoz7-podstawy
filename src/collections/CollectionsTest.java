package collections;

import oop.User;

import java.util.*;

// ARRAY LISTA a LINKED LISTA
// ARRAY LISTA - ma pod spodem tablice, na poczatku [10], po osiagnieciu maxa rozmiar sie dubluje - [20] i tablica jest przepisywana do wiekszej
// LINKED LISTA nie bazuje na tablicy, element dodany wskazuje na kolejny, jest wolniejsza, jest implementacja kolejki
// QUEUE - fifo lifo
// SET wstawia jedynie unikalne wartosci, nie dubluje
// HASHSET oraz TREESET, metoda contains - czy zawiera
// SHA-256 funkcja haszujaca jednostronna (np. Bitcoin), dwustronna - szyfr cezara
// !! jezeli implementujemy equals musimy zaimplementowac HASHcode --> patrz opp.User
// MAP --> HASHMAP oraz TREEMAP - wiazemy dwa obiekty pod konkretnymi kluczami , wykorzystuje haszowanie, rowniez metoda equals, TREEMAP - schemat drzewka
// metoda .put aby dodac, metoda Entry aby dostac sie do zawartosci


public class CollectionsTest {
    public static void main(String[] args) {
//        showLongNames(createListToShow());
//        showNames(createListToShow());

//        Set<String> test = new HashSet<>();
//        Random random = new Random();
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        while (uniqueNumbers.size() < 10) {
//            uniqueNumbers.add(random.nextInt(10));
//        }
//            System.out.println(uniqueNumbers.size());
//            uniqueNumbers.add(55);
//        System.out.println(uniqueNumbers.size());
//        for (Integer uniqueNumber : uniqueNumbers) {
//            System.out.println(uniqueNumber);
//        }

        Set<User> users = new HashSet<>();
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Jan", "Kowalski"));
        System.out.println(users.size());

        User user = new User("Szymon", "Nowak");
        User user1 = new User("Szymon", "Nowak");
        System.out.println(user == user);  // sprawdzic przy wygaszeniu f. haszujacej w opp.User
        System.out.println(user.equals(user1));

        Map<String, User> map = new TreeMap<>(); // dodatkowo sortuje klucze
//        Map<String, User> map = new HashMap<>();
        map.put("123456789", new User("Szymon", "Nowak"));
        map.put("123456789", new User("Anna", "Wisniewska")); //klucze musza byc unikalne - karolina wskakuje w miejsce szymon
        map.put("123434343", new User("Jan", "Kowalski"));
        User user2 = map.get("123434343");
        User remove = map.remove("123456789");


    }


    private static List<String> createListToShow() {
        List<String> listToShow = new ArrayList<>();
        listToShow.add("Rafal");
        listToShow.add("Jan");
        listToShow.add("Karolina");
        listToShow.add("Alek");
        listToShow.add("Zbigniew");
        return listToShow;
    }

    public static void showNames(List<String> listToShow) {
        for (String value : listToShow) {
            if (value.length() > 4){
                System.out.println(value);
            }
        }
    }

    private static void showLongNames(List<String> listToShow) {
        for (int i = 0; i < listToShow.size(); i++) {
            String value = listToShow.get(i);
            if (value.length() > 4) {
                System.out.println(value);
            }
        }
    }

    private static void linkedListExample() {
        List<String> names = new LinkedList<>();
        names.add("Szymon");
        names.add("Szymon");
        names.add("Szymon");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    private static void arrayListExample() {
        List<String> names = new ArrayList<>();
        names.add("Szymon");
        names.add("Szymon");
        names.add("Szymon");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String value: names) {
            System.out.println(value);
        }
    }
}
