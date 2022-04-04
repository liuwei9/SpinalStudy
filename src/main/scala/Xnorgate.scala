//https://hdlbits.01xz.net/wiki/Xnorgate

import spinal.core._

class Xnorgate extends Component {
    val a = in Bool()
    val b = in Bool()
    val o = out Bool()
    o := ~(a ^ b);
}

object Xnorgate extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Xnorgate)
}
