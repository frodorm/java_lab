import java.util.Scanner;


// не сделал так как в первых трех лекциях нет об этом
// в ту-ду: обработка текстового ввода там где ожидаем числовой
// в ту-ду: переделать банкАккаунт чтобы он отдавал только данные, но
// показалось, что для данной лабы и так сойдет, потом, если надо будет, просто отрефакторю в ходе работы над 2 лабой

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] mainMenu = {"Выйти", "Просмотр счетов", "Выбрать счет", "Подсчет открытых счетов"};
    static String[] accountMenu = {"В главное меню", "Информация о счете", "Пополнить счет", "Снять денежные средства"};
    static boolean running = true;
    static BankAccount[] bank = {
            new BankAccount("Vitya", "1A", 100),
            new BankAccount("Fedya", "1B"),
            new BankAccount("Dima", "1C", 1000),
    };

    public static void main(String[] args) {
        System.out.println("Привет-привет");
        while (running) {
            for (int i = 0; i < accountMenu.length; i++) {
                System.out.println(i + " - " + mainMenu[i]);
            }
            String mainMenuItem = scanner.nextLine();
            switch (mainMenuItem) {
                case "0":
                    running = false;
                    break;
                case "1":
                    for (BankAccount account: bank) {
                        System.out.println(account.getAccountNumber());
                    }
                    break;
                case "2":
                    System.out.println("Введите номер счета из меню");
                    for (int i = 0; i < bank.length; i++) {
                        System.out.println(i + ": " + bank[i].getAccountNumber());
                    }
                    int accountIndex = scanner.nextInt();
                    scanner.nextLine();
                    if (accountIndex >= 0 && accountIndex < bank.length) {
                        BankAccount currentAccount = bank[accountIndex];
                        account(currentAccount);
                    } else {
                        System.out.println("Выберите номер счета из списка");
                    }
                    break;
                case "3":
                    System.out.println("Всего открыто счетов: " + BankAccount.accountsCount);
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
            System.out.println("Жмите enter чтобы продолжить");
            scanner.nextLine();
        }
    }

    public static void account(BankAccount currentAccount) {
        boolean accountRunning = true;
        System.out.println("Меню счета " + currentAccount.getAccountNumber());
        while (accountRunning){
            for (int i = 0; i < mainMenu.length; i++) {
                System.out.println(i + " - " + accountMenu[i]);
            }
            String accountMenuItem = scanner.nextLine();
            switch (accountMenuItem) {
                case "0":
                    accountRunning = false;
                    currentAccount = null;
                    break;
                case "1":
                    currentAccount.showFullInfo();
                    break;
                case "2":
                    System.out.println("Введите сумму");
                    currentAccount.deposite(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Введите сумму");
                    currentAccount.withdraw(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
            System.out.println("Для продолжения нажмите enter");
            scanner.nextLine();
        }
    }
}
