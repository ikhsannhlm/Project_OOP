package Interface;
import Main.User;
import java.util.List;
import java.util.Scanner;

public class PersonalChat {
    private Scanner input;
    private CurrentUser currentUser;
    private List<User> contacts;
    private ChatMenu chatMenu;

    public PersonalChat(CurrentUser currentUser, List<User> contacts, ChatMenu chatMenu) {
        this.currentUser = currentUser;
        this.contacts = contacts;
        this.chatMenu = chatMenu;
        input = new Scanner(System.in);
    }

    public void showPersonalChatMenu() {
        boolean loop = true;

        do {
            System.out.println();
            System.out.println("Personal Chat");
            System.out.println("==============");
            currentUser.displayContactList();
            currentUser.displayReceivedChat();
            System.out.println("Menu:");
            System.out.println("1. ");
            System.out.println("2. Open Chat");
            System.out.println("3. Add Contact");
            System.out.println("4. Broadcast");
            System.out.println("5. Back to Chat Menu");
            System.out.print("Your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    // showChats();
                    System.out.println("Coming Soon");
                    break;
                case 2:
                    // openChat();
                    System.out.println("Coming Soon");
                    break;
                case 3:
                    // addContact();
                    System.out.println("Coming Soon");
                    break;
                case 4:
                    // broadcast();
                    System.out.println("Coming Soon");
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (loop);
    }

    private void showChats() {
        System.out.println();
    }

    private void openChat() {
        System.out.println();
    }

    private void addContact() {
        System.out.println();
    }

    private void broadcast() {
        System.out.println();
    }
}
