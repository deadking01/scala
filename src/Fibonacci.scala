/**
  * Created by sdzn-dsj on 2016/11/4.
  */
object Fibonacci {

  def fib(n:Int): Int={
    def go(n:Int,prev:Int,now:Int):Int={
      if(n<=1) now
      else {
        go(n-1,now,prev+now)
      }
    }
    go(n,1,0)
  }

  def main(args: Array[String]): Unit = {
    println(fib(6))
  }
}
