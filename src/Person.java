import java.util.Calendar;
public class Person
{
    private String idNum;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person(String idNum, String firstName, String lastName, String title, int YOB)
    {
        this.idNum = idNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getidNum() {
        return idNum;
    }
    public void setidNum(String idNum) {
        this.idNum = idNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName()
    {
        return firstName + " " + lastName;
    }

    public String formalName()
    {
        return title + " " + fullName();
    }

    public int getAge()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - YOB);
    }

    public int getAge(int year)
    {
        return (year - YOB);
    }

    public String toCSVDataRecord() {
        return idNum + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNum='" + idNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }


}