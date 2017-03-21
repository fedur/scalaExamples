object Hello {

  def main(args : Array[String]) = {
  	lazy val a = { 
  		println("a")
  	}
  	val b = println("b")
  	def c = println("c") // message won't appear in console rn (compared to line 7)
  	a; a; a; a; a // a
  	b;b;b;b;b // no b since it has been already defined earlier
  	c;c;c;c;c // ccccc
  }
}