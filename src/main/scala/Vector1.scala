//https://hdlbits.01xz.net/wiki/Vector1

import spinal.core._

class Vector1 extends Component {
    val i = in Bits (16 bits)
    val out_hi = out Bits (8 bits)
    val out_lo = out Bits (8 bits)
    //    out_hi := i(15 downto 8)
    //    out_lo := i(7 downto 0)
    //    out_hi := i(8 to 15)
    //    out_lo := i(0 to 7)
    (out_hi,out_lo) := i
}

object Vector1 extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Vector1)
}
