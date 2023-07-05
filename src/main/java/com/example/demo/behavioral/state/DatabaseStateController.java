package com.example.demo.behavioral.state;

class DatabaseStateController implements DbConnection {

	private MySqlDbConnection mySqlDbConnection = new MySqlDbConnection();
	private MariaDbConnection mariaDbConnection = new MariaDbConnection();
	private MongoDbConnection mongoDbConnection = new MongoDbConnection();

	private DbConnection dbConnection;

	public void setMySqlDbConnection() {
		dbConnection = mySqlDbConnection;
	}

	public void setMariaDbConnection() {
		dbConnection = mariaDbConnection;
	}

	public void setMongoDbConnection() {
		dbConnection = mongoDbConnection;
	}

	@Override
	public void connect() {
		dbConnection.connect();
	}

	@Override
	public Object executeQuery() {
		return dbConnection.executeQuery();
	}

	@Override
	public void disconnect() {
		dbConnection.disconnect();
	}
}
