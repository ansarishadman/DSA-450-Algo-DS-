import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int[][] arr;
        arr = merge(intervals);
        for (int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            System.out.println("Empty 2D Array");
            return res.toArray(new int[0][]);
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i: intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
