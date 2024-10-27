package com.mj.chapter10;

interface Service {
	void method1();
	void method2();
}

class Service1 implements Service {

	@Override
	public void method1() {
		System.out.println("menthod 1 from Service 1");
		
	}

	@Override
	public void method2() {
		System.out.println("menthod 2 from Service 1");
	}
}

class Service2 implements Service {

	@Override
	public void method1() {
		System.out.println("menthod 1 from Service 2");
	}

	@Override
	public void method2() {
		System.out.println("menthod 2 from Service 2");
	}
}

interface Factory {
	// 功能是调用getService返回一个Service类型对象
	Service getService();
}

class ServiceFactory1 implements Factory {
	@Override
	public Service getService() {
		return new Service1();
	}
}

class ServiceFactory2 implements Factory {
	@Override
	public Service getService() {
		return new Service2();
	}
}

public class Factories {
	public static void serviceConsumer(Factory fac) {
		fac.getService().method1();
		fac.getService().method2(); 
	}
	public static void main(String[] args) {
		Factory factoryTom = new ServiceFactory1();
		Factory factoryYam = new ServiceFactory2();
		serviceConsumer(factoryTom);
		serviceConsumer(factoryYam);
	}
}
