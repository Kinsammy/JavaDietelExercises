package revisionWithChief;

public class Native {
    private String nativeId;
    private String firstName;
    private String surname;
    private static String chief = "Sam Immanuel";
    private Cohorts cohorts;
    private Laptop laptop;


    public Native(String firstName){
        this.firstName = firstName;
    }

    public Native(String id, String fName, String lastName){
        this(fName, lastName);
        this.nativeId = id;
        this.surname = lastName;
    }

    public Native(String fName, String lastName){
        this(fName);
        this.surname = lastName;
    }

    public Native() {

    }

    public String getNativeId() {
        return nativeId;
    }

    public void setNativeId(String nativeId) {
        this.nativeId = nativeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getChief() {
        return chief;
    }

    public static void setChief(String chief) {
        Native.chief = chief;
    }

    public int countNatives() {
        return 1;
    }

    public int countNatives(String cohortName) {
        int count = 0;
        if(cohortName.equalsIgnoreCase("Paragon"))
            count = 37;
        else if (cohortName.equalsIgnoreCase("Regnos")) {
            count = 87;
        }
        return count;
    }

    public int countNatives(String cohortName, String hostel) {
        int count = 0;
        if(cohortName.equals("Paragon") && hostel.equals("Juno"))
            count = 5;
        else if (cohortName.equals("Regnos") && hostel.equals("Juno")){
            count = 87;
        }
        return count;

    }

    public Native findNatives(Native[] natives) {
        return null;
    }

    public Cohorts getCohorts() {
        return cohorts;
    }

    public void setCohorts(Cohorts cohorts) {
        this.cohorts = cohorts;
    }

    public Laptop getLaptop() {
        return laptop;
    }
}
