object Hello {

  def main(args : Array[String]) = {

  	type oneLvl = {val one: String }
  	type twoLvl = { val one: String; val two: String }

  	def f(firstLvl: oneLvl) : Unit = {
  		println(s"The first level is ${firstLvl.one}")
  	}

  	object someGame{ val one="Mama's boy"; val two = "Papi's Boi"; val someProp = 82 }
  	f(someGame) // This still works since twoLvl :< oneLvl

  	def g(param: Nothing) : Int = param // since Nothing :< Int
  }

}