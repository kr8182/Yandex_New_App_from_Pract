import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � ��� �������� �� ��������?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("������� ���� �� ��������?");
        int daysBeforeSalary = scanner.nextInt();

        Converter converter = new Converter(94.8,103.8,13.1);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("���� ����������: " + moneyBeforeSalary + " RUB");
                System.out.println("� ����� ������ ������ ��������������? ��������� ��������: 1 - USD, 2 - EUR, 3 - CNY.");
                int currency = scanner.nextInt();
                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                System.out.println("������� ������ �����:");
                double expense = scanner.nextDouble();
                System.out.println("� ����� ��������� ��������� �����?");
                String category = scanner.next();
                moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, category, expense);
            } else if (command == 4) {
                expensesManager.printAllExpensesByCategories();
            } else if (command == 5) {
                System.out.println("� ����� ��������� ������?");
                String category = scanner.next();
                System.out.println("����� ������� ����� � ��������� " + category + " ��������� "
                        + expensesManager.findMaxExpenseInCategory(category) + " ���.");
            } else if (command == 6) {
                expensesManager.removeAllExpenses();
            } ... { // �������� ��������� ������ ����
                System.out.println("����� ���������: " + ...);
            } ... {
                System.out.println("����� ��������� �� ������ �������?");
                String category = scanner.next();
                ...
            } ... {
                // ����������� ����� "� ��������� ���_��������� �� ��������� ������ �����.");
            } else if (command == 0) {
                System.out.println("�����");
                break;
            } else {
                System.out.println("��������, ����� ������� ���� ���.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("��� �� ������ �������? ");
        System.out.println("1 - �������������� ������");
        System.out.println("2 - �������� �����");
        System.out.println("3 - ������ �����");
        System.out.println("4 - �������� ����� �� ����������");
        System.out.println("5 - �������� ����� ������� ����� � ��������� ���������");
        System.out.println("6 - �������� ������� ����");
        System.out.println("7 - ������� ����� ���� ����");
        System.out.println("8 - ������� ���������");
        System.out.println("9 - �������� ��� ����� ������� ���������");
        System.out.println("0 - �����");
    }
}