import spinal.core._
import spinal.lib._


class DemoVec extends Component {
    val vec1 = Vec(UInt(8 bits), 4)
    //    val vec2 = vec1.shuffle(index=>List(3,0,1,2)(index))
    val vec2 = vec1.shuffleWithSize((i, j) => if (j == 0) 3 else j - 1)
    vec2(0) := 3

}

object DemoVec extends App {
    SpinalVerilog(new DemoVec)
}