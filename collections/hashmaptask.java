import java.util.*;

public class hashmaptask {

    public static void main(String[] args) {
        Map<Integer, String[]> hm1 = new HashMap<>();

        String[] st1 = {"Roll No", "Name", "Email-ID", "sub1", "sub2", "sub3", "Rank"};
        String[] st3 = {"st-2", "def", "def@gmail.com", "95.67", "94.50", "94.60", "B"};
        String[] st2 = {"st-1", "abc", "abc@gmail.com", "98.00", "97.00", "96.00", "A"};
        String[] st4 = {"st-3", "ghi", "ghi@gmail.com", "92.00", "91.50", "90.75", "C"};

        hm1.put(1, st1);
        hm1.put(2, st2);
        hm1.put(3, st3);
        hm1.put(4, st4);

        List<String[]> students = new ArrayList<>(hm1.values());
        
        // Remove header row for processing
        students.remove(0);

        // Calculate averages and store along with rank
        List<StudentWithAverage> studentList = new ArrayList<>();
        for (String[] student : students) {
            String rollNo = student[0];
            String name = student[1];
            String emailId = student[2];
            double sub1 = Double.parseDouble(student[3]);
            double sub2 = Double.parseDouble(student[4]);
            double sub3 = Double.parseDouble(student[5]);
            double average = (sub1 + sub2 + sub3) / 3.0;
            String rank = student[6];

            studentList.add(new StudentWithAverage(rollNo, name, emailId, sub1, sub2, sub3, average, rank));
        }

        // Sort students by rank
        studentList.sort(Comparator.comparing(student -> student.rank));

        displayTable(studentList);
    }

    public static void displayTable(List<StudentWithAverage> students) {
        System.out.printf("%-10s %-10s %-20s %-10s %-10s %-10s %-10s %-10s%n",
                "Roll No", "Name", "Email-ID", "Sub1", "Sub2", "Sub3", "Average", "Rank");
        System.out.println("--------------------------------------------------------------------------------------------");

        for (StudentWithAverage student : students) {
            System.out.printf("%-10s %-10s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10s%n",
                    student.rollNo, student.name, student.emailId, student.sub1, student.sub2, student.sub3, student.average, student.rank);
        }
    }

    static class StudentWithAverage {
        public String rollNo, name, emailId;
        public double sub1, sub2, sub3, average;
        public String rank;

        public StudentWithAverage(String rollNo, String name, String emailId, double sub1, double sub2, double sub3, double average, String rank) {
            this.rollNo = rollNo;
            this.name = name;
            this.emailId = emailId;
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
            this.average = average;
            this.rank = rank;
        }
    }
}
