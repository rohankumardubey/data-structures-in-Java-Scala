package com.aokolnychyi.ds.list.mutable

object ScalaListExamples {

  def main(args: Array[String]): Unit = {
    val list1 = new List[Int]()
    1 +=: list1
    list1 += 2
    list1 += 2
    list1 += 1
    println(list1)
    list1.removeDuplicates()
    println(list1)
    println("----------------")
    val list2 = new List[Int]()
    3 +=: list2
    1 +=: list2
    list2 += 3
    list2 += 4
    list2 += 5
    println(list2)
    list2.removeDuplicates()
    println(list2)
    println("----------------")
    val list3 = new List[Int]()
    list3.removeDuplicates()
    println(list3)
  }

}