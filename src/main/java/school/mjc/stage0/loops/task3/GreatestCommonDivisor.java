package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int GCD = 0;
        int max = Math.max(first, second);
        for (int i = 1; i <= max; i++) {
            if (second % i == 0 && first % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
}

