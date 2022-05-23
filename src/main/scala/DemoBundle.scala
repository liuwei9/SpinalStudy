import spinal.core._
import spinal.lib._

class Color extends Bundle {
    val r = UInt(8 bits)
    val g = UInt(8 bits)
    val b = UInt(8 bits)

//    override def asMaster(): Unit = {
//        out(r)
//        out(g)
//        out(b)
//    }
}


class DemoBundle extends Component {

//    val a = master(new Color)
//    val b = slave(new Color)
//    a := b


    val a = new Color
//    a.assignFromBits(B"24'd5")

//    val a = in (new Color)

    //    val color = new Color
    //    val d = UInt(8 bits)
    //    d := color.r
    //    val d = color.r


    //    val io = new Bundle {
    //        val r = in UInt (8 bits)
    //        val g = in UInt (8 bits)
    //        val b = out UInt (8 bits)
    //    }
    //    noIoPrefix()
    //
    //    io.b := 2
//    val r = in UInt (8 bits)
//    val g = in UInt (8 bits)
//    val b = out UInt (8 bits)
//    b := 2
}

object DemoBundle extends App {
    SpinalVerilog(new DemoBundle)
}
