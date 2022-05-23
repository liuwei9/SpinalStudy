import spinal.core._

class DemoBits extends Component {

    //    wire [7:0] a;

    //    val b = Reg(Bits(8 bits))
    //

    //    b := 0
    //    val a = Bits(8 bits)
    //    a := 255
    //    val a = B(255, 8 bits)
    //    val a = B"8'd255"

    //    //1000_0000
    //    val a = B(8 bits, 7 -> true, default -> false)
    //    //1010_0000
    //    val b = B(8 bits, (7 downto 5) -> B"3'b101", default -> false)


    //    val a = Reg(Bits(8 bits)) init(B"8'd5")
    //    val b = a(7)
    //    val c = a(7 downto 5)
    //    val d = a(5 until 8)
    //    val e = a(5 to 7)
    //
    //
    //    a(7 downto 5) := 3

//    val a = B"8'b1001_0110"
//    val b = B"8'b0001_1111"

//    val c = a << 4
//    val d = a << U(4)
//    val e = a |<< 4
//    val f = a |<< U(4)
//    val c = a.rotateLeft(1)
//    val d = a.rotateRight(1)

//    val c = a.orR && b.orR
//    a.andR



    //    val c = a & b
    //    val d = a | b
    //    val e = a ^ b
    //    val f = ~a

    val a = UInt(10 bits)
    a.subdivideIn(2 slices)(0) := 5
    a.subdivideIn(2 slices)(1) := 10


}

object DemoBits extends App {
    SpinalVerilog(new DemoBits)
}
