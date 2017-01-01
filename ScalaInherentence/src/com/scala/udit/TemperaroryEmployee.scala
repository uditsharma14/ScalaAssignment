package com.scala.udit

class TemperaroryEmployee(override val Id: Int, override val name: String,
                          val wagePerDay: Float) extends Employee(Id, name) {

  var perDayWage: Float = wagePerDay

  override def showDetails() {
    println("Employee Id :" + empId);
    println("Employee Name :" + empName);
    println("Employee per Day Wages :" + perDayWage);
  }

}