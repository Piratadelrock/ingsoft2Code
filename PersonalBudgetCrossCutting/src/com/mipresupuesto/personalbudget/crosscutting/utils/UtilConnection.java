package com.mipresupuesto.personalbudget.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mipresupuesto.personalbudget.crosscutting.exception.GeneralException;

public class UtilConnection {

	private UtilConnection() {
	}

	public static boolean isClosed(Connection connection) {

		if (UtilObject.getUtilObject().isNull(connection)) {
			throw GeneralException.build("Connection is null!!!");
		}

		try {
			return connection.isClosed();
		} catch (SQLException exception) {
			throw GeneralException.build("Problems trying to validate if connection was closed!", exception);
		}
	}

	public static boolean isOpen(Connection connection) {
		return !isClosed(connection);
	}
}
