public class Room {

   private String name;
   private String type;
   private int capacity;
   private int rate;

    public Room(String name, String type, int rate, int capacity) {
        this.capacity = capacity;
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", rate=" + rate +
                '}';
    }
}
