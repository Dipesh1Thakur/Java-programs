class Box{
  double length,bredth,height;
  Box(Box ob)
  {
    length=ob.length;
    bredth=ob.bredth;
    height=ob.height;
  }
  Box(double l,double b,double h)
  {
    length=l;
    bredth=b;
    height=h;
  }
  
  double volume()
  {
    return length*bredth*height;
  }
}

public class TestObjectArg{
  public static void main(String[]args)
  {
    Box mybox =new Box (10,20,15);
    Box myclone =new Box (mybox);
    double vol;
     // get volume of mybox
    vol=mybox.volume();
    System.out.println("Volume of box ="+vol);
    //get volume of clone
    vol= myclone.volume();
    System.out.println("Volume of clone ="+vol);
  }
}