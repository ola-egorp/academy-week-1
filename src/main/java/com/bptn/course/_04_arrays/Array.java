package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {


		int i0 = 4;
		int i1 = 5;
		int i2 = 7;
		int i3 = 2;
		int i4 = 19;
		int i5 = 14;
		int i6 = 35;
		int i7 = 46;
		int i8 = 71;
		int i9 = 28;
		
		int [] numbers = new int [10];

		int[] nums = {4, 5, 7, 2, 19, 14, 35, 46, 71, 28, 11, 13};
		
		int[] num2 = new int [10];
		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		nums[0] = 100;
		nums[11] = 200;
		
		for (int num : nums) {
			System.out.println(num);
		}
	}

}
