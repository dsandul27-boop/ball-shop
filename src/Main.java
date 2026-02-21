import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        Balls ball = new Balls();
        User user = new User();

        while (0==0) {
            System.out.println("Hello, for your next actions, please: ");
            System.out.println("Tap <1> for register");
            System.out.println("Tap <2> for log in");
            System.out.println("Tap <3> for log out");
            System.out.println("Tap <4> for searching any user");
            System.out.println("Tap <5> to see all users");

            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    userService.register();
                    System.out.println(" ");
                    break;
                case 2:
                    userService.logIn();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Goodbye");
                    return;
                case 4:
                    userService.searchUser();
                    System.out.println(" ");
                    break;
                case 5:
                    userService.allUsers();
                    break;
            }
        }
    }
}