class Box{
  double length;
  double breadth;
  double height;

double volume(){
  return (length*breadth*height);
}
}
public class BoxDemo{
  public static void main(String[]args)
  {
    Box b1= new Box(10,10,10);
   
    Box b2=new Box(10,10,10); 
    
    double vol;
    vol=b1.volume();
    System.out.println("Volume of b1="+vol);
    vol=b2.volume();
    System.out.println("Volume of b2 ="+vol);
  }
}