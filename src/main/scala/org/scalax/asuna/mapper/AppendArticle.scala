trait Article0 extends Any {
  def eat[T](xyy: T): Article1[T]
}
trait Article1[E1] extends Any {
  self =>
  def e1: E1
  def eat[T](xyy: T): Article2[T, E1]
}
trait Article2[E1, E2] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def eat[T](xyy: T): Article3[T, E1, E2]
}
trait Article3[E1, E2, E3] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def eat[T](xyy: T): Article4[T, E1, E2, E3]
}
trait Article4[E1, E2, E3, E4] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def eat[T](xyy: T): Article5[T, E1, E2, E3, E4]
}
trait Article5[E1, E2, E3, E4, E5] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def eat[T](xyy: T): Article6[T, E1, E2, E3, E4, E5]
}
trait Article6[E1, E2, E3, E4, E5, E6] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def eat[T](xyy: T): Article7[T, E1, E2, E3, E4, E5, E6]
}
trait Article7[E1, E2, E3, E4, E5, E6, E7] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def eat[T](xyy: T): Article8[T, E1, E2, E3, E4, E5, E6, E7]
}
trait Article8[E1, E2, E3, E4, E5, E6, E7, E8] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def eat[T](xyy: T): Article9[T, E1, E2, E3, E4, E5, E6, E7, E8]
}
trait Article9[E1, E2, E3, E4, E5, E6, E7, E8, E9] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def eat[T](xyy: T): Article10[T, E1, E2, E3, E4, E5, E6, E7, E8, E9]
}
trait Article10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def eat[T](xyy: T): Article11[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
}
trait Article11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def eat[T](xyy: T): Article12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
}
trait Article12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def eat[T](xyy: T): Article13[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
}
trait Article13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def eat[T](xyy: T): Article14[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
}
trait Article14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def eat[T](xyy: T): Article15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
}
trait Article15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def eat[T](xyy: T): Article16[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
}
trait Article16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def eat[T](xyy: T): Article17[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
}
trait Article17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def eat[T](xyy: T): Article18[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
}
trait Article18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def e18: E18
  def eat[T](xyy: T): Article19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
}
trait Article19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def e18: E18
  def e19: E19
  def eat[T](xyy: T): Article20[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
}
trait Article20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def e18: E18
  def e19: E19
  def e20: E20
  def eat[T](xyy: T): Article21[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
}
trait Article21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def e18: E18
  def e19: E19
  def e20: E20
  def e21: E21
  def eat[T](xyy: T): Article22[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
}
trait Article22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] extends Any {
  self =>
  def e1: E1
  def e2: E2
  def e3: E3
  def e4: E4
  def e5: E5
  def e6: E6
  def e7: E7
  def e8: E8
  def e9: E9
  def e10: E10
  def e11: E11
  def e12: E12
  def e13: E13
  def e14: E14
  def e15: E15
  def e16: E16
  def e17: E17
  def e18: E18
  def e19: E19
  def e20: E20
  def e21: E21
  def e22: E22
}
