//parametered constructor  from default constructor


class B{
  B(){
    this(10);
    System.out.println("Hello from default constructor");
  }
  B(int x){
    System.out.println("Value of x ="+x);
  }
}
public class TestB{
  public static void main(String[]args)
  {
    B b=new B();
  }
}
