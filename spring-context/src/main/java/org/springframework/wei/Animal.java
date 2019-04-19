package org.springframework.wei;

/**
 * @author: zengyw001
 * @date: 2018/12/13 09:43
 */
public interface Animal {
	void sayHello(String name, int age);

	void sayException(String name, int age);
}