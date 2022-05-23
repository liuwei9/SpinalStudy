import spinal.core._

class DemoReg extends Component {

    val a = Bool()
    val b = Reg(Bool())

    //    val c = RegInit(True)
    //    val c = Reg(Bool()) init True
    //    c := False


    val d = RegNext(b)
    val e = RegNextWhen(b, a)

    //    a := True
    //    b := False

}

object DemoReg extends App {
    SpinalVerilog(new DemoReg)
}
