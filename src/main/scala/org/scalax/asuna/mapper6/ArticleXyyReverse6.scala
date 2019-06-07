package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyyReverse6[E1, E2, E3, E4, E5, E6](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: HNil) extends AnyVal with XyyItem6[E1, E2, E3, E4, E5, E6] {
  override def pudao[T](xyy: T): ArticleXyyReverse7[T, E1, E2, E3, E4, E5, E6] = new ArticleXyyReverse7[T, E1, E2, E3, E4, E5, E6](xyy :: head)
  override def leftHead: E1                                                    = head.head
  override def leftTail: ArticleXyyReverse5[E2, E3, E4, E5, E6]                = new ArticleXyyReverse5(head.tail)
  override def i1: E1                                                          = head.head
  override def i2: E2                                                          = head.tail.head
  override def i3: E3                                                          = head.tail.tail.head
  override def i4: E4                                                          = head.tail.tail.tail.head
  override def i5: E5                                                          = head.tail.tail.tail.tail.head
  override def i6: E6                                                          = head.tail.tail.tail.tail.tail.head
}