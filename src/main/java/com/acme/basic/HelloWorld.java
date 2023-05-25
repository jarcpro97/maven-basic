package com.acme.basic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

  // Create a Logger
  Logger logger = Logger.getLogger(HelloWorld.class.getName());
  private static final String TEXT = "This method is not covered by unit tests";  // Compliant

  void sayHello() {
    logger.log(Level.INFO,"Hello World!");
  }

  void notCovered() {
    logger.log(Level.INFO,TEXT);
  }

  void notCoveredTwo() {
    logger.log(Level.INFO,TEXT);
  }

  void notCoveredThree() {
    logger.log(Level.INFO,TEXT);
  }
  void notCoveredFour() {
    logger.log(Level.INFO,TEXT);
  }
  void notCoveredFive() {
    logger.log(Level.INFO,TEXT);
  }
  void notCoveredSix() {
    logger.log(Level.INFO,TEXT);
  }
  void notCoveredSeven() {
    logger.log(Level.INFO,TEXT);
  }
}
