package com.acme.basic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionTest {

  private static Operacion operacion;

  @Before
  public void setUp(){
  operacion = new Operacion(2,2,'s');
  }

  @Test
  public void testGetN1() {
    Assert.assertEquals(operacion.getN1(),2.0,0.1);
  }
  @Test
  public void testGetN2() {
    Assert.assertEquals(operacion.getN2(),2.0,0.1);
  }
  @Test
  public void testGetOperacion() {
    Assert.assertEquals(operacion.getOperacion(),'s');
    Assert.assertEquals(operacion.getOperacion(),'s');
  }
  @Test
  public void testGetRes() {
    operacion.setRes(operacion.getN1()+ operacion.getN2());
    Assert.assertEquals(operacion.getRes(),4.0,0.1);
  }
}
