package Practice;

import java.util.List;

public class StreamsMap {
    public static void main(String[] args) {
        List<String> names = List.of(
            "deepak",
            "dpak",
            "dpakkkk",
            "d"
        );
        List<String> result = names.stream()
        .filter(name -> name.length() > 4)
        .map(String::toUpperCase)
        .toList();

        System.out.println(result);
    }
}
