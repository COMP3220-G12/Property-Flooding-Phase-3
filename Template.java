interface Template
{
    public static final int NUMBER_OF_FIELDS = 7;
    public static final String[] LABELS = {"Request", "Section", "Contact", "Date", "Unit", "Street", "Ward"};
    public static final String[] TYPES = {"String", "String", "String", "String", "String", "String", "String"};
    public static final String FILENAME = "PropertyFlooding.csv";
    public static final String DELIMITER = ",";
    public static final int PRIMARY_KEY_FIELD_INDEX = 5;
}