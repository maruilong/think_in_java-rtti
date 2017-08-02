package com.shinian.typeinfo.demo;

public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = Integer.class;
		genericIntClass = int.class;//没毛病
		
		intClass =double.class;
		//genericIntClass=double.class;
		//初始类型可以指定为别的类型(尽管会出现错误)
		//使用泛型语法可以强制编辑器进行检查
		//如果想放松这种检查的话
		//Class<Number> numberClass=int.class;无法工作
		//因为IntegerClass 对象 并不是 NumberClass对象的子类
		
		Class<?> clazz=int.class;
	}
}
