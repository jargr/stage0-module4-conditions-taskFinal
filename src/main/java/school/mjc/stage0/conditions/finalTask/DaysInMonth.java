package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (month <= 0 || month > 12 || year < 0){
            System.out.println("invalid date");
        } else if (month == 2) {
            System.out.println(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0) ? 29 : 28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        } else {
            System.out.println(31);
        }

    }
}
