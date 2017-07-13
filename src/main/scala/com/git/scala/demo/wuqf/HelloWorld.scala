package com.git.scala.demo.wuqf

/**
  * Created by Administrator on 2017/6/14.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    testYield
  }

  def testHeadAndTail(): Unit = {
    val sites: List[String] = List("baidu", "google", "telent", "ali")
    val numbers: List[Int] = List(1, 2, 3, 4, 5)
    val dim: List[List[Int]] = List(
      List(1, 1, 1),
      List(2, 2, 2),
      List(2, 3, 4)
    )

    println("第一个网站：" + sites.head)
    println("其他的网站：" + sites.tail)
  }

  def testFold(): Unit = {
    val numbers = List(5, 4, 8, 6, 2)
    val sum = numbers.fold(0) { (z, i) => z + i }
    println(sum)
  }

  case class Foo(val name: String, val age: Int, val sex: Symbol)

  def testFoo(): Unit = {
    val fooList = Foo("Hugh Jass", 25, 'male) ::
      Foo("Biggus Dickus", 43, 'male) ::
      Foo("Incontinentia Buttocks", 37, 'female) ::
      Nil
  }

  def testCollection(): Unit = {
    //List
    val numbers = List(1, 2, 3, 4, 5)
    numbers.foreach(x=>println("number is: "+x))
    //Set
    val sets = Set(1, 2, 1)
    sets.foreach(x=>println("elemant in set is: "+x))

    //Tuple
    val hostPort = ("localhost", 80)
    hostPort match {
      case ("localhost", port) => println(hostPort._1 + ": " + hostPort._2)
    }

    //Map
    val m = Map(1 -> "one", 2 -> "two")
    m.foreach(i => println("element in map is :"+i))


    val dnumbers = numbers.map((i: Int) => i * 2)
    dnumbers.foreach(i => println("element in dnumbers is :"+i))

    val fnumbers = dnumbers.map(timesTwo _)
    fnumbers.foreach(i => println("element in fnumbers is :"+i))

    val filterNumbers = numbers.filter((i) => i % 2 == 0)
    filterNumbers.foreach(i => println("\"element in filterNumbers is: " + i))

    val zipNumbers=List(1,2,3,1).zip(List("a","b","c","d"))
    zipNumbers.foreach(i => println("element in zipNumbers is: " + i))

    val sumLeft=numbers.foldLeft(1)((i,j)=>i+j)
    println("foldLeftSum: "+sumLeft)

    val sumRight=numbers.foldRight(0)((i,j)=>i+j)
    println("foldRightSum: "+sumRight)

    val flatNumbers=List(List(1,2,3),List(4,5,6)).flatten

    val fmNumbers=List(List(1,2,3),List(4,5,6)).flatMap(x=>x.map(_ * 2))

  }

  def timesTwo(i: Int): Int = {
    i * 2
  }
  def testYield():Unit={
    val numbers=List(1,2,3,4,5)
    val nn= for(i<-Range(1,3)) yield i*2
    nn.foreach(println)
  }

}

