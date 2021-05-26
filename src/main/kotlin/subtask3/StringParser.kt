package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val openBracketsArr: Array<String> = arrayOf("(","<","[")
        val closeBracketsArr = arrayOf(")",">","]")
        val substrList = mutableListOf<String>()
        var endIndex: Int
        var tempString: String

        for (char in inputString.indices) {
            if (inputString[char].toString() in openBracketsArr) {
                endIndex = inputString.indexOf(closeBracketsArr[openBracketsArr.indexOf(inputString[char].toString())], char)
                tempString = inputString.substring(char + 1, endIndex)

                var tempIndex = char;
                while (inputString[char].toString() in inputString.substring(tempIndex + 1, endIndex)) {
                    tempIndex = endIndex + 1
                    endIndex = inputString.indexOf(closeBracketsArr[openBracketsArr.indexOf(inputString[char].toString())], tempIndex)
                    tempString = inputString.substring(char + 1, endIndex)
                }

                substrList.add(tempString)
            }
        }

        return substrList.toTypedArray()
    }
}
