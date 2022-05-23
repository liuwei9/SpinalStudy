import spinal.core._


class Demo01 extends Component {


}

object Demo01 {
    def main(args: Array[String]): Unit = {
        //        SpinalVerilog(new Demo01)
        //        SpinalSystemVerilog(new Demo01)
        //        SpinalVhdl(new Demo01)
        //        SpinalConfig().generateVhdl(new Demo01)
        SpinalConfig().generateVerilog(new Demo01)
    }
}
