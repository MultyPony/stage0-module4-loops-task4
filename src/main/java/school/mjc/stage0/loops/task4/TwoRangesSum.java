package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        int sum = 0;
        int skippedSum = 0;
        int countedSum = 0;

        for (int i = 1; i <= lastInRow; i++) {
            sum += i;

            if (i == numberToSkip) {
                skippedSum = sum;
            }
        }
        countedSum = sum - skippedSum;

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}
