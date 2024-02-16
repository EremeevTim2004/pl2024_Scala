import scala.math.{sqrt, pow}
import scala.util.Random
import scala.math.BigInt

object Main extends App {
  // 1. Квадратный корень из 3, затем возведение в квадрат
  val result1 = pow(sqrt(3), 2)
  val difference = result1 - 3
  println(s"1. Окончательный результат отличается от 3 на $difference")

  // 2. Умножение строки на число
  val result2 = "csit" * 3
  println(s"2. Результат: $result2")

  // 3. Выражение 10 max 2 и класс, в котором определен метод max
  val maxResult = 10 max 2
  println(s"3. Результат выражения 10 max 2: $maxResult")
  println(s"   Метод max определен в классе: ${10.getClass.getMethods.find(_.getName == "max").get.getDeclaringClass}")

  // 4. Вычисление 2^{1024} с использованием BigInt
  val bigResult = BigInt(2).pow(1024)
  println(s"4. Результат: $bigResult")

  // 5. Импорт для нахождения случайного простого числа
  import scala.concurrent.forkjoin.ThreadLocalRandom
  import scala.math.BigInt.probablePrime
  val randomPrime = probablePrime(100, ThreadLocalRandom.current())
  println(s"5. Случайное простое число: $randomPrime")

  // 6. Получение первого и последнего символа строки
  val str = "Hello, Scala"
  val firstChar = str.head
  val lastChar = str.last
  println(s"6. Первый символ строки: $firstChar, последний символ строки: $lastChar")

  // 7. Функции take, drop, takeRight и dropRight для строк
  val exampleString = "Scala is awesome"
  val takeResult = exampleString.take(5) // взять первые 5 символов
  val dropResult = exampleString.drop(6) // удалить первые 6 символов
  val takeRightResult = exampleString.takeRight(7) // взять последние 7 символов
  val dropRightResult = exampleString.dropRight(8) // удалить последние 8 символов
  println(s"7. Примеры использования:")
  println(s"   take: $takeResult")
  println(s"   drop: $dropResult")
  println(s"   takeRight: $takeRightResult")
  println(s"   dropRight: $dropRightResult")
}
