import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
  }

  public int[] twoSum(int[] nums, int target) {
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
