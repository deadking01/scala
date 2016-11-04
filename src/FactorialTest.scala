/**
  * Created by sdzn-dsj on 2016/11/4.
  */
object FactorialTest {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int = {
      if (n <= 0) acc
      else go(n - 1, n * acc)
    }
    go(n,1)
  }
  def main(args:Array[String]): Unit ={
   val result= factorial(3)
    println(result)
  }
}
