import spinal.core._
import spinal.lib._


class DemoVec extends Component {
    val vec1 = in Vec(UInt(8 bits), 4)
    val vec2 = out Vec(UInt(8 bits), 4)

    //    val vec2 = vec1.shuffle(index=>List(3,0,1,2)(index))
    //    val vec2 = vec1.shuffleWithSize((i, j) => if (j == 0) 3 else j - 1)
    //    vec2(0) := 3

    //    val a = vec1.reduce(_ + _).asOutput()
    //    val b = vec1.reduceBalancedTree(_ +^ _, (i, j) => if(j == 1) RegNext(i) else i)

    vec2.assignFromBits(vec1.reverse.reduceBalancedTree(_ @@ _).asBits)


}

object DemoVec extends App {
    SpinalVerilog(new DemoVec)
}