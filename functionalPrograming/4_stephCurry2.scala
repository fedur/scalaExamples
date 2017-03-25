object Hello {

  def main(args : Array[String]) = {
  	//Steph curry is almost useful here
  	{
  		def printIf(expr: Boolean)(sentence: String) {
  			if (expr) println(sentence)
  		}

  		printIf(1==1)("Yoleau")
  		printIf(2==1)("This will not get printed.")
  	}
  }
}