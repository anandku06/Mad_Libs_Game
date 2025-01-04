import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adj1, n1, adj2, v1, adj3;

        System.out.print("Enter an adjective (description): ");
        adj1 = scanner.nextLine();

        System.out.print("Enter a noun (person/animal): ");
        n1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adj2 = scanner.nextLine();

        System.out.print("Enter a verb ending with -ing (action): ");
        v1 = scanner.nextLine();

        System.out.print("Enter another adjective (description): ");
        adj3 = scanner.nextLine();

        System.out.println("Today I went to a " + adj1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + n1 + ".");
        System.out.println(n1 + " was " + adj2 + " and " + v1 + "!");
        System.out.println("I was " + adj3 + "!");

        scanner.close();
    }
}
