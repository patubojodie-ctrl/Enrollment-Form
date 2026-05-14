public abstract class Person {

    private String studentNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private String gender;
    private String address;
    private String contact;
    private String email;

    public Person(String studentNo, String firstName, String middleName,
                  String lastName, String birthDate,
                  String gender, String address,
                  String contact, String email) {

        this.studentNo = studentNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public String getStudentNo() { return studentNo; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getBirthDate() { return birthDate; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getContact() { return contact; }
    public String getEmail() { return email; }

    public abstract String getDetails();
}