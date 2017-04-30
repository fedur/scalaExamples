object Hello {

  def main(args : Array[String]) = {
  	
	object randomStruct {
		def a = { (x:Int) => x }
		val b = 2
		def c : Int = b + 3
		def d(x:Int) : Int = x+3
		val e = ("a",3,4.2)
	}z

	println(randomStruct.a(2))
	println(randomStruct.b)
	println(randomStruct.c)
	println(randomStruct.d(4))
	println(randomStruct.e._1)
  }
}