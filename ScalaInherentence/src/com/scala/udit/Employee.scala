package com.scala.udit

class Employee(val Id: Int, val name: String) {
  var empId: Int = Id
  var empName: String = name

  def showDetails {
    println("Employee Id :" + empId);
    println("Employee Name :" + empName);
  }

}