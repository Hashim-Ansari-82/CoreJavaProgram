package arrayprogram;

class ArrayOfObject{
   String name;
   int id;
   int age;
   public static void main(String[] args){
      ArrayOfObject ao=new ArrayOfObject();
	  ao.name="Hashim";
	  ao.id=101;
	  ao.age=20;
	  ArrayOfObject ao1=new ArrayOfObject();
	  ao1.name="Hashim Ansari";
	  ao1.id=103;
	  ao1.age=25;
	   ArrayOfObject ao2=new ArrayOfObject();
	  ao2.name="Mohd Hashim";
	  ao2.id=104;
	  ao2.age=18;
	  
	  System.out.println("Array Of Object");
	  ArrayOfObject[] a=new ArrayOfObject[3];
	  
	  a[0]=ao;
	  a[1]=ao1;
	  a[2]=ao2;
	  for(int i=0; i<a.length; i++){
		  
	  System.out.println("<--------------------------------->");	  
      System.out.println("Student name = "+a[i].name +"\n"+"Student id = "+a[i].id +"\n"+"Student age = "+a[i].age);	
	  
      
      }
   }
}