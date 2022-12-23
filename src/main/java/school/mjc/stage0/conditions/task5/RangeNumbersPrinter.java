package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        int isBetweenSixAndTen = number >= 6 && number <= 10 ? 2 : 0;
        int isBetweenOneAndFive = number >= 1 && number <= 5 ? 1 : isBetweenSixAndTen;


        switch (isBetweenOneAndFive) {
            case 1 -> System.out.println("number is between 1 and 5");
            case 2 -> System.out.println("number is between 6 and 10");
            default -> System.out.println("out of range");
        }
    }
}
