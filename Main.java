public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.getRooms();

        Guest guest = new Guest();
        guest.createBooking();

        Receptionist receptionist = new Receptionist();
        receptionist.createBooking();

        Room room = new Room();
        room.isAvailable();
    }
}
