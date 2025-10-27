// Polymorphism
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

}

public class class_object{
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.add(5,10));
        System.out.println(calc.add(5,10,15));
        System.out.println(calc.add(10.5,10.1));
        Vehicle v1;
        v1=new Vehicle();
        v1.start();
        v1=new Car();
        v1.start();
        v1=new Bike();
        v1.start();
        Area a1=new Area();
        a1.area(10);
        a1.area(20,40);
        a1.area(2.0);
    }
    
}

class Vehicle{
    public void start(){
        System.out.println("vehicle is starting");
    }
}
class Car extends Vehicle{
    public void start(){
        System.out.println("car start without key or button");
    }
}
class Bike extends Vehicle{
    public void start(){
        System.out.println("bike start with key and button");
    }
}

// Overload method area to compute area of square,rectangle& circle

class Area{
    public void area(int side){
        System.out.println(side*side);
    }
    public void area(int length,int width){
        System.out.println(length*width);
    }
    public void area(double r){
        System.out.println(3.14*r*r);
    }
}