class ExpensesList {
    val list = arrayListOf<Expense>()


    fun addExpense(new_expense: Expense) {
        list.add(new_expense)
    }


    fun printAllExpenses() {
        for (expense in list) {
            expense.print_info()
        }
    }


    fun sumInCategory(category: String): Int {
        var resultSum: Int = 0
        for (expense in list) {
            if (expense.category == category) {
                resultSum += expense.sum
            }
        }

        return resultSum
    }
}