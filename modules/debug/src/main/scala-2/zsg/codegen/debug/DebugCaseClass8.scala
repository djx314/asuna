package zsg.debug
trait DebugCaseClass8Instance {
  implicit def zsgTupleToDebugCaseClass8InstanceImplicit[D1, D2, D3, D4, D5, D6, D7, D8]: ZsgTupleToDebugCaseClass[
    zsg.ZTuple8[D1, D2, D3, D4, D5, D6, D7, D8],
    DebugCaseClass8[D1, D2, D3, D4, D5, D6, D7, D8]
  ] = new ZsgTupleToDebugCaseClass[
    zsg.ZTuple8[D1, D2, D3, D4, D5, D6, D7, D8],
    DebugCaseClass8[D1, D2, D3, D4, D5, D6, D7, D8]
  ] {
    override def tupleToCaseClass(tuple: zsg.ZTuple8[D1, D2, D3, D4, D5, D6, D7, D8]): DebugCaseClass8[D1, D2, D3, D4, D5, D6, D7, D8] = {
      DebugCaseClass8(d1 = tuple.i1, d2 = tuple.i2, d3 = tuple.i3, d4 = tuple.i4, d5 = tuple.i5, d6 = tuple.i6, d7 = tuple.i7, d8 = tuple.i8)
    }
  }
}
case class DebugCaseClass8[D1, D2, D3, D4, D5, D6, D7, D8](d1: D1, d2: D2, d3: D3, d4: D4, d5: D5, d6: D6, d7: D7, d8: D8) {
  def infer(implicit d1: D1, d2: D2, d3: D3, d4: D4, d5: D5, d6: D6, d7: D7, d8: D8): DebugCaseClass8[D1, D2, D3, D4, D5, D6, D7, D8] = {
    DebugCaseClass8(d1 = d1, d2 = d2, d3 = d3, d4 = d4, d5 = d5, d6 = d6, d7 = d7, d8 = d8)
  }
}
