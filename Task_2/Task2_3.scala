object Main extends App {
  val randomNumber = scala.util.Random.nextInt(100) + 1
  var guessed = false
  var attempts = 0

  println("Компьютер загадал число от 1 до 100. Попробуйте угадать!")

  while (!guessed) {
    attempts += 1
    print("Введите ваше предположение: ")
    val guess = scala.io.StdIn.readInt()

    if (guess == randomNumber) {
      println(s"Поздравляем! Вы угадали число $randomNumber за $attempts попыток!")
      guessed = true
    } else if (guess < randomNumber) {
      println("Загаданное число больше.")
    } else {
      println("Загаданное число меньше.")
    }
  }
}
