package com.github.mumoshu.mmo.server.tcpip

import akka.util.ByteString
import com.github.mumoshu.mmo.server.AkkaWorldServer

object DefaultByteStringWriter extends ByteStringWriter {
  val protocol = AkkaWorldServer.protocol
  def apply(any: Any) = any match {
    case str: String =>
      ByteString(str)
    case anyRef: AnyRef =>
      protocol.serialize(anyRef)
    case unexpected =>
      throw new RuntimeException("Unsurppoted object: " + unexpected)
  }
}
