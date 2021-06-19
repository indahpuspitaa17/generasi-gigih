import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nama depan: ");
    String firstName = scanner.next();
    
    String lastName = scanner.next();
    System.out.println("Nama belakang: ");
    
    System.out.println("Nama saya adalah " + firstName + lastName + ".");
    
  }
}
