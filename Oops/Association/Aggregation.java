package Oops.Association;

class Student{
    String name,address;
    int rollno;
    Student(String name,String address,int rollno){
        this.name=name;
        this.address=address;
        this.rollno=rollno;
    }
    public void detail(){
        System.out.println("Student name : "+name);
        System.out.println("Student Address : "+address);
        System.out.println("Student Rollno : "+rollno);
    }
}
class Employee {
    String name;
    int id;
    Student s;
    Employee(String name,int id, Student s){
        this.name=name;
        this.id=id;
        this.s=s;
    }
    public void showDetail(){
        s.detail();
        System.out.println("Employee Name : "+name);
        System.out.println("Employee id : "+id);
    }
}
class Aggregation{
    public static void main(String[] args) {
        Student s=new Student ("Rani Ansari","uttar pradesh",12);
        Employee e=new Employee("Hashim Ansari", 82,s);
        e.showDetail();

    }
}