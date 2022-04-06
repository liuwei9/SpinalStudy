//https://hdlbits.01xz.net/wiki/Wire_decl

import spinal.core._

class Wire_decl extends Component {
    val a = in Bool()
    val b = in Bool()
    val c = in Bool()
    val d = in Bool()
    val o = out Bool()
    val o_n = out Bool()

    val temp = (a & b) | (c & d)
    o := temp
    o_n := !temp
}

object Wire_decl extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Wire_decl)
}
