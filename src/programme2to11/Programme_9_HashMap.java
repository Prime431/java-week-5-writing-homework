package programme2to11;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleNumber = new HashMap<>();
        // Add keys and values (Name, Id)
        peopleNumber.put("Monday", 102);
        peopleNumber.put("Tuesday", 102);
        peopleNumber.put("Wednesday", 102);
        peopleNumber.put("Thursday", 102);
        peopleNumber.put("Friday", 102);
        peopleNumber.put("Saturday", 102);
        peopleNumber.put("Sunday", 102);

        for (Map.Entry<String, Integer> peopleNum : peopleNumber.entrySet()) {
            System.out.println(peopleNum.getKey() + " = " + peopleNum.getValue());
        }
    }
}
