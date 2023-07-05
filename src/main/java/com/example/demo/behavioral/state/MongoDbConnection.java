package com.example.demo.behavioral.state;

class MongoDbConnection implements DbConnection {

	@Override
	public void connect() {
		System.out.println("MongoDb database connected");
	}

	@Override
	public Object executeQuery() {
		return "MongoDb query executed";
	}

	@Override
	public void disconnect() {
		System.out.println("MongoDb database disconnected");		
	}
}
