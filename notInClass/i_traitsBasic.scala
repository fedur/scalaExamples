object Hello {

  def main(args : Array[String]) = {

  	trait Similarity {
  		def isSimilar(obj: Any) : Boolean
  		def isNotSimilar(obj:Any) : Boolean = !isSimilar(obj)
  	}

  	class Gender(isAMan: Boolean) extends Similarity {

  		val gender : String = isAMan match {
  			case true => "man"
  			case false => "woman"
  		}

  		def isSimilar(obj:Any) : Boolean =  {
  			if (obj.isInstanceOf[Gender] && (
  				obj.asInstanceOf[Gender].gender == gender))
  				true
			else false
  		}
  	}

  	val matt = new Gender(true)
  	val mike = new Gender(true)
  	val nat = new Gender(false)
  	println(matt.isNotSimilar(nat))
  	println(matt.isSimilar(mike))

  }
}