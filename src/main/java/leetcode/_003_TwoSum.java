package leetcode;

import java.util.Arrays;

public class _003_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		for(int i=0, lens= nums.length; i<lens; i++) {
			for(int k=i+1; k<lens;k++) {
				if(nums[i]+nums[k] == target) {
					answer[0]= i;
					answer[1]= k;
				}
			}
		}		
		return answer;
	}
	public static void main(String[] args) {
		_003_TwoSum a = new _003_TwoSum();
		int[] b = {2, 8, 13, 12, 9, 7, 1};
		System.out.println(Arrays.toString(a.twoSum(b, 21)));
	}

}
