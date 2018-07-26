// parametered constructor
class Student{
  int roll;
  String name;
  float fee;
  Student(int r,String n,float f)
  {
    roll=r;
    name=n;
    fee=f;
  }
  void display(){
    System.out.println(roll+" "+name+" "+fee);
  }
}

class Record1{
  public static void mian(String[]args)
  {
    Student s1=new Student(26,"Dipesh",5000);
    Student s2=new Student(2,"Anil",200);
    s1.display();
    s2.display();
  }
}

    