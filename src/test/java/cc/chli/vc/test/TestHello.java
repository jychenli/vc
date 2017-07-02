package cc.chli.vc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cc.chli.vc.demo.Hello;

public class TestHello {

	 @Test  
     public void testHello(){       
          Hello h = new Hello();  
          assertEquals(h.sayHello("jizg"),"hello :jizg");  
     }  
}
