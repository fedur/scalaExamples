object Hello {

  def main(args : Array[String]) = {
  	
  	def or(x:Boolean, y: => Boolean) = {
  		if(x) true
  		else if(y) true
  		else false
  	}

  	def and(x:Boolean, y:Boolean) = {
  		if (x) y
  		else false
  	}

	Predef.println("OR: " + or(true,false))
	Predef.println("AND: " + and(true,false))
  }
}