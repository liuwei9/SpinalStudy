import spinal.core._

class DemoBool extends Component {

    val a = Bool()
    val b = True
    val c = False
    val d = Bool(1 > 2)

    //    when(a.edge(c)) {
    //        b := False
    //    }
    //    val e = a.edges()
    //    when(b =/= c) {
    //        d := True
    //    }

    // @@
    val e = a ## b

    //    val e = a && b
    //    val f = a || b
    //    val g = a ^ b
    //    val h = !a
    //    val e = Bool()
    //    e.set()
    //    val f = Bool()
    //    f.clear()

    //        val e = False
    //        e.setWhen(b)
    //        val f = True
    //        f.clearWhen(b)


    //    Boolean true false
    //    Bool() True False
//
//    val aa = UInt(5 bits)
//    val bb = UInt(5 bits)
//    val cc = (aa.asBits) && (bb.asBits)
//    val cc = aa.orR & bb.orR

    val myBits = B"1101"

    val test1 = myBits === M"1-01" // True
    val test2 = myBits === M"0---" // False
    val test3 = myBits === M"1--1" // True
}

object DemoBool extends App {
    SpinalVerilog(new DemoBool)
}
