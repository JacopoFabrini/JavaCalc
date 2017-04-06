package pervasive.samples;

public class Tester1 {

	public static void main(String[] args) {
		for(int i = 3; i < 9; i++) {
			int arraySize = 100000000;
			double[] nums = MathUtils.randomNums(arraySize);
			TimingUtils.timeOp(new Op() {
				@Override
				public String runOp() {
					double sum = MathUtils.arraySum(nums);
					return String.format("Sequential sum of %,d numbers is %.4f", arraySize, sum);
				}
			});				
				TimingUtils.timeOp(new Op() {
					@Override
					public String runOp() {
						double sum = MathUtils.arraySumParallel(nums);
						return String.format("Parallel sum of %,d numbers is %.4f", arraySize, sum);
					}	
			});
		}
	}
}
