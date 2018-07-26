//class and object 

class Car
{
  String name;
  double number;
  String color;
}

public class Testcar{
  public static void main(String[]args)
  {
     Car merceedes =new Car();
     merceedes.name="merceedes";
    merceedes.number=555;
    merceedes.color="Red";
    
    System.out.println("Car name is "+merceedes.name);
     System.out.println("Car number is "+merceedes.number); 
       System.out.println("Car color is "+merceedes.color);
  }
}