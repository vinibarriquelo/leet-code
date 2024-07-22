package problems.twoSum;

public class TwoSum {

    public int[] solution(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                if (i != x) {
                    if ((nums[i] + nums[x]) == target) {
                        return new int[]{i, x};
                    }
                }
            }
        }

        return new int[]{};
    }
}

