//https://hdlbits.01xz.net/wiki/7458

import spinal.core._

class C7458 extends Component {
    val p1a, p1b, p1c, p1d, p1e, p1f = in Bool()
    val p1y = out Bool()
    val p2a, p2b, p2c, p2d = in Bool()
    val p2y = out Bool()

    //    p1y := (p1a & p1b & p1c) | (p1d & p1e & p1f)
    //    p2y := (p2a & p2b) | (p2c & p2d)
    def assign(list1: List[Bool], list2: List[Bool]): Bool = {
        list1.reduce(_ & _) | list2.reduce(_ & _)
    }

    p1y := assign(List(p1a, p1b, p1c), List(p1d, p1e, p1f))
    p2y := assign(List(p2a, p2b), List(p2c, p2d))
}

object C7458 extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new C7458)
}
