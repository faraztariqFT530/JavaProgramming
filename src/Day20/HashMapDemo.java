package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Map hm = new HashMap();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();


        //adding pairs
        hm.put(101, "RajaGee");
        hm.put(102, "Faraz");
        hm.put(103, "Sohaib");
        hm.put(104, "Jibran");
        hm.put(101, "Ammar");

        //if same keys are there, then while printing the second pair value is printed (overwritten)

        System.out.println(hm);             //{101=Ammar, 102=Faraz, 103=Sohaib, 104=Jibran}   //printing everything as a list


        //size of hashmap
        System.out.println("Size of hashmap " + hm.size());       //4


        //remove pair
        hm.remove(103);
        System.out.println("After removing pair : " + hm);      //{101=Ammar, 102=Faraz, 104=Jibran}


        //Access particular value of key
        System.out.println(hm.get(102));      //Faraz


        //get all the keys from hashmap
        System.out.println(hm.keySet());      //[101, 102, 104]

        //get all the values from hashmap
        System.out.println(hm.values());     //[Ammar, Faraz, Jibran]

        //get all the keys and values from hashmap
        System.out.println(hm.entrySet());     //[101=Ammar, 102=Faraz, 104=Jibran]    //printing everything as a set


        //reading data from hashmap (for each loop)
        for(int k: hm.keySet()){
            System.out.println(k + " " + hm.get(k));
        }

        //using iterator
        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        //deleting all from hashmap
        hm.clear();
        System.out.println(hm.isEmpty());         //true



    }
}
