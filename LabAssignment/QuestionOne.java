// 1.Write a program to create a “room” class, the attributes of
// this class is Room_no, room_type and room_area. In this class
// the member functions are set_data and display_data.
public class QuestionOne {
    public static void main(String[] args) {
        Room room = new Room();
        room.setData(10, "AC Double", 1200);
        room.displayData();
    }
}

/**
 * Room
 */
class Room {
    int no;
    String type;
    double area;

    void setData(int id, String type, double area) {
        this.no = id;
        this.type = type;
        this.area = area;
    }

    void displayData() {
        System.out.println("Room no is: " + this.no);
        System.out.println("Room Type is: " + this.type);
        System.out.println("Room Area is: " + this.area);
    }
}