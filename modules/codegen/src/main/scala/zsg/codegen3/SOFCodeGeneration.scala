package zsg.codegen3

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object SOFCodeGeneration {

  val root2XDir = Paths.get(".", "modules", "codegen", "src", "test", "scala", "zsg", "codegen3")

  def main(i: Array[String]): Unit = {
    val filePath = root2XDir.resolve("SystemOfNumerationTestItem1.scala")
    Files.createDirectories(root2XDir)
    Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
      val content = zsg.codegen.StringUtil.trimLines(zsg.codegen3.son.txt.SystemOfNumerationTestItem1().body)
      writer.println(content)
    }
  }

}
