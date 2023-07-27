import java.sql.SQLOutput;
import  java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> Colours = new ArrayList<String>();
        Colours.add("green");
        Colours.add("red");
        Colours.add("blue");
        Colours.add("pink");
        System.out.println(Colours);

        //iterating through an array list
        for (String Colour:Colours
             ) {
            System.out.println(Colour);

            //Inserting an element at the first position in an array list
            Colours.add(0,"black");
            System.out.println(Colours);

            //Removing a colour from the array
            Colours.remove(2);
            System.out.println(Colours);

            //search for an element in an arraylist
            boolean search = Colours.contains("red");
            boolean searches = Colours.contains("pink");
            System.out.println(search);
            System.out.println(searches);

            //sorting elements in an arraylist
            Collections.sort(Colours);
            System.out.println(Colours);

            //copying an arraylist into another
            ArrayList<String> newColours = new ArrayList<String>();
            newColours.add("yellow");
            newColours.add("orange");
            newColours.add("purple");
            newColours.add("white");
            Collections.copy(newColours,Colours);
            System.out.println(Colours);
            System.out.println(newColours);


            //program to shuffle elements in an arraylist
            Collections.shuffle(Colours);
            System.out.println(Colours);

            //program to reverse elements
            Collections.reverse(Colours);
            System.out.println(Colours);
        }
    }
}


