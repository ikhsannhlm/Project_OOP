package Interface;

import Main.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ChatMenu {
    private Scanner input;
    private MainMenu mainMenu;
    private CurrentUser currentUser;
    private List<User> userList;

    public ChatMenu(CurrentUser currentUser, List<User> userList, MainMenu mainMenu) {
        this.currentUser = currentUser;
        this.userList = userList;
        this.mainMenu = mainMenu;
        input = new Scanner(System.in);
    }

    public void showChatMenu() {
        short choice;
        boolean loop = true;

        do {
            System.out.println();
            System.out.println("Chat Menu: ");
            System.out.println("1. Personal Chat");
            System.out.println("2. Group Chat");
            System.out.println("3. Pinned Chat");
            System.out.println("4. Starred Chat");
            System.out.println("5. Archive Chat");
            System.out.println("6. Delete Chat");
            System.out.println("7. Open Camera");
            System.out.println("8. Search something");
            System.out.println("9. Back to main menu");
            System.out.print("Your choice: ");

            try {
                choice = input.nextShort();
                input.nextLine();
                processChoice(choice);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.\n");
                showChatMenu();
            }
        } while (loop);
    }

    public void processChoice(short choice) {
        switch (choice) {
            case 1:
                PersonalChat personalChat = new PersonalChat(currentUser, userList, this);
                personalChat.showPersonalChatMenu();
                break;
            case 2:
                System.out.println("Group Chat");
                System.out.println("Coming Soon");
                break;
            case 3:
                System.out.println("Pinned Chat");
                System.out.println("Coming Soon..");
                break;
            case 4:
                System.out.println("Starred Chat");
                System.out.println("Coming Soon..");
                break;
            case 5:
                System.out.println("Archive Chat");
                System.out.println("Coming Soon..");
                break;
            case 6:
                System.out.println("Delete Chat");
                System.out.println("Coming Soon..");
                break;
            case 7:
                System.out.println("Open Camera");
                System.out.println("Coming Soon..");
                break;
            case 8:
                System.out.println("Search something");
                System.out.println("Coming Soon..");
                break;
            case 9:
                System.out.println("Back to main menu");
                mainMenu.showMenu();
                break;
            default:
                System.out.println(choice + " is not available");
                System.out.println("Please try again..\n");
        }
    }
}
