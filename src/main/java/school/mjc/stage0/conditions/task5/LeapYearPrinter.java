package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        byte isLeapYear = (byte) (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 1 : 0);

        switch (isLeapYear) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
            default:
                System.out.println("not leap");
        }
    }
}
