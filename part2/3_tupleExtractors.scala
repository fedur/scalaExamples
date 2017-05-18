object Hello {
	def main(args : Array[String] = new Array[String](0)) = {

		def makeTuple[A,B](a: A, b:B) : (A,B) = {
			(a,b)
		}

		val (arg1, arg2) = makeTuple(2,"Mamamia") // [Int,String] could be added for type-checking
		println(arg1)
		
	}
}