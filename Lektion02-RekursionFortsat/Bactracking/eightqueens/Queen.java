package eightqueens;

public class Queen {
	private int row;
	private int column;

	public Queen(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public boolean attacks(Queen other) {
		return row == other.row || column == other.column
				|| Math.abs(row - other.row) == Math.abs(column - other.column);
	}

	@Override
	public String toString() {
		return "" + "abcdefgh".charAt(column) + (row + 1);
	}
}
