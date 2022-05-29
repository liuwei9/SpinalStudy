import spinal.core._

class DemoSwitch extends Component {
    val a = in Bits (5 bits)
    val b = out Bits (5 bits)
    switch(a) {
        is(1,2,3) {
            b := 0
        }
        default {
            b := 1
        }
    }
}

object DemoSwitch extends App {
    SpinalVerilog(new DemoSwitch)
}
