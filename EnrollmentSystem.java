import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EnrollmentSystem {

    static ArrayList<Person> students = new ArrayList<>();

    public static void main(String[] args) {

        JFrame f = new JFrame("Enrollment System");

        // TITLE
        JLabel title = new JLabel("STUDENT ENROLLMENT SYSTEM");
        title.setBounds(300, 30, 300, 30);

        // ================= ROW 1 =================
        JLabel label1 = new JLabel("First Name:");
        label1.setBounds(40, 80, 80, 30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(120, 80, 140, 30);

        JLabel label2 = new JLabel("Middle Name:");
        label2.setBounds(280, 80, 90, 30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(370, 80, 140, 30);

        JLabel label3 = new JLabel("Last Name:");
        label3.setBounds(530, 80, 80, 30);
        JTextField tf3 = new JTextField();
        tf3.setBounds(610, 80, 140, 30);

        // ================= ROW 2 =================
        JLabel label4 = new JLabel("Student No:");
        label4.setBounds(40, 140, 80, 30);
        JTextField tf4 = new JTextField();
        tf4.setBounds(120, 140, 140, 30);

        JLabel labelBirth = new JLabel("Birth Date:");
        labelBirth.setBounds(280, 140, 80, 30);
        JTextField tfBirth = new JTextField("MM/DD/YYYY");
        tfBirth.setBounds(360, 140, 140, 30);

        JLabel label5 = new JLabel("Gender:");
        label5.setBounds(530, 140, 60, 30);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(590, 140, 60, 30);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(650, 140, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // ================= ADDRESS =================
        JLabel label6 = new JLabel("Address:");
        label6.setBounds(40, 200, 80, 30);
        JTextField tf5 = new JTextField();
        tf5.setBounds(120, 200, 400, 30);

        // ================= COURSE =================
        JLabel label7 = new JLabel("Course:");
        label7.setBounds(40, 260, 80, 30);

        String[] courses = {"BSIT", "BSCE", "BSABE", "BSCPE", "BSGE"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(120, 260, 140, 30);

        // ================= YEAR LEVEL =================
        JLabel label8 = new JLabel("Year Level:");
        label8.setBounds(300, 260, 80, 30);

        String[] years = {"1", "2", "3", "4"};
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(390, 260, 140, 30);

        // ================= CONTACT =================
        JLabel label9 = new JLabel("Contact:");
        label9.setBounds(40, 320, 80, 30);
        JTextField tf9 = new JTextField();
        tf9.setBounds(120, 320, 140, 30);

        // ================= EMAIL =================
        JLabel label10 = new JLabel("Email:");
        label10.setBounds(300, 320, 80, 30);
        JTextField tf10 = new JTextField();
        tf10.setBounds(360, 320, 220, 30);

        // ================= BUTTONS =================
        JButton submit = new JButton("Submit");
        submit.setBounds(250, 390, 120, 35);

        JButton view = new JButton("View Students");
        view.setBounds(400, 390, 150, 35);

        // ================= SUBMIT =================
        submit.addActionListener(e -> {

            String studentNo = tf4.getText();
            String first = tf1.getText();
            String middle = tf2.getText();
            String last = tf3.getText();
            String birth = tfBirth.getText();
            String address = tf5.getText();
            String contact = tf9.getText();
            String email = tf10.getText();

            String gender = male.isSelected() ? "Male" :
                    female.isSelected() ? "Female" : "";

            String course = courseBox.getSelectedItem().toString();
            int year = Integer.parseInt(yearBox.getSelectedItem().toString());

            Person student = new Student(
                    studentNo,
                    first,
                    middle,
                    last,
                    birth,
                    gender,
                    address,
                    contact,
                    email,
                    course,
                    year
            );

            students.add(student);

            JOptionPane.showMessageDialog(f, "Student Enrolled Successfully!");

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tfBirth.setText("");
            tf5.setText("");
            tf9.setText("");
            tf10.setText("");
            bg.clearSelection();
        });

        // ================= VIEW =================
        view.addActionListener(e -> {

            String list = "REGISTERED STUDENTS\n\n";

            for (Person p : students) {
                list += p.getDetails();
            }

            JOptionPane.showMessageDialog(f, list);
        });

        // ================= ADD COMPONENTS =================
        f.add(title);

        f.add(label1); f.add(tf1);
        f.add(label2); f.add(tf2);
        f.add(label3); f.add(tf3);

        f.add(label4); f.add(tf4);
        f.add(labelBirth); f.add(tfBirth);
        f.add(label5); f.add(male); f.add(female);

        f.add(label6); f.add(tf5);
        f.add(label7); f.add(courseBox);
        f.add(label8); f.add(yearBox);

        f.add(label9); f.add(tf9);
        f.add(label10); f.add(tf10);

        f.add(submit);
        f.add(view);

        // ================= FRAME =================
        f.setSize(850, 550);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}