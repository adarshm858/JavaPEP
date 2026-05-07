package Test6;

import java.io.*;
import java.util.ArrayList;

public class HotelManager {

    public static void main(String[] args) {

        ArrayList<Guest> guestList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("JAVA/Test6/bookings.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                try {

                    String[] data = line.split(",");

                    int guestId = Integer.parseInt(data[0]);
                    String guestName = data[1];
                    String roomType = data[2].toUpperCase();
                    int daysStayed = Integer.parseInt(data[3]);

                    if (daysStayed <= 0) {
                        throw new InvalidStayException(
                                "Invalid stay duration for guest " + guestName);
                    }

                    Guest guest = null;

                    switch (roomType) {

                        case "STANDARD":
                            guest = new StandardRoom(guestId, guestName, daysStayed);
                            break;

                        case "DELUXE":
                            guest = new DeluxeRoom(guestId, guestName, daysStayed);
                            break;

                        case "SUITE":
                            guest = new SuiteRoom(guestId, guestName, daysStayed);
                            break;

                        default:
                            throw new InvalidRoomTypeException(
                                    "Invalid room type for guest " + guestName);
                    }

                    guestList.add(guest);

                    System.out.println("Guest " + guestName + " processed successfully.");

                } catch (InvalidRoomTypeException e) {
                    System.out.println("Error: " + e.getMessage());

                } catch (InvalidStayException e) {
                    System.out.println("Error: " + e.getMessage());

                } catch (Exception e) {
                    System.out.println("Error processing record: " + e.getMessage());
                }
            }

            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("bookings.txt"));

            bw.write("===== HOTEL BILL REPORT =====\n\n");

            for (Guest guest : guestList) {

                String roomType = "";

                if (guest instanceof StandardRoom) {
                    roomType = "STANDARD";
                } else if (guest instanceof DeluxeRoom) {
                    roomType = "DELUXE";
                } else if (guest instanceof SuiteRoom) {
                    roomType = "SUITE";
                }

                bw.write("Guest: " + guest.getGuestName() + "\n");
                bw.write("Room Type: " + roomType + "\n");
                bw.write("Days Stayed: " + guest.getDaysStayed() + "\n");
                bw.write("Total Bill: ₹" + guest.calculateBill() + "\n\n");
            }

            bw.close();

            System.out.println("\nReport generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: bookings.txt file not found.");

        } catch (IOException e) {
            System.out.println("Error while reading/writing file.");
        }
    }
}