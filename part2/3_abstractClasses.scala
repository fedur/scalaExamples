object Hello {
	def main(args : Array[String]) = {

		sealed abstract class BiIt[A] {
			def getNext: BiIt[A]
			def getPrevious : BiIt[A]
			def getValue: Option[A]
		}
		
		class intCounter(cnt: Int) extends BiIt[Int] {

			def getNext : BiIt[Int] = new intCounter(cnt-1)
			def getPrevious : BiIt[Int] = new intCounter(cnt+1)
			def getValue : Option[Int] = Some(cnt)

		}

		class wordTraverser(word:String, pos: Int = 0) extends BiIt[Char] {
			
			def getValue() = Some(word.charAt(pos))

			def getNext() = word.lengthCompare(pos) match {
				case x if (x <= 0) => new wordTraverser(word,pos+1)
				case _ => this
			}

			def getPrevious() = pos match {
				case 0 => this
				case x if (x >0) => new wordTraverser(word,pos-1)
				case _ => this
			}

		}

		val abc = new wordTraverser("abc",2)
		val simpleChar = new wordTraverser("d")

		println(simpleChar.getPrevious.getValue)
		println(simpleChar.getNext.getNext.getValue)

		println(abc.getNext.getValue)
		println(abc.getPrevious.getValue)
		println(abc.getPrevious.getPrevious.getValue)
	}
}