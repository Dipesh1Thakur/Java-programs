class Student{
  String name;
  double fee;
  int rollno;
  Student (String name,double fee,int rollno)
  {
    this.name=name;
    this.fee=fee;
    this.rollno=rollno;
  }
  void display(){
    System.out.println(name+" "+ rollno+" "+fee);
  }
}

public class record{
public static void main(String[]args)
{
  Student s1=new Student("Dipesh",12,45554);
   Student s2=new Student("karma",13,43454);
   s1.display();
   s2.display();
}
}
