package com.example.demo.behavioral.state;

class StatePatternDemo {

	public static void main(String[] args) {

		DatabaseStateController controller = new DatabaseStateController();
		controller.setMariaDbConnection();

		controller.connect();
		controller.executeQuery();
		controller.disconnect();

		controller.setMongoDbConnection();
		controller.connect();
		controller.executeQuery();
		controller.disconnect();

		controller.setMySqlDbConnection();
		controller.connect();
		controller.executeQuery();
		controller.disconnect();
	}
}
