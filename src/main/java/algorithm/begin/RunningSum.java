package algorithm.begin;

public class RunningSum {
    public static void main(String[] args) {
        RunningSum runningSum = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum.runningSum(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("sum = " + sum);
            nums[i] = sum;
            System.out.println("num = " + nums[i]);
        }
        return nums;
    }
}
