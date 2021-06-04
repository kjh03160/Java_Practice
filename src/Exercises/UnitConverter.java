package Exercises;

public class UnitConverter {
    public static final double POUND_TO_KILO = 0.45359237;
    public static final double INCH_TO_CENT = 2.54;

    private void UnitConverter(){}

    public static double toPounds(double kilograms) {
        return kilograms / UnitConverter.POUND_TO_KILO;
    }
    public static double toKilograms(double pounds) {
        return pounds * UnitConverter.POUND_TO_KILO;
    }
    public static double toCentimeters(double inches) {
        return inches * UnitConverter.INCH_TO_CENT;
    }
    public static double toInches(double centimeters) {
        return centimeters / UnitConverter.INCH_TO_CENT;
    }
    public static double toFahrenheit(double celsius) {
        return celsius * (9.0 / 5) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }

    public static void main(String[] args) {
        System.out.format("35 lb -> %.2f kg\n", UnitConverter.toKilograms(35));
        System.out.format("62 kg -> %.2f lb\n", UnitConverter.toPounds(62));
        System.out.format("12.2 in -> %.2f cm\n", UnitConverter.toCentimeters(12.2));
        System.out.format("3.82 cm -> %.2f in\n", UnitConverter.toInches(3.82));
        System.out.format("48 °F -> %.2f °C\n", UnitConverter.toCelsius(48));
        System.out.format("-9 °C -> %.2f °F\n", UnitConverter.toFahrenheit(-9));
    }
}