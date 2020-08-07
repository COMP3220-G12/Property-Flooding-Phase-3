import java.util.ArrayList;

public class Findflood {
    private String street;
    private ArrayList<Record> floods;

    //overloaded constructor to set values
    public Findflood(String street, ArrayList<Record> floods)
    {
        this.street = street;
        this.floods = floods;
    }

    //create a list for the nearest community centres
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