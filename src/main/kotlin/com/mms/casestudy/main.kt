package com.mms.casestudy


val customerName = "ROBERTA EIKELSTEIN"


fun main() {

    val encrypt = Encrypt()

    var chars = customerName.toUpperCase().toCharArray()
    println(toString(chars))

    chars = encrypt.replaceCharsRuleOne(chars)

    chars = encrypt.rule2(chars)

    chars = encrypt.replaceCharsRuleThree(chars)

    println(toString(chars))
}

fun toString(chars: CharArray) : String {
    return String(chars)
}
