//https://hdlbits.01xz.net/wiki/Vector0

import spinal.core._

class Vector0 extends Component {
    val vec = in Bits (3 bits)
    val outv = out Bits (3 bits)
    val o0, o1, o2 = out Bool()

    outv := vec
//    o2 := vec(2)
//    o1 := vec(1)
//    o0 := vec(0)
    (o2,o1,o0) := vec
}

object Vector0 extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Vector0)
}
