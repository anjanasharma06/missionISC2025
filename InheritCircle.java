import java.util.*;
public class InheritCircle
 {
    double radius;
    public InheritCircle()
    {
        this.radius=0.0;
    }
    public InheritCircle(double radius){
        this.radius=radius;
    }
    public void circleArea()
    {
        System.out.println("radius:"+ Math.PI*Math.pow(radius, 2));  
      }
    }
class Cylinder extends InheritCircle
{
    double height;
    public Cylinder()
    {
        super(0.0);       
         this.height=0.0;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public void  CylinderLsa()
    {
        System.out.println("Lsa:"+ 2*Math.PI*height*radius);
    }
    public void CylinderTsa()
    {
        System.out.println("Tsa:"+ 2* Math.PI*radius*(height+radius));
    }
}
class Main{
    public static void main(String[] args)
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the radius");
        double radius=sc.nextDouble();
        System.out.println("enter the height");
        double height=sc.nextDouble();
        Cylinder ob=new Cylinder(radius,height);
        ob.circleArea();
        ob.CylinderLsa();
        ob.CylinderTsa();

    }
}
 