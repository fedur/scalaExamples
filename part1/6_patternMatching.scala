object Hello {

  def main(args : Array[String]) = {
  	-4 match {
  		case pos if (pos>0) => println("Positive")
  		case neg if (neg<0) => println("negative")
  	}
  }
}