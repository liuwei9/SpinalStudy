//https://hdlbits.01xz.net/wiki/Norgate

import spinal.core._

class Norgate extends Component {
    val a = in Bool()
    val b = in Bool()
    val o = out Bool()
    o := ~(a | b);
}

object Norgate extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Norgate)
}