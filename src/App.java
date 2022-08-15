import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Room red = new Room("Red", "big room",4,175);
        Room blue = new Room("Blue", "small room",4,105);
        Room white = new Room("White", "giant room",4,375);


        Collection<Room> rooms = new ArrayList<>(Arrays.asList(red,white,blue));

        Iterator<Room> iterator = rooms.iterator();
        System.out.println(iterator.next());
    }

}
