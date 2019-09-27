package org.scalax.asuna.mapper.test

object LargeModelTest extends App {

  trait LargeModelPoly extends CircePoly[LargeModelPoly] {

    implicit lazy val largeModel_1_en: CirceEncoder[CirceLargeModel.LargeModel_1] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_2_en: CirceEncoder[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_1_de: CirceDecoder[CirceLargeModel.LargeModel_1] = DecoderTest.implicitDecoder
    implicit lazy val largeModel_2_de: CirceDecoder[CirceLargeModel.LargeModel_2] = DecoderTest.implicitDecoder

  }

  object LargeModelPoly extends LargeModelPoly

  object JsonLarge extends CircePolyGetter[LargeModelPoly]

  val i1 = JsonLarge.toJson(CirceLargeModel.largeModel_2)
  val i2 = JsonLarge.fromJson[CirceLargeModel.LargeModel_2](i1)

  println(i1.noSpaces)
  println("==================== line ====================")
  println(i2)

}
