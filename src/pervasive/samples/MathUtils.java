package pervasive.samples;

import java.util.concurrent.ForkJoinPool;

public class MathUtils {

	public static double arraySum(double[] nums) {
		return (arraySum(nums, 0, nums.length-1));
	}
	
	public static double arraySum(double[] nums, int lowerIndex, int upperIndex){
		double sum = 0.0;
		
		for(int i = lowerIndex; i<=upperIndex; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public static double arraySumParallel(double[] nums) {
		return new ForkJoinPool().invoke(new ParallelArraySummer(nums, 0, nums.length-1));
	}
	
	public static double[] randomNums(int arraySize) {
		double[] nums = new double[arraySize];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Math.random();
		}
		return nums;
	}
}
