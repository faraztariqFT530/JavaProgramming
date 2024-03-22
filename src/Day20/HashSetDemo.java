package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        //Set hs = new HashSet();
        //HashSet<String> hs = new HashSet<String>();
        hs.add("Hashset");
        hs.add(100);
        hs.add(100.5);
        hs.add(10);
        hs.add(null);
        hs.add(true);
        hs.add(null);
        hs.add(100.5);
        hs.add(10);

        System.out.println(hs);       //[null, 100, Hashset, 100.5, 10, true]
        //insertion order not maintained
        //only one null and duplicate value not allowed
        //used for hetrogeneous data and homogeneous data


        //remove specific value from hashset
        hs.remove(100);    //direct value is been passed to parameter
        System.out.println("After removing " + hs);

        //insert element in hashing
        //it is not possible in hashset because of the unordering of hashset

        //accessing specific element from hashset is also not possible due to index directly but there is a wayaround

        //Convert hasset into arraylist collection
        ArrayList al = new ArrayList(hs);
        System.out.println(al.get(2));

        //size of hashset
        System.out.println("Size of hashset " + hs.size());


        //cannot read the hashset data from for loop due to indexing not available

        //read all the data from hash set using for each
        for(Object x : hs){
            System.out.println(x);
        }


        //using iterator
        Iterator < Object> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



        //clearing all the values from Hashset
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.isEmpty());         //true



    }
}
