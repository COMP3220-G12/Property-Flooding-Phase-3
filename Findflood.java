//This class is designed to display all the flood services history according to street name entered by user
//It maintains high cohesion since it only contains elements related to finding the flood requests. 

import java.util.ArrayList;

public class Findflood {
    //attributes
    private String street;
    private ArrayList<Record> floods;

    //overloaded constructor to set values
    public Findflood(String street, ArrayList<Record> floods)
    {
        this.street = street;
        this.floods = floods;
    }

    //create a list for the flood requests in specific streets entered by user 
    public ArrayList<Record> find()
    {
        ArrayList<Record> sameStreet = new ArrayList<>();
        for(Record i: floods)
        {
            if(i.getValue(5).compareToIgnoreCase(street)==0)
            {
                sameStreet.add(i);
                System.out.println(i);
            }
        }
        return sameStreet;
    }

}
