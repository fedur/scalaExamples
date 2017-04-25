object Hello {

  def main(args : Array[String]) = {
  	
  	def isGoodEnough(guess : Double, x: Double) = {
  		val nbApprox = guess*guess
  		val errorMargin = x*0.01
  		if (nbApprox >= (x-errorMargin) && nbApprox <= (x+errorMargin)) {
  			true
  		} 
		else false
  	}

  	def improve(guess: Double, x: Double) = (guess + x/guess) / 2

  	def sqrter(guess: Double, x: Double) : Double = {
  		if (isGoodEnough(guess,x)) 
  			guess
		else 
			sqrter(improve(guess,x),x)
  	}

	Predef.println(sqrter(16,4))
  }
}