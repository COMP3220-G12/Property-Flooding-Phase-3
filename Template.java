/** Template is an interface that works as the blueprint
 **  to construct any file in this program.
 ** It is used to maintain low coupling, and dependency as all chances happen here only.
 ** Following the Protected Variations pattern, it protects other classes from changes in Record class.
**/

interface Template
{
    public static final int NUMBER_OF_FIELDS = 7;
    public static final String[] LABELS = {"Request", "Section", "Contact", "Date", "Unit", "Street", "Ward"}; //lables from Flood Services file
    public static final String[] TYPES = {"String", "String", "String", "String", "String", "String", "String"};
    public static final String FILENAME = "PropertyFlooding.csv";
    public static final String DELIMITER = ",";
    public static final int PRIMARY_KEY_FIELD_INDEX = 5; //street name
}
