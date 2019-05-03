package lama.schema;

public enum SQLite3DataType {
	NULL, INT, TEXT, REAL, NONE, BINARY;

	public boolean isNumeric() {
		return this == REAL || this == INT;
	}
}
