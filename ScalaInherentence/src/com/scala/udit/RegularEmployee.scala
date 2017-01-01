package com.scala.udit

class RegularEmployee(override val Id: Int, override val name: String,
                      val salary: Float) extends Employee(Id, name) {

  var empSalary: Float = salary

  override def showDetails() {
    println("Employee Id :" + empId);
    println("Employee Name :" + empName);
    println("Employee Salary :" + salary);
  }

}