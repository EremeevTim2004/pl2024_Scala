object Main extends App {
  // 1. Проверка на автомобильный номер
  def isCarNumber(str: String): Boolean = str.matches("[A-Z]\\d{3}[A-Z]{2}")

  // 2. Проверка на правильный пароль
  def isStrongPassword(str: String): Boolean = str.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$")

  // 3. Проверка на формат даты
  def isDateFormat(str: String): Boolean = str.matches("\\d{2}\\.\\d{2}\\.\\d{4}")

  // Ввод строки для проверки
  println("Введите строку для проверки:")
  val inputStr = scala.io.StdIn.readLine()

  // 1. Проверка на автомобильный номер
  println(s"Является ли строка автомобильным номером: ${isCarNumber(inputStr)}")

  // 2. Проверка на правильный пароль
  println(s"Является ли строка правильным паролем: ${isStrongPassword(inputStr)}")

  // 3. Проверка на формат даты
  println(s"Соответствует ли строка формату даты: ${isDateFormat(inputStr)}")
}
