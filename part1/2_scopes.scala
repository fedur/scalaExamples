object Hello {

  def main(args : Array[String]) = {

  	def t : Int = 2 // t outside Scope
  	def unusedScope = { println("THIS WILL NOT APPEAR SINCE def AND NO USE")} // Shows difference between val and def

  	def scope = {
		Predef.println("Inside Scope: value T is : " + t) // = 3 since t has been redefined
  		def t : Int = 3
  		t // return t (3)
  	}

	Predef.println("Outside Scope: value T is : " + t) // = 2 (line 5) since we out of scope
	
	def square(x:Int) : Int = x*x
	println(square(scope + t)) // (2+3)², since scope has been evaluated to 3 (line 9)
  }
}