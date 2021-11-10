
public class BoatPiece {
	private int boardRank; //1 to 10
	private char boardFile; //A-J
	private int boardFileNum; //1 to 10, representing A-H
	private int xCoord; // Calculated from boardFileNum
	private int yCoord; // Calculated from boardRank
	private int length;
	private boolean isHorizontal;
	
	public BoatPiece(int rank, char file, int boatLength, boolean isHorizontalIn) {
		setBoardRank(rank);
		setBoardFile(file);
		setBoatLength(boatLength);
		setHorizontal(isHorizontalIn);
	}
	
	
	
	
	public int convertFileToInt(char file) {
		switch (file) {
			case 'A':
				return  1;
			case 'B':
				return 2;
			case 'C':
				return 3;
			case 'D':
				return 4;
			case 'E':
				return 5;
			case 'F':
				return 6;
			case 'G':
				return 7;
			case 'H':
				return 8;
			case 'I':
				return 9;
			case 'J':
				return 10;
			default:
				//Incorrect file entered
				return 0;
		}
	}
	public void setHorizontal (boolean horizontalIn) {
		isHorizontal=horizontalIn;
	}
	public boolean getIsHorizontal(){
		return isHorizontal;
	}
	public void setBoatLength (int lengthIn) {
		length=lengthIn;
	}
	public void setBoardRank(int boardRank) {
		this.boardRank = boardRank;
		yCoord = boardRank; //Calculate coordinate from rank
	}

	//Setter for boardFile that also sets boardFileNum and xCoord
	public void setBoardFile(char boardFile) {
		this.boardFile = boardFile;
		boardFileNum = convertFileToInt(boardFile);
		xCoord = boardFileNum; //Calculate coordinate from file
	}
	public int getLength() {
		return length;
	}
	public int getxCoord() {
		return xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}
	
}
