package hello;


public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("The current local time is: " + System.currentTimeMillis());

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}