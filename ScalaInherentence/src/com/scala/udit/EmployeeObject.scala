package com.scala.udit

object EmployeeObject {
  def main(args: Array[String]) {
    
      val employee = new Employee(101,"udit");
     
      /* show employee details **/
      employee.showDetails;
      
      
        val regEmployee = new RegularEmployee(102,"mohit",1234453);
      
      /* show regular employee details **/
      regEmployee.showDetails;
      
        val tempEmployee = new TemperaroryEmployee(103,"Rajat",2344);
      
      /* show temperory employee details **/
      tempEmployee.showDetails;
      
   }
}