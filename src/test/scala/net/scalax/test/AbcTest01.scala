package net.scalax.asuna.circe

import io.circe.generic.JsonCodec
import net.scalax.asuna.mapper.common.annotations.RootModel

object AbcTest01 extends CirceAsunaEncoderHelper with App {

  val model: LargeModel = LargeModel()

  /*val result1 = {
    import io.circe.generic.auto._
    val encoder = implicitly[io.circe.Encoder[LargeModel]]

    for (_ <- TestParam.preCollection) {
      encoder(model)
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      encoder(model)
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = encoder(model))
  }*/

  @JsonCodec
  case class sdfhhitehrt(i83: String, i84: String)

  val result2 = {
    object Abc {
      //the property i12 will covert to Int and use Int Encoder and custom key
      //def i12 = cusEncoder[String].func("cus_pro_i12", _.toInt)

      @RootModel[sdfhhitehrt]
      def sdklfgjsontoerhntgioerhntgjoisdrntgjioedrhgiodrhgsdriohgsdru = {
        cusEncoder[sdfhhitehrt].func("abc" * 100, identity)
      }
    }

    val circeEncoder = asunaCirce.effect(asunaCirce.singleModel[LargeModel](Abc).compile)

    for (_ <- TestParam.preCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }

    val data1 = System.currentTimeMillis

    for (_ <- TestParam.testCollection) {
      io.circe.Json.fromJsonObject(circeEncoder.write(model))
    }

    val data2 = System.currentTimeMillis
    TestResult(times = TestParam.testTimes, millions = (data2 - data1), jsonModel = io.circe.Json.fromJsonObject(circeEncoder.write(model)))
  }

  /*println(s"circe 标准库序列化 ${result1.times} 次消耗了 ${result1.millions} 毫秒")
  println(s"circe-asuna 序列化 ${result2.times} 次消耗了 ${result2.millions} 毫秒")
  println(s"结果是否相等：${result1.jsonModel == result2.jsonModel}")
  println(result2.jsonModel.spaces2)

  {
    val data1 = System.currentTimeMillis
    for (_ <- TestParam.testCollection) {
      result1.jsonModel.noSpaces
    }
    val data2 = System.currentTimeMillis
    println(s"转化为文本 ${TestParam.testTimes} 次消耗了 ${data2 - data1} 毫秒")
  }*/

}
