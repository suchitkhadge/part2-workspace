package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp;

  @Before
  public void setup(){
    emp = new HourlyEmployee("Sean Stolz", new Date(120, 2, 15), 25.0, 40D);  //If just 25 or 40, it can't autobox INT into a Double
  }

  @Test
  public void testPay() {
//    fail("No test methods implemented yet"); // TODO: 9/21/2022
    assertEquals(1000, emp.pay(),0.001);
  }

  @Test
  public void testPayTaxes() {

    assertEquals(250, emp.payTaxes(), 0.001);
  }
}