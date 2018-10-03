package example;

class Greeter {
  static String greet(String name) {
    return (name == null) ? "Hello world!" : String.format("Hello %s!", name);
  }
}
