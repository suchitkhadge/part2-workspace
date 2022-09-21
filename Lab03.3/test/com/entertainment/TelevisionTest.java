package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private final Television tv = new Television("Samsung", 50, DisplayType.LED);

  @Before
  public void setup(){
    assertEquals("Samsung", tv.getBrand());
  }

  @Test
  public void testSetVolume() {
    tv.setVolume(50);
    assertEquals(50, tv.getVolume());
  }

  @Test (expected = IllegalArgumentException.class)
  public void testSetVolumeIllegalArguments(){
        tv.setVolume(-4);

  }

  @Test
  public void testChangeChannel() {
    int oldChannel = tv.getCurrentChannel();
    try{
      tv.changeChannel(5500);
    }catch (InvalidChannelException e){
      assertEquals(oldChannel, tv.getCurrentChannel());
    }}


  @Test
  public void testCompareTo() {
      Television tv2 = new Television("Sony");
      assertTrue((tv.compareTo(tv2) )< 0);
      Television tv3 = new Television("LG");
      assertTrue((tv.compareTo(tv3))>0);
    }



  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}