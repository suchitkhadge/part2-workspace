package com.javatunes.catalog;

import static org.junit.Assert.*;

import org.junit.Test;

public class InMemoryCatalogTest {

  @Test
  public void findbyId(){
  MusicItem found = new InMemoryCatalog().findById(14L);
    assertEquals("So", found.getTitle());
    assertEquals("Peter Gabriel", found.getArtist());
    }

  @Test
  public void findbyId_nonExistent(){
    MusicItem found = new InMemoryCatalog().findById(Long.MAX_VALUE);
    assertNull(found);
  }


  }
