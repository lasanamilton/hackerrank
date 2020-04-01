package comparetriplets;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main (String[] args) {
        List<Integer> first = Stream.of(4, 3, 1).collect(Collectors.toList());
        List<Integer> second = Stream.of(1, 3, 4).collect(Collectors.toList());
        compareTriplets(first, second);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int totalScoreA = 0 ,totalScoreB = 0;

        for (int i = 0; i < a.size(); i ++) {
            if (a.get(i) > b.get(i)) {
                totalScoreA++;
            }
            if (a.get(i) < b.get(i)) {
                totalScoreB++;
            }
        }

        List<Integer> totalResults = Stream.of(totalScoreA, totalScoreB).collect(Collectors.toList());
        System.out.print(totalScoreA + " " + totalScoreB);
        return totalResults;
    }
}
