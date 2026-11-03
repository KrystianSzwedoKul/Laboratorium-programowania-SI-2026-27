package lab4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(2);

        list.stream()
                .filter(e -> e % 2 == 0)
                .map(m -> m * 3)
                .forEach(f -> System.out.println(f));
    }
}
