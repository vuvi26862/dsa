public class StudentManager {
    private Node head;

    public StudentManager() {
        this.head = null;
    }

    public void addStudent(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public void editStudent(String studentId, double newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.getStudent().getStudentId().equals(studentId)) {
                temp.getStudent().setGrade(newGrade);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void editStudentName(String studentId, String newName) {
        Node temp = head;
        while (temp != null) {
            if (temp.getStudent().getStudentId().equals(studentId)) {
                temp.getStudent().setFullName(newName);
                break;
            }
            temp = temp.getNext();
        }
    }

    public void deleteStudent(String studentId) {
        if (head == null) return;

        if (head.getStudent().getStudentId().equals(studentId)) {
            head = head.getNext();
            return;
        }

        Node temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getStudent().getStudentId().equals(studentId)) {
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
    }

    public void sortStudents() {
        if (head == null || head.getNext() == null) return;

        Node current = head;
        while (current != null) {
            Node index = current.getNext();
            while (index != null) {
                if (current.getStudent().getGrade() < index.getStudent().getGrade()) {
                    Student temp = current.getStudent();
                    current.setStudent(index.getStudent());
                    index.setStudent(temp);
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }

    public Student searchStudent(String studentId) {
        Node temp = head;
        while (temp != null) {
            if (temp.getStudent().getStudentId().equals(studentId)) {
                return temp.getStudent();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void displayStudents() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
    }
}
