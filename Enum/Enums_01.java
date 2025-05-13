package Enum;

//Basic enum example 
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Enums_01 {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}

