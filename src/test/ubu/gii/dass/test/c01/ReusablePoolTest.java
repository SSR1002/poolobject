/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author alumno
 *
 */
public class ReusablePoolTest {
	
	public ReusablePool testReusablePool;
	public Reusable testPrimerReusable, testSegundoReusable;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testReusablePool = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if(testPrimerReusable instanceof Reusable) 	this.testReusablePool.releaseReusable(testPrimerReusable);
		if(testSegundoReusable instanceof Reusable) this.testReusablePool.releaseReusable(testSegundoReusable);
		this.testReusablePool = null;
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pruebaSingleton;
		pruebaSingleton = ReusablePool.getInstance();
		assertTrue(pruebaSingleton instanceof ReusablePool);
		assertTrue(this.testReusablePool == pruebaSingleton);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		Reusable testTercerReusable;
		try {
			this.testPrimerReusable  = this.testReusablePool.acquireReusable();
			this.testSegundoReusable = this.testReusablePool.acquireReusable();
			assertNotSame(this.testPrimerReusable,this.testSegundoReusable);
			try {
				testTercerReusable 	 = this.testReusablePool.acquireReusable();
				fail("Debería haber ocurrido una excepción NotFreeInstanceException.");
			}
			catch(NotFreeInstanceException e) {}
			catch(Exception e) {
				fail("Excepción desconocida.");
			}
		} catch (Exception e) {
			fail("Se ha lanzado una excepción cuando no debería.");
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
