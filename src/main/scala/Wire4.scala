//https://hdlbits.01xz.net/wiki/Wire4

import spinal.core._ //导入Spinal库

class Wire4 extends Component {
    val a, b, c = in Bits (1 bits)
    val w, x, y, z = out Bits (1 bits)
    //    w := a;
    //    x := b;
    //    y := b;
    //    z := c;
    (w, x, y, z) := a ## b ## b ## c;
}

object Wire4 extends App {
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Wire4)
}
