package subtask2

class BillCounter {

    val phrase = "bon appetit"
    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = (bill.sum() - bill[k]) / 2
        if (sum == b) {
            return phrase
        } else {
            val change = b - sum
            return "$change"
        }
    }
}
