//////////////////////////////////////////////////
// JIST (Java In Simulation Time) Project
// Timestamp: <Node.java Sun 2005/03/13 11:08:23 barr rimbase.rimonbarr.com>
//

// Copyright (C) 2004 by Cornell University
// All rights reserved.
// Refer to LICENSE for terms and conditions of use.

package misc;

import radio.RadioInterface;
import trans.TransInterface;
import net.NetInterface;
import route.RouteInterface;
import mac.MacInterface;

import runtime.JistAPI;

// todo: finish this off, making the correct hookups
public class Node
{
  protected RadioInterface radio, radioEntity;
  protected TransInterface trans, transEntity;
  protected NetInterface net, netEntity;
  protected RouteInterface route, routeEntity;
  protected MacInterface mac, macEntity;

  public Node()
  {
  }

  public void addApplication()
  {
    // todo: application
  }

  public void addTransport(TransInterface trans)
  {
    this.trans = trans;
    transEntity = (TransInterface)JistAPI.proxy(trans, TransInterface.class);
  }

  public void addNetwork(NetInterface net)
  {
    this.net = net;
    netEntity = (NetInterface)JistAPI.proxy(net, NetInterface.class);
  }

  public void addRouting(RouteInterface route)
  {
    this.route = route;
    routeEntity = (RouteInterface)JistAPI.proxy(route, RouteInterface.class);
  }

  public void addMac(MacInterface mac)
  {
    this.mac = mac;
    macEntity = (MacInterface)JistAPI.proxy(mac, MacInterface.class);
  }

  public void addRadio(RadioInterface radio)
  {
    this.radio = radio;
    radioEntity = (RadioInterface)JistAPI.proxy(radio, RadioInterface.class);
  }

  public void addMobility()
  {
    // todo: mobility
  }

}
