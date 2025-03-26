package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Circle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(-5);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                new Circle(10);
            }
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }

        String text = "Test Automation Bootcamp 6, 2022";

        System.out.println(text.substring(5, 15).toLowerCase());

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Length:" + text.length());

        System.out.println(text.replace(" ", "-"));

        String[] phoneNumbers = {"599-144-155", "555-123456", "593-987654", "590-111222"};

        for (String phone : phoneNumbers) {
            String cleanPhone = phone.replace("-", "");
            System.out.println(cleanPhone + " is valid : " + phoneNumberValidation(cleanPhone));
        }
    }

    private static boolean phoneNumberValidation(String phoneNumber) {
        return phoneNumber.matches("^(555|595|592|599)\\d{6}$");
    }
}
