class Name
{
  void ram()
  {
    System.out.println("hi! i am ram");
  }
  void shyam(){
    System.out.println("Hello !! i am shyam");
    this.ram();
  }
}
public class studentName{
  
  public static void main(String args[]){
    Name n = new Name();
    n.shyam();
  }
}
