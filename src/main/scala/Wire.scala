//https://hdlbits.01xz.net/wiki/Wire
import spinal.core._ //导入Spinal库
class Wire extends Component {
    val io = new Bundle{
        val i = in Bits(1 bits)
        val o = out Bits(1 bits)
    }
//    noIoPrefix()
    io.o := io.i
}
object Wire {
    def main(args: Array[String]): Unit = {
        //指定输出路径
        SpinalConfig(targetDirectory = "verilog").generateVerilog(new Wire)
//        SpinalVerilog(new Wire)
    }
}
