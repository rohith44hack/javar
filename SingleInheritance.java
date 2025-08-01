class Car{
String name="BENZ";
int model=2023;

void display1(){
    System.out.print("Name is "+name);
    System.out.print("Model is "+model);
}
}

class B extends Car{
String color="black";
String type="sedan";

void display2(){
    System.out.println("COlor is "+color);
    System.out.println("Type is "+type);
}
}

public class SingleInheritance {

public static void main(String[] args) {
    B obj = new B();
    
    obj.display1();
    obj.display2();
}
}