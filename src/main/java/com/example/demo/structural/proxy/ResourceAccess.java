package com.example.demo.structural.proxy;

class ResourceAccess implements ResourceAccessInterface {

	@Override
	public String accessRemoteResource() {
		return "This is remote resource";
	}

	@Override
	public String accessLocalResource() {
		return "This is local resource";
	}

	@Override
	public String accessSecretResource() {
		return "This is secret resource";
	}
}
