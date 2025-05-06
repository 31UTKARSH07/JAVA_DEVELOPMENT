
package Interfaces;

public interface testinterface {
    final int a = 10;
    void display();
}
class TestClass implements testinterface{
    public void display(){
        System.out.println("geeks");
    }
}

class Geeks{
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(testinterface.a);
    }
}



//  To declare an interface, use the interface keyword.
//  It is used to provide total abstraction.
//  That means all the methods in an interface are
//  declared with an empty body and are public and all fields are public,
//  static, and final by default. A class that implements an interface must
//  implement all the methods declared in the interface. To implement the
//  interface, use the implements keyword.