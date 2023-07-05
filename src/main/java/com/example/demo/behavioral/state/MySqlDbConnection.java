package com.example.demo.behavioral.state;

class MySqlDbConnection implements DbConnection {

	@Override
	public void connect() {
		System.out.println("Mysql database connected");
	}

	@Override
	public Object executeQuery() {
		return "Mysql query executed";
	}

	@Override
	public void disconnect() {
		System.out.println("Mysql database disconnected");
	}
}
