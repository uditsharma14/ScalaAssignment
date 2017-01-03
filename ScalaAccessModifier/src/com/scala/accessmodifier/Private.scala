package com.scala.accessmodifier

  class Outer {
   private def fouter() { println("f") }
   class Inner {
      private def f() { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
   (new Inner).f() // Error: f is not accessible
 }



