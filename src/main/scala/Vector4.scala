//https://hdlbits.01xz.net/wiki/Vector4
import spinal.core._
class Vector4 extends Component {
    val i = in SInt(8 bits)
    val o = out SInt(32 bits)
    o := i.resized
}
object Vector4 extends App{
    SpinalConfig(targetDirectory = "verilog").generateVerilog(new Vector4)
}
