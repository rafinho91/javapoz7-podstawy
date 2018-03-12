package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ARRAY LISTA a LINKED LISTA
// ARRAY LISTA - ma pod spodem tablice, na poczatku [10], po osiagnieciu maxa rozmiar sie dubluje - [20] i tablica jest przepisywana do wiekszej
// LINKED LISTA nie bazuje na tablicy, element dodany wskazuje na kolejny, jest wolniejsza, jest implementacja kolejki

public class CollectionsTest {
    public static void main(String[] args) {
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
