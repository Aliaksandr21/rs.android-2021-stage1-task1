package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
        return sadArray
            }
        val oneArray = sadArray.reversedArray()
        val pupokArray = arrayListOf(oneArray[0])
        var left = 0

        for (i in 1 until oneArray.lastIndex) {
            if (oneArray[i] <= (oneArray[left] + oneArray[i + 1])) {
                pupokArray.add(oneArray[i])
                left = i
            }
        }
        pupokArray.add(oneArray[oneArray.lastIndex])
        return pupokArray.toIntArray().reversedArray()
            }
        }

