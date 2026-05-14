public class Student extends Person {

    private String course;
    private int yearLevel;

    public Student(String studentNo, String firstName, String middleName,
                   String lastName, String birthDate,
                   String gender, String address,
                   String contact, String email,
                   String course, int yearLevel) {

        super(studentNo, firstName, middleName,
                lastName, birthDate, gender, address,
                contact, email);

        this.course = course;
        this.yearLevel = yearLevel;
    }

    @Override
    public String getDetails() {

        return "Student No: " + getStudentNo() +
                "\nName: " + getFirstName() + " " +
                getMiddleName() + " " +
                getLastName() +

                "\nBirth Date: " + getBirthDate() +
                "\nGender: " + getGender() +
                "\nAddress: " + getAddress() +
                "\nContact: " + getContact() +
                "\nEmail: " + getEmail() +

                "\nCourse: " + course +
                "\nYear Level: " + yearLevel +

                "\n---------------------------\n";
    }
}