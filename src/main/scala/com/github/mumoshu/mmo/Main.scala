package org.mmo

import com.github.mumoshu.mmo.server.AkkaWorldServer

object Main extends App {
  AkkaWorldServer.createServer(port = 1234)
}
