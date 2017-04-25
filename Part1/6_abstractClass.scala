object Hello {

  def main(args : Array[String]) = {

  	sealed abstract class IList
  	case class Node(child: IList) extends IList
  	case class Leaf() extends IList

  	def isALeaf(node: IList) : Int = node match {
  		case Leaf() => 1
  		case Node(_) => 0
  	}

  	def leaf : IList = Leaf()
  	def node : IList = Node(Leaf())
  	println("node: " + isALeaf(node))
  	println("leaf: " + isALeaf(leaf))
  }
}