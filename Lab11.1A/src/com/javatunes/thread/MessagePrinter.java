/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

// TODO: extend the Thread class
public class MessagePrinter extends Thread {
  private String message;
  private int inteval;
  private int DEFAULT_INTERVAL = 1000;

  public int getInteval() {
    return inteval;
  }

  public void setInteval(int inteval) {
    this.inteval = inteval;
  }


  
  public MessagePrinter (String message) {
    this(message, 1000);
    setName("Message Printer");

    // TODO: set the thread name [important when debugging]


  }


  /**
   * TODO: implement run() as follows:
   * It should loop 10 times, printing the 'message' field to stdout,
   * then pausing for some interval (in millis) that you choose.
   * 
   * Use a try/catch to call Thread.sleep(interval) for the pause.
   * The sleep() method throws InterruptedException, which you need to catch.
   * You can either leave the catch block empty, or print the exception to stdout.
   */
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(getName() + ": " + message);
      try {
        Thread.sleep(getInteval()); // pause for 1000ms
      }
      catch (InterruptedException ignored) {
// more on this later
      }
    }

    
  }

  public MessagePrinter(String message, int interval){
    for (int i = 0; i < 10; i++) {
      System.out.println(getName() + ": " + message);
      try {
        Thread.sleep(interval); // pause for 1000ms
      }
      catch (InterruptedException ignored) {
// more on this later
      }
    }

  }

}