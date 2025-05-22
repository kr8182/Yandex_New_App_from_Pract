import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, String category, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("«начение сохранено! ¬аш текущий баланс в рубл€х: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            expenses.add(expense);
        } else {
            ArrayList<Double> expenses = new ArrayList<>();
            expenses.add(expense);
            expensesByCategories.put(category, expenses);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("Ќа вашем счету осталось совсем немного. —тоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        } else {
            System.out.println("“акой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear();
        System.out.println("“раты удалены.");
    }

    // напишите метод дл€ получени€ суммы всех трат
    double getExpensesSum(){
        for (String category : expensesByCategories.keySet()) {
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                maxCategorySum = maxCategorySum + expense;
            }

        }
        return maxCategorySum;
    }
    // напишите метод дл€ удалени€ категории
    void  removeCategory(String category){
        expensesByCategories.remove(category);
    }
    // напишите метод дл€ получени€ категории, где размер трат больше всего
    String getMaxCategoryName() {
        double maxCategoryPreSum;
        ArrayList<String> catWithSum = null;
        int maxIndex = 0;
        for (String category : expensesByCategories.keySet()) {
            catWithSum = new ArrayList<>();
            catWithSum.add(category);
            maxCategoryPreSum = findMaxExpenseInCategory(category);
            if (maxCategoryPreSum > findMaxExpenseInCategory(category)) {
                maxCategoryPreSum = findMaxExpenseInCategory(category);
            }
            maxIndex = catWithSum.size() - 1;

        } return catWithSum.get(maxIndex);
    }
    // используйте эти переменные дл€ сохранени€ промежуточных значений
    double maxCategorySum = 0;
    String maxCategoryName = "";

}