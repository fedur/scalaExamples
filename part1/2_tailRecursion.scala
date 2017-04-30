import scala.annotation.tailrec

object Hello {

  def main(args : Array[String]) = {

  	@tailrec def factorial(x:Int, res:Int) : Int = {
  		if (x == 0) 
  			res
  		else
  			factorial(x-1,res*x)
  	}

  	println(factorial(12,1))

  }
}