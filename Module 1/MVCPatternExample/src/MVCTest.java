public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setId("S12345");
        student.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentGrade("A+");
        System.out.println("\nAfter updating student grade:");
        controller.updateView();
    }
}
