package lectures.part1basics

object ValuesVariablesTypes  extends App{

  val x: Int = 42
  println(x)

  val aString: String = "hello"

  val aBoolean: Boolean = false

  val aChar: Char = 'a'

  val anInt: Int = x

  val aShort: Short = 4613

  val aLong: Long = 5273985273895237L

  val aFloat: Float = 2.0f

  val aDouble: Double = 3.14

  // Variables - can be reassigned

  var aVariable: Int = 4
  aVariable = 5 // side effects

  // Prefer vals over vars

}
