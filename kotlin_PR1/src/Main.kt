//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var expenseList : ExpensesList = ExpensesList()

    expenseList.addExpense(new_expense = Expense(10, "A", "12.09.24"))
    expenseList.addExpense(new_expense = Expense(456, "B", "03.09.24"))
    expenseList.addExpense(new_expense = Expense(9567, "A", "28.09.24"))
    expenseList.addExpense(new_expense = Expense(21, "C", "25.01.24"))
    expenseList.addExpense(new_expense = Expense(2603, "A", "17.04.24"))

    expenseList.printAllExpenses()
    println(expenseList.sumInCategory("A"))
}