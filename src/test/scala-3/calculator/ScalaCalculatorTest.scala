package calculator

import org.junit.jupiter.api.Assertions.{assertEquals, assertThrows}
import org.junit.jupiter.api.Test

class ScalaCalculatorTest:

  val calculator = new ScalaCalculator()
  @Test
  def acceptanceAddTest(): Unit =
    calculator.enter(5)
    assertEquals(5, calculator.getResult)

    calculator.enter(6)
    calculator.add()
    assertEquals(11, calculator.getResult)

    calculator.enter(3)
    calculator.add()
    assertEquals(14, calculator.getResult)

    calculator.enter(3)
    assertThrows(classOf[IllegalStateException], () => calculator.enter(5))

  @Test
  def acceptanceSubTest(): Unit =
    calculator.enter(5)
    assertEquals(5, calculator.getResult)

    calculator.enter(6)
    calculator.sub()
    assertEquals(-1, calculator.getResult)

    calculator.enter(3)
    calculator.sub()
    assertEquals(-4, calculator.getResult)

    calculator.enter(3)
    assertThrows(classOf[IllegalStateException], () => calculator.enter(5))

  @Test
  def acceptanceMultTest(): Unit =
    calculator.enter(5)
    assertEquals(5, calculator.getResult)

    calculator.enter(6)
    calculator.mult()
    assertEquals(30, calculator.getResult)

    calculator.enter(3)
    calculator.mult()
    assertEquals(90, calculator.getResult)

    calculator.enter(3)
    assertThrows(classOf[IllegalStateException], () => calculator.enter(5))

  @Test
  def acceptanceDivTest(): Unit =
    calculator.enter(5)
    assertEquals(5, calculator.getResult)

    calculator.enter(1)
    calculator.div()
    assertEquals(5, calculator.getResult)

    calculator.enter(5)
    calculator.div()
    assertEquals(1, calculator.getResult)

    calculator.enter(3)
    assertThrows(classOf[IllegalStateException], () => calculator.enter(5))