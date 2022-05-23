import spinal.core._

object Enum extends SpinalEnum(){
    val encoding = SpinalEnumEncoding("dynamicEncoding", _ * 2)
    val a,b,c,d = newElement
    defaultEncoding = encoding
//    defaultEncoding = SpinalEnumEncoding("staticEncoding")(
//        a -> 0,
//        b -> 2,
//        c -> 3,
//        d -> 7)
}

class DemoEnum extends Component {
    val enum = Reg(Enum) init Enum.a
}

object DemoEnum extends App{
    SpinalVerilog(new DemoEnum)
//    SpinalConfig(enumPrefixEnable = false,enumGlobalEnable = true).withoutEnumString().generateVerilog(new DemoEnum)
}
