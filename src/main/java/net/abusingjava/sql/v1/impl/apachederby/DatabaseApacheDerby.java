package net.abusingjava.sql.v1.impl.apachederby;

import java.sql.PreparedStatement;

import net.abusingjava.sql.v1.ActiveRecord;
import net.abusingjava.sql.v1.DatabaseAccess;
import net.abusingjava.sql.v1.DatabaseExtravaganza;

public class DatabaseApacheDerby implements DatabaseExtravaganza {

	@Override
	public void createTables(final DatabaseAccess $databaseAccess) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSchema(final DatabaseAccess $databaseAccess) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropSchema(final DatabaseAccess $databaseAccess) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropTables(final DatabaseAccess $databaseAccess, final Class<?>[] $tables) {
		// TODO Auto-generated method stub

	}

	@Override
	public void flushTables(final DatabaseAccess $databaseAccess, final Class<?>[] $tables) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends ActiveRecord<T>> String getSelectQuery(final Class<T> $class, final int $offset, final int $limit,
			final Class<?>... $joinClasses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(final PreparedStatement $stmt, final int $index, final Object $value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends ActiveRecord<T>> String getSelectQuery(final T $example, final int $offset, final int $limit,
			final Class<?>... $joinClasses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends ActiveRecord<T>> Object[] getExampleValues(final T $example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends ActiveRecord<T>> String getSelectByIdQuery(final Class<T> $class) {
		// TODO Auto-generated method stub
		return null;
	}

}
