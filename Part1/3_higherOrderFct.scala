object Hello {

  	def main(args : Array[String]) = {
  		def linear(x:Int) : Int = x
  		def square(x:Int) : Int = x*x
  		def cube(x:Int) : Int = x*x*x

  		def sum(f: Int=>Int, x:Int) : Int = {
  			if (x <= 0) 0
	  		else {
	  			f(x) + sum(f,x-1)
	  		}
		}

		println("Using the definitions ..!")
		println(sum(linear,3)) 
		println(sum(square,3))
		println(sum(cube,3))

		////////////////////////////////////

		println("\nUsing anonymous function as parameter ..!")
		println(sum((x:Int)=>x,3))
		println(sum((x:Int)=>x*x,3))
		println(sum((x:Int)=>x*x*x,3))

		///////////////////////////////////
		println("\nWe can also define a SumLinear for example.")
		def sumLinear(n:Int) = sum(linear,n)
		println(sumLinear(5))

	}
}