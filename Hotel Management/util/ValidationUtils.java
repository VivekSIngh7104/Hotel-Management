package util;

public class ValidationUtils {
    public static boolean isValidRoomNumber(String roomNumber) {
        return roomNumber.matches("\\d+"); // Only digits
    }

    public static boolean isValidPrice(double price) {
        return price > 0;
    }

    public static boolean isValidBedType(String bedType) {
        return bedType.equalsIgnoreCase("Single") || bedType.equalsIgnoreCase("Double");
    }
}
