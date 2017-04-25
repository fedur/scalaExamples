object Hello {

  def main(args : Array[String]) = {

  	class Person(
	age: Int = 0, 
	name: String = "John", 
	surname: String = "Doe",
	isAHuman: Boolean = true) {

		 // public members
		var isHuman : Boolean = isAHuman
		if (secretLock < 0) println("ABORT") // Doesn't print. Duh

		//private Members
		def secretLock : Int = 1234151267

		// NOTE: age,name,surname are not members since they haven't been redefined somewhat in the constructor

		//Public Methods
  		def fullName : String = s"$name $surname" 
  		override def toString : String = s"($name $surname: $age years old)" 
  	}

  	val bob = new Person(21,"Bob", "Parson")
  	println(bob.toString)
  	if (bob.isHuman) 
  		println(s"Hi ${bob.fullName}\n")

  	val nobody = new Person()
  	println(nobody.toString + "\n")

  	val turtle = new Person(name="myTurtle", surname="", isAHuman=false) //Can omit parameters by using parameters name
  	println(turtle.toString)
  	if(!turtle.isHuman) println("Get back to your cage filthy creature!")

  }
}