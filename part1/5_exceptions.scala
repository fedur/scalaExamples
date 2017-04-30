object Hello {

  def main(args : Array[String]) = {

  	class factRangeException(val arg: Int) extends Exception 

	def factorial(n : Int): Int = {
		if (n < 0) throw new factRangeException(n)
		else if (n == 0) 1
		else n * factorial(n-1)
	}

	try {
		println(factorial(2))
		println(factorial(-10))
		println(factorial(-20)) // Not executed since we go directly to the catch
	} catch {
		case e : factRangeException => { println("fact range error: " + e.arg) }
	}

	try {
		println(factorial(-22))
		println("THIS WILL NOT APPEAR ON SCREEN")
	}catch {
		case e : factRangeException => { println("fact range error: " + e.arg) }
	}
  }
}