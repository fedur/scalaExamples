object Hello {

  def main(args : Array[String]) = {

  	def recurSiveFct(x:Int) : Option[(Int,String)] = x match {
  		case _ if (x < 10) => x match {
  			case _ if ( x <= 0) => None
  			case _ => Some(x, "LOW")
  		}

  		case _ => Some(x,"HIGH")
  	}

  	def printFct(x:Int) : Unit = recurSiveFct(x) match {
  		case None => println("Oops, Nothing to see here..")
  		case Some((v, str)) => println(v + " and " + str)
  	}

  	printFct(8)
  	printFct(-2)
  	printFct(15)


  }
}