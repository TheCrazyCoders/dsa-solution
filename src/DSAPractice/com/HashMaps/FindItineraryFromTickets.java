package DSAPractice.com.HashMaps;

import java.util.HashMap;

public class FindItineraryFromTickets {
    public static String getStart(HashMap<String, String> ticks){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : ticks.keySet()){
            //key->key, val = ticks.get(key)
            revMap.put(ticks.get(key), key);

        }
        for(String key : ticks.keySet()){
            if(!revMap.containsKey(key)){
                return key; //start
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start +"->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
