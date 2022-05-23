//import spinal.core._
//import spinal.core.sim._
//import spinal.lib.dsptool.FixData
//
//class DemoUSint extends Component {
//
//    //    val a = SInt(10 bits)
//    //    val b = SInt(9 bits)
//    //
//    //    a := b.resize(10)
//
//    //    val d = c + a
//
//
//    //
//    //    val c = U(8, 8 bits)
//    //    val d = S(8, 8 bits)
//    //
//    //    val e = U(7)
//    //    val f = S(7)
//    //
//    //    val g = U"3'd2"
//    //    val h = S"3'd2"
//
////    val a = UInt(16 bits)
////    val b = UInt(16 bits)
////    a := U(Integer.parseInt(FixData(3.1, UQ(16, 8)).hex,16))
////    b := U(Integer.parseInt(FixData(2.2, UQ(16, 8)).hex,16))
////
////    val c = a * b
////    val d = c.fixTo( 23 downto 8) simPublic()
//
//    val a = FixData(6.82,UQ(16,8))
//    println(a.hex)
//    println(a.raw)
//
//
//}
//
//object DemoUSint extends App {
//    //    SpinalVerilog(new DemoUSint)
//
////    SimConfig.withWave.compile(new DemoUSint).doSimUntilVoid{
////        dut=>
////            sleep(10)
////            println(dut.d.toInt)
////
////    }
//    SpinalConfig(anonymSignalPrefix = "temp").generateVerilog(new DemoUSint)
//}
