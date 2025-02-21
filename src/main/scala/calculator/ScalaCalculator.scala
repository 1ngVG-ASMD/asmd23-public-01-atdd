package calculator

import scala.collection.mutable.ListBuffer

class ScalaCalculator:

  private val numbers: ListBuffer[Int] = ListBuffer()

  def enter(i: Int): Unit =
    numbers += i
    if (numbers.size > 2)
      throw new IllegalStateException("Non puoi inserire più di due numeri.")

  def add(): Unit =
    numbers.size match
      case 2 => numbers(0) = numbers(0) + numbers(1)
        numbers.remove(1)
      case _ => throw new IllegalStateException("Wrong numberof parameters")

  def sub(): Unit =
    numbers.size match
      case 2 => numbers(0) = numbers(0) - numbers(1)
        numbers.remove(1)
      case _ => throw new IllegalStateException("Wrong numberof parameters")

  def mult(): Unit =
    numbers.size match
      case 2 => numbers(0) = numbers(0) * numbers(1)
        numbers.remove(1)
      case _ => throw new IllegalStateException("Wrong numberof parameters")

  def div(): Unit =
    numbers.size match
      case 2 => numbers(1) match
        case 0 => throw new ArithmeticException("The result is indeterminate or impossible")
        case _ => numbers(0) = numbers(0)/numbers(1)
          numbers.remove(1)
          
      case _ => throw new IllegalStateException("Wrong number of parameters")
      
  def getResult: Double =
    numbers.size match
      case 1 => numbers(0)
      case _ => throw new IllegalStateException("The calculation didn't produce a result")