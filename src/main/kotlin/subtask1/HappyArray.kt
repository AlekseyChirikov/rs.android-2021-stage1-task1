package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {

        val happyList = sadArray.toMutableList()
        var index = 1

        while (index < happyList.size - 1) {
            if (isHappyElement(index, happyList)) {
                index++
            } else {
                happyList.removeAt(index)
                if (index != 1) {
                    index--
                }
            }
        }

        return happyList.toIntArray()
    }

    fun isHappyElement(idx: Int, happyList: MutableList<Int>): Boolean {
        return happyList.elementAt(idx) < happyList.elementAt(idx - 1) + happyList.elementAt(idx + 1)
    }
}
