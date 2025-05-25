import dao.RoomDAO;
import java.util.*;
import model.Room;

public class HotelManagementApp {
    public static void main(String[] args) {
        RoomDAO dao = new RoomDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nHotel Management System");
            System.out.println("1. Add Room");
            System.out.println("2. View All Rooms");
            System.out.println("3. Search Room");
            System.out.println("4. Update Room");
            System.out.println("5. Delete Room");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Room Number: ");
                        String rno = sc.nextLine();
                        System.out.print("Availability (Available/Occupied): ");
                        String avail = sc.nextLine();
                        System.out.print("Cleaning Status (Cleaned/Dirty): ");
                        String clean = sc.nextLine();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Bed Type (Single/Double): ");
                        String bed = sc.nextLine();
                        dao.addRoom(new Room(rno, avail, clean, price, bed));
                        System.out.println("Room added successfully.");
                        break;
                    case 2:
                        for (Room room : dao.getAllRooms()) {
                            System.out.println(room);
                        }
                        break;
                    case 3:
                        System.out.print("Enter Room Number: ");
                        String searchNum = sc.nextLine();
                        Room room = dao.findRoomByNumber(searchNum);
                        if (room != null) System.out.println(room);
                        else System.out.println("Room not found.");
                        break;
                    case 4:
                        System.out.print("Enter Room Number to update: ");
                        String updateNum = sc.nextLine();
                        Room old = dao.findRoomByNumber(updateNum);
                        if (old == null) {
                            System.out.println("Room not found.");
                            break;
                        }
                        System.out.print("New Availability: ");
                        String newAvail = sc.nextLine();
                        System.out.print("New Cleaning Status: ");
                        String newClean = sc.nextLine();
                        System.out.print("New Price: ");
                        double newPrice = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("New Bed Type: ");
                        String newBed = sc.nextLine();
                        dao.updateRoom(updateNum, new Room(updateNum, newAvail, newClean, newPrice, newBed));
                        System.out.println("Room updated successfully.");
                        break;
                    case 5:
                        System.out.print("Enter Room Number to delete: ");
                        String delNum = sc.nextLine();
                        dao.deleteRoom(delNum);
                        System.out.println("Room deleted successfully.");
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
