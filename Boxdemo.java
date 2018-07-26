//non-parametered constructor

class Box{
  double length;
  double breadth;
  double height;
  
  Box(){
    length=10;
    breadth=10;
    height=10;
  }
  double volume(){
    return(length*breadth*height);
  }
}

public class Boxdemo{
  public static void main(String[]args)
  {
    Box b1=new Box();
    double vol;
    vol=b1.volume();
    System.out.println("Volume is :"+vol);
  }
}

    