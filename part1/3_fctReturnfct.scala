object Hello {

  def main(args : Array[String]) = {

  	def f(g: Int => Int => Int)(v:Int) : Int =  {
  		def h : Int => Int = g(v)
  		h(2)
  	}

  	def fctArg(x:Int) : Int => Int = {

  		if ((x % 2) == 0)
  			(a: Int) => 0
		else
			(a:Int) => a + x
  	}

  	println(f(fctArg)(2)) // 0
  	println(f(fctArg)(3)) // 3 + 2 

  }
}