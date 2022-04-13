//https://hdlbits.01xz.net/wiki/Vector2

import spinal.core._

class Vector2 extends Component {
    val i = in Bits (32 bits)
    val o = out Bits (32 bits)

//    o := i.subdivideIn(8 bits).reduce(_ ## _)
    o := i.subdivideIn(4 slices).reduce(_ ## _)
}
object Vector2 extends App{
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Vector2)
}
