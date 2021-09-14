package org.batfish.representation.cumulus;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import org.batfish.datamodel.Prefix6;

/** IPv4 unicast BGP configuration for a VRF. */
public class BgpIpv6UnicastAddressFamily implements Serializable {

  private final @Nonnull Set<Prefix6> _aggregateNetworks;

  public BgpIpv6UnicastAddressFamily() {
    _aggregateNetworks = new HashSet<>();
  }

  @Nonnull
  public Set<Prefix6> getAggregateNetworks() {
    return _aggregateNetworks;
  }
}
