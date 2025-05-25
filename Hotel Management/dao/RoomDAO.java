package dao;

import model.Room;

import java.io.*;
import java.util.*;

public class RoomDAO {
    private final String FILE_NAME = "rooms.txt";

    public void addRoom(Room room) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(room.toString());
            writer.newLine();
        }
    }

    public List<Room> getAllRooms() throws IOException {
        List<Room> rooms = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Room room = new Room(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]), parts[4]);
                    rooms.add(room);
                }
            }
        }
        return rooms;
    }

    public void updateRoom(String roomNumber, Room updatedRoom) throws IOException {
        List<Room> rooms = getAllRooms();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Room room : rooms) {
                if (room.getRoomNumber().equals(roomNumber)) {
                    writer.write(updatedRoom.toString());
                } else {
                    writer.write(room.toString());
                }
                writer.newLine();
            }
        }
    }

    public void deleteRoom(String roomNumber) throws IOException {
        List<Room> rooms = getAllRooms();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Room room : rooms) {
                if (!room.getRoomNumber().equals(roomNumber)) {
                    writer.write(room.toString());
                    writer.newLine();
                }
            }
        }
    }

    public Room findRoomByNumber(String roomNumber) throws IOException {
        List<Room> rooms = getAllRooms();
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }
}
