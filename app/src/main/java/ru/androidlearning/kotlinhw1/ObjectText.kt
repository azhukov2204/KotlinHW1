package ru.androidlearning.kotlinhw1

object ObjectText {
    private var dataClassTest: DataClassTest = DataClassTest()

    fun copyFromDataClassTest(dataClassTest: DataClassTest) {
        this.dataClassTest = dataClassTest.copy(str2 = "test") //задам для теста аргумент str2 при копировании
    }

    fun getStr1() = dataClassTest.str1
    fun getStr2() = dataClassTest.str2


}