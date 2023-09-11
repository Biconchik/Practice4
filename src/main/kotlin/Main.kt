fun main(args: Array<String>)
{
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " " + lastName)
    }
    printFullName("Виктория", "Троцкова")
    //передаем в функцую аргументы типа стринг

    val firstName = "Виктория"
    val lastName = "Троцкова"
    printFullName(firstName, lastName)
    //передаем в функцую аргументы типа стринг двумя способами

    fun calculateFullName(firstName:String, lastName:String): String {
        return "$firstName $lastName"
    }
    val myName:String = calculateFullName(firstName,lastName)
    //функция которая возвращает полное имя в виде строки, потом ее возвращаемое значение присваиваем константе "мое имя"

    fun calculateFullNameAndLengthName (firstName:String, lastName:String): Pair<String,Int> {
        return Pair("$firstName $lastName", (firstName+lastName).length)
    }
    println(calculateFullNameAndLengthName(firstName, lastName))
    //функция возвращает Pair, содержащую как полное имя, так и длину имени

   //я дурачок не поняла ничерта (> ~ <)

    fun fibonacci(number: Int): Int{
        if (number <= 0)
        {
            return 0
        }// если число меньше или равно нулю возвращаем 0
        else if (number == 1 || number == 2)
        {
            return 1
        }// если число 1 или 2 возвращаем 1 (по фибоначчи)

        var variable1 = 1
        var variable2 = 1
        // переменные для сохранения предыдущих чисел
        var current = 0
        // переменная текущего числа

        for (i in 3..number){
            current = variable1 + variable2
            variable1 = variable2
            variable2 = current
        }
        return current
    }
    println("Результат: ${fibonacci(13)}")

}