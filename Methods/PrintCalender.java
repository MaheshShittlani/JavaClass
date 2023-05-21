// Mahesh Shittlani
import java.util.Scanner;
public class PrintCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int y = input.nextInt();
        System.out.print("Enter the month, say(1-12): ");
        int m = input.nextInt();

        printMonthCalendar(y, m);

        input.close();

    }

    public static void printMonthCalendar(int y, int m) {
        printMonthHeader(y,m);   

        printMonthDays(y,m);
    }

    public static void printMonthDays(int y, int m) {
        int theFirstDay = getFirstDay(y, m);
        int monthDays = getMonthDays(y, m);

        int count = 1;
        for(int i = 1; i <= theFirstDay; i++ ,count++) {
            System.out.printf("%5s","");
        }
        for(int i = 1; i <= monthDays; i++ , count++) {
            System.out.printf("%5d", i);

            if(count % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static int getFirstDay(int y, int m) {
        int skipDays = getTotalSkipDays(y, m) + 1;
        int theFirstDay = skipDays % 7;
        return theFirstDay;
    }
    public static int getTotalSkipDays(int y, int m) {
        return getYearSkipDays(y) + getMonthSkipDays(y, m);
    }
    public static int getYearSkipDays(int y) {
        int skipDays = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
        return skipDays;
    }
    public static int getMonthDays(int y, int m) {
        int[] monthDays = {31,0,31,30,31,30,31,31,30,31,30,31};

        if(isLeapYear(y)) {
            monthDays[1] = 29;
        }else {
            monthDays[1] = 28;
        }

        return monthDays[m - 1];
     }
    public static int getMonthSkipDays(int y , int m) {
        
        int[] monthDays = {31,0,31,30,31,30,31,31,30,31,30,31};

        if(isLeapYear(y)) {
            monthDays[1] = 29;
        }else {
            monthDays[1] = 28;
        }

        int skipDays = 0;
        for(int i = 0; i < m - 1; i++) {
            skipDays += monthDays[i];
        }
        return skipDays;
    }
    public static boolean isLeapYear(int y) {
        if(y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            return true;
        }
        return false;
    }

    public static String getMonthName(int m) {
        switch (m) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
        }
        return "";
    }
    public static void printHorizontalLine(String lineChar) {
        for(int i = 1; i<=40; i++) {
            System.out.print(lineChar);
        }
        System.out.println();
    }
    public static void printMonthHeader(int y, int m) {
        String monthName = getMonthName(m);
        
        System.out.println("\n");
        System.out.printf("%20s - %4d\n",monthName,y);
        printHorizontalLine("-");

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n","S","M","T","W","TH","F","SA");
        printHorizontalLine("=");
    }
}
