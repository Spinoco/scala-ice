package org.github.foxmk.ice.classes

import java.net.{ Inet6Address, InetAddress, InetSocketAddress }

/**
  * @author Artyom Artemiev
  */
case class TransportAddress(address: InetAddress, port: Int, transport: Transport.Value)
  extends InetSocketAddress(address, port) {

  def isIpv6: Boolean = address.isInstanceOf[Inet6Address]


  override def canEqual(that: Any): Boolean = super.canEqual(that)

  override def toString: String = {

    //    var hostAddress: String = getHostAddress()
    //    if (hostAddress == null) {
    //      hostAddress = getHostName
    //    }
    //
    //    val bldr: StringBuilder = new StringBuilder(hostAddress)
    //
    //    if (isIPv6) bldr.insert(0, "[").append("]")
    //
    //    bldr.append(":").append(getPort)
    //    bldr.append("/").append(getTransport)
    //
    //    return bldr.toString
    return null
  }

  //  def getHostAddress: String = {
  //    val addr: InetAddress = getAddress
  //    var addressStr: String = if (addr != null) addr.getHostAddress
  //    else null
  //    if (addr.isInstanceOf[Inet6Address]) addressStr = NetworkUtils.stripScopeID(addressStr)
  //    return addressStr
  //  }
}

object TransportAddress {
  def apply(address: InetAddress, port: Int): TransportAddress = new TransportAddress(address, port, Transport.TCP)
}

