//this can be used to invoke current class constructor
//default costructor from parametered constructor

class A{
  A(){
    System.out.println("Hello ,i am default constructor");
  }
  A(int x)
  {
    this();
    {
      System.out.println("Value of x="+x);
    }
  }
  public class TestA{
    public static void main(String[]args)
    {
      A a=new A(5);
    }
  }
}

      