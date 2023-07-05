package com.example.demo.behavioral.state;

class MariaDbConnection implements DbConnection {

	@Override
	public void connect() {
		System.out.println("MariaDb database connected");
	}

	@Override
	public Object executeQuery() {
		return "MariaDb query executed";
	}

	@Override
	public void disconnect() {
		System.out.println("MariaDb database disconnected");
	}
}
