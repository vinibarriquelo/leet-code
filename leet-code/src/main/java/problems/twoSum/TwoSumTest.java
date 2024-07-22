package problems.twoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testSolution() {
        TwoSum twoSum = new TwoSum();

        // Teste 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, twoSum.solution(nums1, target1));

        // Teste 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, twoSum.solution(nums2, target2));

        // Teste 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, twoSum.solution(nums3, target3));

        // Teste 4: sem resultado
        int[] nums4 = {1, 2, 3};
        int target4 = 7;
        int[] expected4 = {};
        assertArrayEquals(expected4, twoSum.solution(nums4, target4));
    }
}
