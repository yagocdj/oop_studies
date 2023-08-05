package questions;

import java.util.Arrays;

public class RunQuestion {
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		
//		int[] nums = {1};
		int[] nums = {0,0,1,1,1,2,3,3};
		int result = sol.removeDuplicates(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(result);
	}
}
