package GfG;

import java.util.ArrayList;
import java.util.Arrays;

class OverlappingIntervals {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int s = arr[i][0];
            int e = arr[i][1];

            if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) < s) {

                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(s);
                interval.add(e);
                ans.add(interval);

            } else {

                ArrayList<Integer> last = ans.get(ans.size() - 1);
                last.set(1, Math.max(last.get(1), e));
            }
        }

        return ans;
    }
}