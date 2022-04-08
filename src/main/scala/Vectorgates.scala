//https://hdlbits.01xz.net/wiki/Vectorgates

import spinal.core._

class Vectorgates extends Component {
    val a = in Bits (3 bits)
    val b = in Bits (3 bits)
    val out_or_bitwise = out Bits (3 bits)
    val out_or_logical = out Bool()
    val out_not = out Bits (6 bits)

    out_or_bitwise := a | b
    out_or_logical := a.orR | b.orR
    out_not := B(~b, ~a)

}

object Vectorgates extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Vectorgates)
}
