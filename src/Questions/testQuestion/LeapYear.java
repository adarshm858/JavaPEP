package Questions.testQuestion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {

    public static void main(String[] args) {
//        System.out.println(checkLeapUsingStringSplit("12-02-2024"));
        System.out.println(checkLeapUsingDateSplit("12-02-2023"));
    }

    static boolean checkLeapUsingStringSplit(String input) {
        String[] parts = input.split("-");
        int year = Integer.parseInt(parts[2]);
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static boolean checkLeapUsingDateSplit(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        return date.isLeapYear();
    }
}
