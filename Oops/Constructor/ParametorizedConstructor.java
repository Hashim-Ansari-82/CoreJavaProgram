package Oops.Constructor;

public class ParametorizedConstructor {

     int age;
     String name;

    public ParametorizedConstructor(String newName, int newAge){
      age=newAge;
      name=newName;
      System.out.println("Name = "+name+"\n"+"Age = "+age);
     }
    public static void main(String[] args) {
       new ParametorizedConstructor("Hashim Ansari",20);
        
     }
}
