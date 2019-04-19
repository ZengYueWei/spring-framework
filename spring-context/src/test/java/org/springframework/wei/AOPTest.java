package org.springframework.wei;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.wei.AOP.MyMethodAfterAdvice;
import org.springframework.wei.AOP.MyMethodBeforeAdvice;
import org.springframework.wei.AOP.MyMethodInterceptor;
import org.springframework.wei.AOP.MyThrowsAdivce;

/**
 * @author: zengyw001
 * @date: 2018/12/13 09:55
 */
public class AOPTest {

	@Test
	public void test5() {
		// 前置增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyMethodBeforeAdvice advice = new MyMethodBeforeAdvice();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}


	@Test
	public void test6() {
		// 后置增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyMethodAfterAdvice advice = new MyMethodAfterAdvice();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	@Test
	public void test7() {
		// 异常增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyThrowsAdivce advice = new MyThrowsAdivce();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayException("二哈", 3);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}


	@Test
	public void test8() {
		// 环绕增强
		// 1、实例化bean和增强
		Animal dog = new Dog();
		MyMethodInterceptor advice = new MyMethodInterceptor();

		// 2、创建ProxyFactory并设置代理目标和增强
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(dog);
		proxyFactory.addAdvice(advice);

		// 3、生成代理实例
		Animal proxyDog = (Animal) proxyFactory.getProxy();
		proxyDog.sayHello("二哈", 3);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
