/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Map;

public class EmployeeFactory {

  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {

  }

  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   */
  public static Employee createEmployee(Map<String, String> inputMap)
      throws IllegalArgumentException {
    // return value
    Employee emp = null;
    String type = inputMap.get("type");
    if(type.equals("SE")){
      return new SalariedEmployee();
    }
    else if (type.equals("HE")){
      return new HourlyEmployee();
    }
    else{
      throw new IllegalArgumentException("Invalid type " + type);
    }

    // TODO: 9/26/2022 If type not equal to HE or SE, throw IllegalArgumentException.
    // TODO: 9/26/2022  Read name and hireDate. (Remember all values in map are string.but hireDate is java.sql.Date
    // TODO: 9/26/2022 If type is "HE", then read/parse rate and hours from inputMap, if "SE" parse salary from inputMap 
    // TODO: 9/26/2022 Create instance of HourlyEmployee or SalariedEmployee with values read from inputMap. Create return



  }
}