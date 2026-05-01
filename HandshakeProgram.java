import java.util.Scanner;

public class HandshakeProgram {

    
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

       
        if (numberOfStudents < 0) {
            System.out.println("Invalid number of students");
        } else {
            int result = calculateHandshakes(numberOfStudents);

            
            System.out.println("The maximum number of handshakes is " + result);
        }

        sc.close();
    }
}