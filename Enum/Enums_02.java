package Enum;

//Enums with method 
enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

public class Enums_02 {
    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        System.out.println("Selected Size: " + size);
        System.out.println("Abbreviation: " + size.getAbbreviation());
    }
}

