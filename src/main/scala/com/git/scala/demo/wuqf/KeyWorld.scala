package com.git.scala.demo.wuqf

/**
  * Created by wuqf on 7/13/17.
  */
object KeyWorld {
  def main(args: Array[String]): Unit = {
    testImplicit
  }

  def testImplicit(): Unit = {
    implicit val currentTaxRate = 0.1F
    val tax = calcTax(4000)
    println(tax)
  }

  def calcTax(amount: Float)(implicit rate: Float): Float = amount * rate;

}
