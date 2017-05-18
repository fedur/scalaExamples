object Hello {

  def main(args : Array[String]) = {
    
  	object Printer{
  		def apply(message : String = "Guttenberg") {
  			println(message + "!")
  		}
  	}
  	
  	Printer("Yoleau")
  	Printer()

  }
}