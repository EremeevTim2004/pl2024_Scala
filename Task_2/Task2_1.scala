import scala.util.{Try, Success, Failure}

object Main extends App {
  // Функция для вычисления результата операции
  def calculate(input: String): Unit = {
    val parts = input.split(" ")
    if (parts.length != 3) {
      println("Неверный формат ввода")
      return
    }
    val a = Try(parts(0).toDouble)
    val b = Try(parts(2).toDouble)
    val operator = parts(1)
    val result = (a, b) match {
      case (Success(x), Success(y)) =>
        operator match {
          case "+" => x + y
          case "-" => x - y
          case "*" => x * y
          case "/" =>
            if (y != 0) x / y
            else "Деление на ноль"
          case _ => "Неверный оператор"
        }
      case _ => "Неверные операнды"
    }
    println(s"Результат: $result")
  }

  // Ввод строки и вызов функции calculate
  println("Введите выражение (например, 1 + 2): ")
  val input = scala.io.StdIn.readLine()
  calculate(input)
}
