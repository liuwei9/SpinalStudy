//https://hdlbits.01xz.net/wiki/Notgate

import spinal.core._

class Notgate extends Component {
    val i = in Bool()
    val o = out Bool ()
    o := ~i;
}
object Notgate {
    def main(args: Array[String]): Unit = {
        SpinalConfig(targetDirectory = "verilog").generateVerilog(new Notgate)
    }
}
