object Hello {

  def main(args : Array[String]) = {

  	/*

  	sealed abstract class IOption
  	case class INone() extends IOption
  	case class ISome(value: Int) extends IOption */

  	sealed abstract class BTree
  	case class Leaf() extends BTree
  	case class Node(value: Int, left: BTree, right:BTree) extends BTree

  	def find(tree: BTree, x: Int) : Boolean = tree match {

		case Leaf() => false
		case Node(value,left,right) => {
			if (value == x) true
			else{
				{ if (!left.isInstanceOf[Leaf]) find(left,x) else false } | // LOGICAL AND
				{ if (!right.isInstanceOf[Leaf]) find(right,x) else false}
			}

		}
	}


	val node4 : Node = Node(4,Leaf(),Leaf())
	val node7 : Node = Node(7,node4,Leaf())
	val node6 : Node = Node(6,Leaf(), Leaf())

  	val father8 : BTree = Node(8,node7,node6)

  	// TESTING
  	println (find(father8, 4))
  	println(find(father8,6))
  	println(find(father8,7))
  	println(find(father8,8))
  	println(find(father8,-100))

  }
}