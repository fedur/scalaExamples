object Hello {

  def main(args : Array[String]) = {

  	def id[A](x:A) = x
  	id(3)
  	id("abc")
  	def applyN[A](f: A => A, x: A, n:Int): A =
	  	n match {
		  	case 0 => x
		  	case _ => f(applyN(f, x, n-1))
	  	}
  
  	println(applyN((v:Int) => v*2, 2, 4))  // 2^4 (mais a la 5 laaa)
  	println(applyN((v:String) => v + "!", "Fedur", 8)) // Concatène un '!' 8 fois
  	println(applyN((v:Boolean) => !v, true, 4)) // Toggle v 4 fois
  }
}
