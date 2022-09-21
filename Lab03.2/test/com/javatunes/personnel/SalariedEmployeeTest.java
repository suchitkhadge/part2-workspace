package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  @Before
  public void setup(){
    emp = new SalariedEmployee("Mike Ballini", new Date(120,- 2, 15), 60000.0);
  }

  @Test
  public void testPay() {
    assertEquals(60000, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    assertEquals(18000, emp.payTaxes(), 0.001);
  }

}