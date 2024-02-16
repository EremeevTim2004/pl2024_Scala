object Main extends App {
  // 1. Сумма цифр в строке
  def sumOfDigits(str: String): Int = {
    str.foldLeft(0)((acc, char) => acc + char.asDigit)
  }

  // 2. Произведение кодов букв в строке
  def productOfCharCodes(str: String): Long = {
    str.foldLeft(1L)((acc, char) => acc * char.toInt)
  }

  // 3. Вывод "лесенки"
  def printStaircase(n: Int): Unit = {
    for (i <- 1 to n) {
      println((n to (n - i + 1) by -1).mkString(" "))
    }
  }

  // Ввод строки для задач 1 и 2
  println("Введите строку: ")
  val inputStr = scala.io.StdIn.readLine()

  // 1. Сумма цифр в строке
  println(s"Сумма цифр в строке: ${sumOfDigits(inputStr)}")

  // 2. Произведение кодов букв в строке
  println(s"Произведение кодов букв в строке: ${productOfCharCodes(inputStr)}")

  // 3. Вывод "лесенки"
  println("Введите число для лесенки: ")
  val stairsInput = scala.io.StdIn.readInt()
  println("Лесенка:")
  printStaircase(stairsInput)
}
