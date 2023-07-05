package com.example.demo.structural.proxy;

class ResourceAccessProxy implements ResourceAccessInterface {

	public String passcode;

	public ResourceAccessProxy(String passcode) {
		super();
		this.passcode = passcode;
	}

	@Override
	public String accessRemoteResource() {
		if ("access".equals(passcode))
			return "This is remote access";
		else
			return "This is protected access";
	}

	@Override
	public String accessLocalResource() {
		return "This is local access";
	}

	@Override
	public String accessSecretResource() {
		return "Autherization error";
	}
}
