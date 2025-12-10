package core.basesyntax;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    /**
     * Given a map with the following view : "company name" - "monthly income delta"  (String/Integer)
     * Return list of the companies with positive delta. Their names should be sorted alphabetically
     * Example input : {"Sun.ltd" : 20_000}, {"Micro" : -5_200}, {"Clarity": 0}, {"Odyssey": 9_640};
     * Output : {"Odyssey", "Sun.ltd"}
     */
    public List<String> getCompanies(Map<String, Integer> input) {
        return input.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * Given a list of integer numbers, convert each integer into it's binary representation in string format
     * and join all of them into a single string and putting each value into brackets, it should look like this:
     * Input: {1, 20, 33}
     * Output:
     * (1)
     * (10100)
     * (100001)
     */
    public String convertAndModifyNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> "(" + Integer.toBinaryString(n) + ")")
                .collect(Collectors.joining("{ }"));
    }

    /**
     * Given string value. Your task is
     * to increment char value of each symbol from the string. Amount to increment is
     * passed with the second input param - 'increment'
     */
    public String charsIncrementation(String string, int increment) {
        return string.chars().mapToObj(n -> n + increment)
                .toString();
    }

    /**
     * Given List of string where each element represents persons' age and name:
     * {"99:Johny", "20:Brad", ...} return the age of the oldest person
     */
    public Long getOldestPersonAge(List<String> people) {
        return people.stream()
                .map(p -> Integer.parseInt(p.substring(0, people.indexOf(":"))))
                .sorted()
                .findFirst()
                .map(Long::valueOf)
                .orElseThrow(RuntimeException::new);
    }
}

