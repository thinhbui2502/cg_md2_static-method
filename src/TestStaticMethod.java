public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Thinh");
        Student s2 = new Student(222, "Kim Anh");
        Student s3 = new Student(333, "King");

        s1.display();
        s2.display();
        s3.display();
    }
}
