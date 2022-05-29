import spinal.core._
class DemoWhen extends Component {
    val a = in Bits(5 bits)
    val b = out Bits(5 bits)
//    b := 0
    when(a(0)===False){
        b := 5
    } elsewhen(a === 1){
        b := 4
    } otherwise{
        b := 0
    }
}
object DemoWhen extends App{
    SpinalVerilog(new DemoWhen)
}
