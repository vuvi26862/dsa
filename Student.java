public class Student {
    private String studentId;
    private String fullName;
    private double grade;
    private String rank;

    public Student(String studentId, String fullName, double grade) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.grade = grade;
        this.rank = StudentUtils.calculateRank(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public double getGrade() {
        return grade;
    }

    public String getRank() {
        return rank;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
        this.rank = StudentUtils.calculateRank(grade);
    }

    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + fullName + ", Grade: " + grade + ", Rank: " + rank;
    }
}
