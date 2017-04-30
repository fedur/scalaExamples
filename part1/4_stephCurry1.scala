object Hello {

  def main(args : Array[String]) = {
  	
  	def sum(f: Int => Int) : (Int,Int) => Int = {
  		def subSum(x:Int,y:Int) : Int = {
  			f(x) + f(y)
  		}
  		subSum // KEYLINE, return value of sum
  	}

  	// EQUIVALENT of sum, but much cleaner
  	def sum2(f: Int => Int)(x:Int, y:Int) : Int = {
  		f(x) + f(y)
  	}

  	def cube(x:Int) : Int = {
  		x*x*x
  	}

  	def nullFct(x:Int) : Int = 0

  	println(sum(cube)(4,3))
  	println(sum2(cube)(4,3))
  	println(sum(nullFct)(100,90))

  	/* EXPLANATION BIATCH Line 14:
  	(1) sum waiting for a (Int => Int)
  	(2) sum gets cube.
  	(3) Then subSum processes 'cube' and returns itself as a function value
  	(4) Then the function value is waiting for (Int,Int) so he can => Int
  	(5) (Int,Int) and returns the value

  	*/


 }
}