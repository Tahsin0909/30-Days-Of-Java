// Create a Java class named Student with three attributes: id (int), name (String), and age (int). Implement a 
// constructor that validates the input: the ID must be greater than 0, the name must not be null, empty, or contain only whitespace, and the age 
// must be between 1 and 100 inclusive. If any value is invalid, throw an IllegalArgumentException with a suitable error message. Override the toString()
//  method to display student details in the format Student{id=1, name='Rahim', age=20}. 
// and objects of other classes.
public class ValidStudent {

    /**
     * Student
     */
    public static class Student {
        int id;
        String name;
        int age;

        public void setStudent(int id, String name, int age) {
            if (id <= 0) {
                throw new IllegalArgumentException("Id is invalid");
            }
            if (name == null || name == " " || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name is invalid");
            }
            if (age <= 0 || age > 100) {
                throw new IllegalArgumentException("Age is invalid");
            }
            this.age = age;
            this.id = id;
            this.name = name;

        }

        @Override
        public String toString() {
            return "Student{id=" + this.id + ", name=" + this.name + ", age=" + this.age + "}";
        }
    }

    public static void main(String[] args) {
        Student tamim = new Student();
        tamim.setStudent(10, "Tamim", 10);
        System.out.println(tamim.toString());
    }
}
