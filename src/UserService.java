import java.util.Scanner;

public class UserService extends User {
    private  Scanner scanner = new Scanner(System.in);


    public void logIn() {
        System.out.println("Write your login");
        String names = scanner.nextLine();
        for (int i = 0; i <= getList().size()-1; i++) {
            if (names.equals(getList().get(i))) {
                System.out.println("Write your password");
                String userPasswords = scanner.nextLine();
                for (int j = 0; j < getPasswords().size(); j++) {
                    if (userPasswords.equals(getPasswords().get(j))) {
                        System.out.println("Welcome to our shop");
                    }
                    else if (!userPasswords.equals(getPasswords().get(j))){
                        System.out.println("Sorry, you enter an incorrect password");
                    }
                }
            }
            else System.out.println("This login doesn't exist");
        }
    }

    public void register() {
        System.out.println("Please, enter your user name");
        getList().add(scanner.nextLine());
        System.out.println("Please, enter your password");
        getPasswords().add(scanner.nextLine());
        System.out.println("Your account was successfully registered");
    }

    public void searchUser() {
        System.out.println("Write searching user's name ");
        String name = scanner.nextLine();
        for (int i = 0; i < getList().size(); i++) {
            if (name.equals(getList().get(i))) {
                System.out.println("This user exist in our DataBase");
            }
            else System.out.println("Sorry, this user is not find");
        }
    }

    public void allUsers(){
        for (int i = 0; i < getList().size(); i++) {
            System.out.println("These are all our clients ");
            System.out.println("-> " + getList().get(i));
        }
    }
}

