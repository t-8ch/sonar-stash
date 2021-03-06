package org.sonar.plugins.stash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PluginInfoTest {

  private static final String plugin_name = "sonar-stash";
  private static final String plugin_vers = "1337.0";


  @Test
  public void testPluginInfoRef_ConstructorAndAccessors() {

    PluginInfo PI = new PluginInfo(plugin_name, plugin_vers);

    assertEquals(plugin_name, PI.getName());
    assertEquals(plugin_vers, PI.getVersion());
  }

}