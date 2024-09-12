class Expense {
    var sum: Int
    var category: String
    var date: String


    constructor(sum: Int, category: String, date: String) {
        this.sum = sum
        this.category = category
        this.date = date
    }


    fun print_info() {
        println("Sum: $sum, Category: $category, Date $date")
    }
}