package org.springframework.wei;

/**
 * @author: zengyw001
 * @date: 2018/12/13 09:42
 */

public class Dog implements Animal {

	@Override
	public void sayHello(String name, int age) {
		System.out.println("==名字：" + name + " 年龄：" + age);
	}

	@Override
	public void sayException(String name, int age) {
		System.out.println("==名字：" + name + " 年龄：" + age);
		System.out.println("==抛出异常：" + 1 / 0);
	}
}