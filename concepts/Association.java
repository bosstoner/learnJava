// Association: A relationship between two separate classes, where objects of one class are connected with objects of another class.

// Class representing a Teacher
public class Teacher {
    private String name;
    
    // Constructor for Teacher class
    public Teacher(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

// Class representing a Student
public class Student {
    private String name;
    
    // Constructor for Student class
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

// Class representing a Course, with an association between Teacher and Student
public class Course {
    private String name;
    private Teacher teacher; // Association: Course has a Teacher
    private List<Student> students; // Association: Course has a collection of Students
    
    // Constructor for Course class
    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public String getCourseDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Course: ").append(name).append("\n");
        details.append("Teacher: ").append(teacher.getName()).append("\n");
        details.append("Students: ").append("\n");
        for (Student student : students) {
            details.append("- ").append(student.getName()).append("\n");
        }
        return details.toString();
    }
}

// Creating objects of Teacher, Student, and Course classes
Teacher teacher = new Teacher("John Doe");
Student student1 = new Student("Alice");
Student student2 = new Student("Bob");

// Creating a Course object and adding students
Course mathCourse = new Course("Mathematics", teacher);
mathCourse.addStudent(student1);
mathCourse.addStudent(student2);

// Retrieving course details
String courseDetails = mathCourse.getCourseDetails();
System.out.println(courseDetails);
