package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        //declaration
        ArrayList mylist = new ArrayList();   // this declaration is for hetrogeneous data

        //ArrayList<Integer> intlist = new ArrayList<Integer>();    // this declaration is for homogeneous data, a wrapper
        //class is defined for that which data you want to store homogeneously

        //ArrayList<String> stringlist = new ArrayList<String>();

        // List mylist = new ArrayList();   // This is also correct


        //adding data into arrayList
        mylist.add(10);
        mylist.add(10.5);
        mylist.add("WELCOME");
        mylist.add(null);
        mylist.add(null);
        mylist.add(true);
        mylist.add('A');

        //Size of arraylist
        System.out.println("Size of arraylist " + mylist.size());


        //Printing data of arraylist
        System.out.println("Elements of arraylist " + mylist);

        //Removing element of arraylist
        mylist.remove(5);
        System.out.println("Elements of arraylist after removing" + mylist);

        //Insert element in arraylist
        mylist.add(2, "java");
        System.out.println("After insertion " + mylist);

        //modify the element in arraylist
        mylist.set(2, "javascript");
        System.out.println("After modification " + mylist);

        //access specific element from arraylist
        System.out.println(mylist.get(3));

        //reading all the elements from arraylist

        //using normal for loop
        for(int i=0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        //using for each loop
        for(Object x : mylist){
            System.out.println(x);
        }


        //using iterator  (only for collections it is usable)

        Iterator it = mylist.iterator();
        while  (it.hasNext()){             //check the next element is available or not
            System.out.println(it.next());     //print the element
        }


        //checking arraylist is empty or not
        System.out.println("is arraylist empty " + mylist.isEmpty());

        //removing elements from arraylist
        ArrayList mylist2 = new ArrayList();
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add('A');

        mylist.remove(mylist2);
        System.out.println("After removing elements " + mylist2);


        //remove all the elements from arraylist
        mylist.clear();
        System.out.println(mylist);
        System.out.println("is arraylist empty " + mylist.isEmpty());    //true

    }

}
