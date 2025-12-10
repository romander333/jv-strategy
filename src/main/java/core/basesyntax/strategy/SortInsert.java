package core.basesyntax.strategy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class SortInsert {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[] {map.get(x), cur};
            }

            map.put(cur, i);

        }
        return null;

    }

    public static void main(String[] args) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(sorted[i] + " ");
//        }
    }
}
