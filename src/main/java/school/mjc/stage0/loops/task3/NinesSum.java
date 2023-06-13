package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum1= 0;
        int sum2 = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum1 += sum2;
            sum2 = sum2 * 10 + 9;
        }

        System.out.println(sum1);
    }
    }
