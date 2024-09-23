import java.util.Scanner;

public class UnitConverter {

    // Method to convert length
    public static void lengthConversion(double value, String fromUnit, String toUnit) {
        double convertedValue = 0;
        if (fromUnit.equals("meters") && toUnit.equals("kilometers")) {
            convertedValue = value / 1000;
        } else if (fromUnit.equals("kilometers") && toUnit.equals("meters")) {
            convertedValue = value * 1000;
        } else if (fromUnit.equals("miles") && toUnit.equals("kilometers")) {
            convertedValue = value * 1.60934;
        } else if (fromUnit.equals("feet") && toUnit.equals("meters")) {
            convertedValue = value * 0.3048;
        }
        System.out.println("Converted value: " + convertedValue + " " + toUnit);
    }

    // Method to convert weight
    public static void weightConversion(double value, String fromUnit, String toUnit) {
        double convertedValue = 0;
        if (fromUnit.equals("kilograms") && toUnit.equals("grams")) {
            convertedValue = value * 1000;
        } else if (fromUnit.equals("grams") && toUnit.equals("kilograms")) {
            convertedValue = value / 1000;
        } else if (fromUnit.equals("pounds") && toUnit.equals("kilograms")) {
            convertedValue = value * 0.453592;
        } else if (fromUnit.equals("ounces") && toUnit.equals("grams")) {
            convertedValue = value * 28.3495;
        }
        System.out.println("Converted value: " + convertedValue + " " + toUnit);
    }

    // Method to convert temperature
    public static void temperatureConversion(double value, String fromUnit, String toUnit) {
        double convertedValue = 0;
        if (fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")) {
            convertedValue = (value * 9/5) + 32;
        } else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")) {
            convertedValue = (value - 32) * 5/9;
        } else if (fromUnit.equals("Celsius") && toUnit.equals("Kelvin")) {
            convertedValue = value + 273.15;
        }
        System.out.println("Converted value: " + convertedValue + " " + toUnit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Unit Converter ---");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Temperature Conversion");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Length Conversion
                    System.out.print("Enter value: ");
                    double lengthValue = scanner.nextDouble();
                    System.out.print("Convert from (meters/kilometers/miles/feet): ");
                    String fromLength = scanner.next();
                    System.out.print("Convert to (meters/kilometers/miles/feet): ");
                    String toLength = scanner.next();
                    lengthConversion(lengthValue, fromLength, toLength);
                    break;

                case 2:
                    // Weight Conversion
                    System.out.print("Enter value: ");
                    double weightValue = scanner.nextDouble();
                    System.out.print("Convert from (kilograms/grams/pounds/ounces): ");
                    String fromWeight = scanner.next();
                    System.out.print("Convert to (kilograms/grams/pounds/ounces): ");
                    String toWeight = scanner.next();
                    weightConversion(weightValue, fromWeight, toWeight);
                    break;

                case 3:
                    // Temperature Conversion
                    System.out.print("Enter value: ");
                    double tempValue = scanner.nextDouble();
                    System.out.print("Convert from (Celsius/Fahrenheit/Kelvin): ");
                    String fromTemp = scanner.next();
                    System.out.print("Convert to (Celsius/Fahrenheit/Kelvin): ");
                    String toTemp = scanner.next();
                    temperatureConversion(tempValue, fromTemp, toTemp);
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
