package com.mms.casestudy

class Encrypt {

    private val mapFirstRule: HashMap<Char, Char> = hashMapOf('A' to 'K', 'R' to 'P', 'E' to 'G', 'I' to 'T', 'S' to 'Y', 'K' to 'L')

    private val mapSecondRule1: HashMap<Char, Int> = hashMapOf('A' to 1, 'B' to 2, 'C' to 3, 'D' to 4, 'E' to 5,
        'F' to 6, 'G' to 7 , 'H' to 8, 'I' to 9, 'J' to 10, 'K' to 11, 'L' to 12, 'M' to 13, 'N' to 14,
        'O' to 15, 'P' to 16, 'Q' to 17, 'R' to 18, 'S' to 19, 'T' to 20, 'U' to 21, 'V' to 22,
        'W' to 23, 'X' to 24,'Y' to 25, 'Z' to 26)

    private val mapSecondRule2: HashMap<Int, Char> = hashMapOf(1 to 'Z', 2 to 'Y', 3 to 'X', 4 to 'W', 5 to 'V',
        6 to 'U', 7 to 'T', 8 to 'S', 9 to 'R', 10 to 'Q', 11 to 'P', 12 to 'O', 13 to 'N', 14 to 'M',
        15 to 'L', 16 to 'K', 17 to 'J', 18 to 'I', 19 to 'H', 20 to 'G', 21 to 'F', 22 to 'E',
        23 to 'D', 24 to 'C',25 to 'B', 26 to 'A')

    private val mapThirdRule: HashMap<Char, Char> = hashMapOf('O' to 'K', 'E' to 'T', 'S' to 'I')


    fun replaceCharsRuleOne(chars: CharArray) : CharArray {
        return replaceChars(chars, mapFirstRule)
    }

    fun replaceCharsRuleThree(chars: CharArray) : CharArray {
        return replaceChars(chars, mapThirdRule)
    }

    private fun replaceChars(chars: CharArray, map : HashMap<Char,Char>) : CharArray {
        for ((index, char) in chars.withIndex()){
            val newChar = map[char]

            if (newChar != null) {
                chars[index] = newChar
            }
        }
        return chars
    }

    fun rule2(chars: CharArray) : CharArray {
        for ((index, char) in chars.withIndex()){

            var newInt : Int? = mapSecondRule1[char]

            if (newInt != null) {
                newInt = newInt.plus(1)

                if (newInt == 27) {
                    newInt = 1
                }

                val newChar : Char? = mapSecondRule2[newInt]
                if (newChar != null) {
                    chars[index] = newChar
                }
            }

        }
        return chars
    }
}