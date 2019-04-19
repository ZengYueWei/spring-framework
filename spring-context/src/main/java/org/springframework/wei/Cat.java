package org.springframework.wei;

/**
 * @author: zengyw001
 * @date: 2018/12/17 10:21
 */
public class Cat implements Animal {
	@Override
	public void sayHello(String name, int age) {
		System.out.println("--调用被增强方法");

	}

	@Override
	public void sayException(String name, int age) {
		System.out.println("==抛出异常：" + 1 / 0);
	}
}
