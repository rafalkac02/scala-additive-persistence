object AdditivePersistence {

  def sumDigits(n: Int) = {
    n.toString.map(_.asDigit).sum
  }

  def additivePers(number: Int) = {
    def count(n: Int, counter: Int): Int = n match {
      case n if n > 9 => count(sumDigits(n), counter + 1)
      case _ => counter
    }

    count(number, 0)
  }
}