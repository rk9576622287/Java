import java.util.HashMap;
public class hashMap1{
    public static void main (String[] args) {
        HashMap<String, String> people = new HashMap<String, String>();
        people.put("Ritesh","kumar");       //  put an item in HashMap
        people.put("Vishal","raj");
        people.put("Ajeet","sharma");
        people.put("Manish","singh");

        System.out.println(people);             // to print the HashMap
        System.out.println(people.get("Ritesh"));// to get an item

        people.remove("Manish");                // to remove an item 
        System.out.println("Size of HashMap is :"+people.size());
        System.out.println(people);

        System.out.println(people.keySet());    // to print key value
        System.out.println(people.values());    // to print values
    
         for(String i : people.keySet()){
            System.out.println("key :"+i+" values :"+ people.get(i));    
        }

        people.clear();                         // to clear the HashMap
        System.out.println(people);
    }
}