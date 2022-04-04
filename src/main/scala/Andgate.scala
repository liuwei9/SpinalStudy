//https://hdlbits.01xz.net/wiki/Andgate

import spinal.core._

class Andgate extends Component {
    val a = in Bool()
    val b = in Bool()
    val o = out Bool()
    o := a & b;
}

object Andgate extends App{
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Andgate)
}
