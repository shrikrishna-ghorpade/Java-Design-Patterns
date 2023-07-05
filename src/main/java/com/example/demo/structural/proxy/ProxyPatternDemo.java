package com.example.demo.structural.proxy;

class ProxyPatternDemo {

	public static void main(String[] args) {

		ResourceAccessInterface resourceAccess = new ResourceAccess();
		ResourceAccessInterface resourceAccessProxy = new ResourceAccessProxy("access1");

		System.out.println(resourceAccess.accessLocalResource());
		System.out.println(resourceAccess.accessRemoteResource());
		System.out.println(resourceAccess.accessSecretResource());
		System.out.println(resourceAccessProxy.accessLocalResource());
		System.out.println(resourceAccessProxy.accessRemoteResource());
		System.out.println(resourceAccessProxy.accessSecretResource());

	}
}