package problems;


public class P1491 {

    static class Solution {
        public double average(int[] salary) {
            int min = salary[0];
            int max = salary[0];
            int sum = 0;
            for (int item : salary) {
                min = Math.min(item, min);
                max = Math.max(item, max);
                sum += item;
            }
            return Double.parseDouble(String.format("%.5f", (sum - min - max) * 1.0 / (salary.length - 2)));
        }
    }
}

