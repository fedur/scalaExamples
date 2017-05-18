object Hello {
	def main(args : Array[String]) = {

		sealed abstract class Animal
		case class Human() extends Animal
		case class Fish() extends Animal
		case class Dog() extends Animal 

		class Being(name: String, nbOfLegs: Int) {
			def name_ : String = name
			def nbOfLegs_ : Int = nbOfLegs
		}

		object Being{
			def apply(v: Animal) : Being = v match {
				case Human() => new Being("John Doe", 2)
				case Fish() => new Being("Bobby",0)
				case Dog() => new Being("Paul", 4)
			}
		}

		val zeFish = Being(Fish())
		val zeHuman = Being(Human())
		val zeDog = Being(Dog())

		println(zeFish.name_)
		println(zeHuman.name_)
		println(zeDog.nbOfLegs_)

	}
}