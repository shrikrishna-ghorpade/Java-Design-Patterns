package com.example.demo.behavioral.state;

interface DbConnection {

	public void connect();

	public Object executeQuery();

	public void disconnect();
}
