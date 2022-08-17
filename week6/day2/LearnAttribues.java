package testcase;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribues {
	@Test(timeOut = 1000)
	public void b() throws InterruptedException {
		Thread.sleep(000);
		System.out.println("Test 2");
		
	}
	@Test(dependsOnMethods = {"testcase.LearnAttribues.c"},alwaysRun = true)
	public void a() {
		System.out.println("Test 1");
		
	}
	//@Ignore
	@Test(invocationCount = 3,invocationTimeOut = 3000,threadPoolSize = 2)
	public void c() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 3");
		throw new RuntimeException();
		//(enabled = false)-not executed
	}

}
