package solutions.No_0901_To_No_1000.No_0922_sort_array_by_parity_2;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * @author Nacht
 * Created on 2019/5/27
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * You may return any answer array that satisfies this condition.
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * Note:
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 解题思路:
 * 遍历数组,如果奇数放奇数index,偶数放偶数index
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int oddIndex = 1 ;
        int evenIndex = 0 ;
        for(int num : A){
            if(num % 2 == 0 ){
                result[evenIndex] = num;
                evenIndex += 2;
            }else{
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }
}
