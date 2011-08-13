package net.abusingjava.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.abusingjava.sql.impl.ConnectionPool;

public interface DatabaseExtravaganza {

	String escapeName(final String $name);
	
	Object get(ResultSet $resultSet, int $index);
	
	Object get(ResultSet $resultSet, String $name);
	
	void set(PreparedStatement $stmt, int $index, Object $value);
	
	String getDriverName();
	
	void createDatabase(ConnectionPool $pool, Schema $schema);
}
