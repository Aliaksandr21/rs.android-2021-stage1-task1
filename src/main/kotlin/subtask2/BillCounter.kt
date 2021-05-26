package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.sum()
        val fm = (sum - bill[k]) / 2
        return if (fm == b) {
            "Bon Appetit"
        }
        else {
            if (fm >=b) {
                "${fm - b}"}
            else {"${b - fm}"
            }
        }
    }
}
