package com.acme.basic;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
    Assert.assertTrue(true);
  }
  @Test
  public void notCovered() {
    new HelloWorld().notCovered();
    Assert.assertTrue(true);
  }
  @Test
  public void notCoveredTwo() {
    new HelloWorld().notCoveredTwo();
    Assert.assertTrue(true);
  }
  @Test
  public void notCoveredThree() {
    new HelloWorld().notCoveredThree();
    Assert.assertTrue(true);
  }
  @Test
  public void notCoveredFour() {
    new HelloWorld().notCoveredFour();
    Assert.assertTrue(true);
  }
  @Test
  public void notCoveredFive() {
    new HelloWorld().notCoveredFive();
    Assert.assertTrue(true);
  }
  @Test
  public void notCoveredSix() {
    new HelloWorld().notCoveredSix();
    Assert.assertTrue(true);
  }

}
