public class StudentMaker {
  
  public static void main(String[] args) {
    Address address = new Address();
    Student student = new Student();

    student.setFirstName("Bella");
    System.out.println(student.getAge());
    int age = student.birthday();
    System.out.println(age);
    System.out.println(student);

    }
    
  }
  
}
