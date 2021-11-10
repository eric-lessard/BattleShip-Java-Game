import java.awt.*;
import java.util.*;

public class Proj5Main {
	static DrawingPanel panel = new DrawingPanel(2000, 1000);   
	static Graphics g = panel.getGraphics();
	static char[][] playerOneGrid= new char[10][10];
	static char[][] playerTwoGrid= new char[10][10];
	static char[][] playerOneShips= new char [10][10];
	static char[][] playerTwoShips= new char [10][10];
	public static int convertFileToInt(char file) {
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
	
	public static void drawBoard(int whichPlayer) {
		//drawsboard for player one
		if(whichPlayer==1) {
			//clear board
			g.setColor(Color.WHITE);   
			g.fillRect(1, 1, 2000, 1000); 
			//set background to blue
			g.setColor(Color.CYAN);   
			g.fillRect(1, 1, 2000, 1000); 
			// print "ranks" and "files" - i.e. what the letters and numbers are called
			//also prints which grid
			g.setColor(Color.BLACK);
			g.setFont(new Font("Courier", Font.PLAIN, 62)); 
			g.drawString("A B C D E F G H I J", 122, 85);
			g.drawString("   PLAYER 1 PIECES   ", 122, 900);
			g.drawString("10                    10", 32, 155);
			g.drawString("9                     9", 47, 230);
			g.drawString("8                     8", 47, 305);
			g.drawString("7                     7", 47, 380);
			g.drawString("6                     6", 47, 455);
			g.drawString("5                     5", 47, 530);
			g.drawString("4                     4", 47, 605);
			g.drawString("3                     3", 47, 680);
			g.drawString("2                     2", 47, 755);
			g.drawString("1                     1", 47, 830);
			//Colors for Board
			//Draws board squares
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					// if ((i + j) % 2 == 0) {
					//pulls into an if statement if there are characters populating it
					if(playerOneShips[i][j] != '\u0000') {
						//draws squares for ships
						if(playerOneShips[i][j] =='S') {
							g.setColor(Color.BLACK);
							g.fillRect(125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						//overlaps ship token with hit circles if hit
						if(playerTwoGrid[i][j] =='H') {
							g.setColor(Color.BLACK);
							g.fillRect(125 + 75 * i, 125 + 75 * j, 30, 30);
							g.setColor(Color.RED);
							g.fillOval(125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						g.setColor(Color.BLACK);
						g.drawRect(100 + 75*i, 100 + 75*j, 75, 75);
					}
					else {
						g.setColor(Color.BLACK);
						g.drawRect(100 + 75*i, 100 + 75*j, 75, 75);       
					}    
				}
			}
			//clear board 
			// print "ranks" and "files" - i.e. what the letters and numbers are called 
			//also prints which grid 
			g.setColor(Color.BLACK);
			g.setFont(new Font("Courier", Font.PLAIN, 62)); 
			g.drawString("A B C D E F G H I J", 1122, 85);
			g.drawString("   ATTACK GRID   ", 1122, 900);
			g.drawString("10                    10", 1032, 155);
			g.drawString("9                     9", 1047, 230);
			g.drawString("8                     8", 1047, 305);
			g.drawString("7                     7", 1047, 380);
			g.drawString("6                     6", 1047, 455);
			g.drawString("5                     5", 1047, 530);
			g.drawString("4                     4", 1047, 605);
			g.drawString("3                     3", 1047, 680);
			g.drawString("2                     2", 1047, 755);
			g.drawString("1                     1", 1047, 830);
			//Colors for Board
			//Draws board squares
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					//pulls into an if statement if there are characters populating it
					if(playerOneGrid[i][j] != '\u0000') {
						//displays red circle for hit
						if(playerOneGrid[i][j] =='H') {
							g.setColor(Color.RED);
							g.fillOval(1125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						//displays white cirle for miss
						if(playerOneGrid[i][j] =='M') {
							g.setColor(Color.WHITE);
							g.fillOval(1125 + 75 * i, 125 + 75 * j, 30, 30);
			        	}
						g.setColor(Color.BLACK);
						g.drawRect(1100 + 75*i, 100 + 75*j, 75, 75);
					}
					else {
						g.setColor(Color.BLACK);
						g.drawRect(1100 + 75*i, 100 + 75*j, 75, 75);       
					}    
				}
			}
		}
		//drawsboard for player 2
		if(whichPlayer==2) {
			//clear board
			g.setColor(Color.WHITE);   
			g.fillRect(1, 1, 2000, 1000); 
			//set background to blue
			g.setColor(Color.CYAN);   
			g.fillRect(1, 1, 2000, 1000); 
			// print "ranks" and "files" - i.e. what the letters and numbers are called
			//also prints which grid
			g.setColor(Color.BLACK);
			g.setFont(new Font("Courier", Font.PLAIN, 62)); 
			g.drawString("A B C D E F G H I J", 122, 85);
			g.drawString("   PLAYER 2 PIECES   ", 122, 900);
			g.drawString("10                    10", 32, 155);
			g.drawString("9                     9", 47, 230);
			g.drawString("8                     8", 47, 305);
			g.drawString("7                     7", 47, 380);
			g.drawString("6                     6", 47, 455);
			g.drawString("5                     5", 47, 530);
			g.drawString("4                     4", 47, 605);
			g.drawString("3                     3", 47, 680);
			g.drawString("2                     2", 47, 755);
			g.drawString("1                     1", 47, 830);
			//Colors for Board
			//Draws board squares
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					// if ((i + j) % 2 == 0) {
					//pulls into an if statement if there are characters populating it
					if(playerTwoShips[i][j] != '\u0000') {
						//draws squares for ships
						if(playerTwoShips[i][j] =='S') {
							g.setColor(Color.BLACK);
							g.fillRect(125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						//overlaps ship token with hit circles if hit
						if(playerOneGrid[i][j] =='H') {
							g.setColor(Color.BLACK);
							g.fillRect(125 + 75 * i, 125 + 75 * j, 30, 30);
							g.setColor(Color.RED);
							g.fillOval(125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						g.setColor(Color.BLACK);
						g.drawRect(100 + 75*i, 100 + 75*j, 75, 75);
					}
					else {
						g.setColor(Color.BLACK);
						g.drawRect(100 + 75*i, 100 + 75*j, 75, 75);       
					}    
				}
			}
			//clear board 
			// print "ranks" and "files" - i.e. what the letters and numbers are called 
			//also prints which grid 
			g.setColor(Color.BLACK);
			g.setFont(new Font("Courier", Font.PLAIN, 62)); 
			g.drawString("A B C D E F G H I J", 1122, 85);
			g.drawString("   ATTACK GRID   ", 1122, 900);
			g.drawString("10                    10", 1032, 155);
			g.drawString("9                     9", 1047, 230);
			g.drawString("8                     8", 1047, 305);
			g.drawString("7                     7", 1047, 380);
			g.drawString("6                     6", 1047, 455);
			g.drawString("5                     5", 1047, 530);
			g.drawString("4                     4", 1047, 605);
			g.drawString("3                     3", 1047, 680);
			g.drawString("2                     2", 1047, 755);
			g.drawString("1                     1", 1047, 830);
			//Colors for Board
			//Draws board squares
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					//pulls into an if statement if there are characters populating it
					if(playerTwoGrid[i][j] != '\u0000') {
						//displays red circle for hit
						if(playerTwoGrid[i][j] =='H') {
							g.setColor(Color.RED);
							g.fillOval(1125 + 75 * i, 125 + 75 * j, 30, 30);
						}
						//displays white cirle for miss
						if(playerTwoGrid[i][j] =='M') {
							g.setColor(Color.WHITE);
							g.fillOval(1125 + 75 * i, 125 + 75 * j, 30, 30);
			        	}
						g.setColor(Color.BLACK);
						g.drawRect(1100 + 75*i, 100 + 75*j, 75, 75);
					}
					else {
						g.setColor(Color.BLACK);
						g.drawRect(1100 + 75*i, 100 + 75*j, 75, 75);       
					}    
				}
			}
		}
	}
	public static void placeShips(int whichPlayer) {
		Scanner userInput= new Scanner(System.in);
		System.out.println("Player " + whichPlayer+ " place your Carrier.  Will the carrier be oriented horizontally?");
		System.out.println("Type y for yes and n for no");
		char orientation = userInput.next().charAt(0);
		boolean isHorizontal= false;
		while (orientation!= 'y'&& orientation!= 'Y' &&orientation!= 'n'&&orientation!= 'N') {
			System.out.println("Invalid selection, try again.");
			orientation = userInput.next().charAt(0);
		}
		//stores boolean values for constructor 
		if (orientation=='y'||orientation=='Y') {
			isHorizontal=true;
		}
		if (orientation=='n'||orientation=='N') {
			isHorizontal=false;
		}
		System.out.println("Select a rank and file for the first square of the piece.");
		System.out.println("If the piece is horizontal this square will be on the left with the rest of the boat to the right.");
		System.out.println("If the piece is vertical this square will be on the top with the rest of the boat below.");
		//player chooses their initial tile placement
		System.out.println("Choose the rank");
		int placeRank=userInput.nextInt();
		System.out.println("Choose the file");
		char placeFile=userInput.next().charAt(0);
		//converts file to int
		int fileAsInt= convertFileToInt(placeFile);
		//initially makes sure the origin is within the gameboard limits
		while (placeRank>10 ||placeRank<1||fileAsInt>10||fileAsInt<1) {
			System.out.println("Choose the file");
			placeFile=userInput.next().charAt(0);
			System.out.println("Choose the Rank");
			placeRank=userInput.nextInt();
			fileAsInt= convertFileToInt(placeFile);
		}
		//populates the correct array
		if (whichPlayer==1) {
			BoatPiece Carrier1= new BoatPiece (placeRank, placeFile, 5, isHorizontal);
			if (Carrier1.getIsHorizontal()==true) {
				for (int i=0; i<Carrier1.getLength(); i++) {
					//checks if there is overlap or if it goes out of bounds
					if(Carrier1.getxCoord()+i-1>10||Carrier1.getxCoord()+i-1<0||playerOneShips[10-Carrier1.getyCoord()][Carrier1.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Carrier1.getxCoord()+i-1][10-Carrier1.getyCoord()]='S';
				}
				drawBoard(1);
			}
			if (Carrier1.getIsHorizontal()==false) {
				for (int i=0; i<Carrier1.getLength(); i++) {
					//checks if there is overlap or if it goes out of bounds
					if(10-Carrier1.getyCoord()+i>10||10-Carrier1.getyCoord()+i<0||playerOneShips[Carrier1.getxCoord()-1][10-Carrier1.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Carrier1.getxCoord()-1][10-Carrier1.getyCoord()+i]='S';
				}
				drawBoard(1);
			}
		}
		if (whichPlayer==2) {
			BoatPiece Carrier2= new BoatPiece (placeRank, placeFile, 5, isHorizontal);
			if (Carrier2.getIsHorizontal()==true) {
				for (int i=0; i<Carrier2.getLength(); i++) {
					//checks if there is overlap or if it goes out of bounds
					if(Carrier2.getxCoord()+i-1>10||Carrier2.getxCoord()+i-1<0||playerTwoShips[10-Carrier2.getyCoord()][Carrier2.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Carrier2.getxCoord()+i-1][10-Carrier2.getyCoord()]='S';
				}
				drawBoard(2);
			}
			if (Carrier2.getIsHorizontal()==false) {
				for (int i=0; i<Carrier2.getLength(); i++) {
					if(10-Carrier2.getyCoord()+i>10||10-Carrier2.getyCoord()+i<0||playerTwoShips[Carrier2.getxCoord()-1][10-Carrier2.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Carrier2.getxCoord()-1][10-Carrier2.getyCoord()+i]='S';
				}
				drawBoard(2);
			}	
		}
		//Identical Code but for the Battleship;
		System.out.println("Player " + whichPlayer+ " place your Battleship.  Will the battleship be oriented horizontally?");
		System.out.println("Type y for yes and n for no");
		orientation = userInput.next().charAt(0);
		isHorizontal= false;
		while (orientation!= 'y'&& orientation!= 'Y' &&orientation!= 'n'&&orientation!= 'N') {
			System.out.println("Invalid selection, try again.");
			orientation = userInput.next().charAt(0);
		}
		//stores boolean values for constructor 
		if (orientation=='y'||orientation=='Y') {
			isHorizontal=true;
		}
		if (orientation=='n'||orientation=='N') {
			isHorizontal=false;
		}
		System.out.println("Select a rank and file for the first square of the piece.");
		System.out.println("If the piece is horizontal this square will be on the left with the rest of the boat to the right.");
		System.out.println("If the piece is vertical this square will be on the top with the rest of the boat below.");
		//player chooses their initial tile placement
		System.out.println("Choose the rank");
		placeRank=userInput.nextInt();
		System.out.println("Choose the file");
		placeFile=userInput.next().charAt(0);
		//converts file to int
		fileAsInt= convertFileToInt(placeFile);
		//initially makes sure the origin is within the gameboard limits
		while (placeRank>10 ||placeRank<1||fileAsInt>10||fileAsInt<1) {
			System.out.println("Choose the file");
			placeFile=userInput.next().charAt(0);
			System.out.println("Choose the Rank");
			placeRank=userInput.nextInt();
			fileAsInt= convertFileToInt(placeFile);
		}
		
		if (whichPlayer==1) {
			BoatPiece Battleship1= new BoatPiece (placeRank, placeFile, 4, isHorizontal);
			if (Battleship1.getIsHorizontal()==true) {
				for (int i=0; i<Battleship1.getLength(); i++) {
					if(Battleship1.getxCoord()+i-1>10||Battleship1.getxCoord()+i-1<0||playerOneShips[10-Battleship1.getyCoord()][Battleship1.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Battleship1.getxCoord()+i-1][10-Battleship1.getyCoord()]='S';
				}
				drawBoard(1);
			}
			if (Battleship1.getIsHorizontal()==false) {
				for (int i=0; i<Battleship1.getLength(); i++) {
					if(10-Battleship1.getyCoord()+i>10||10-Battleship1.getyCoord()+i<0||playerOneShips[Battleship1.getxCoord()-1][10-Battleship1.getyCoord()+i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Battleship1.getxCoord()-1][10-Battleship1.getyCoord()+i]='S';
				}
				drawBoard(1);
			}
		}
		if (whichPlayer==2) {
			BoatPiece Battleship2= new BoatPiece (placeRank, placeFile, 4, isHorizontal);
			if (Battleship2.getIsHorizontal()==true) {
				for (int i=0; i<Battleship2.getLength(); i++) {
					if(Battleship2.getxCoord()+i-1>10||Battleship2.getxCoord()+i-1<0||playerTwoShips[10-Battleship2.getyCoord()][Battleship2.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Battleship2.getxCoord()+i-1][10-Battleship2.getyCoord()]='S';
				}
				drawBoard(2);
			}
			if (Battleship2.getIsHorizontal()==false) {
				for (int i=0; i<Battleship2.getLength(); i++) {
					if(10-Battleship2.getyCoord()+i>10||10-Battleship2.getyCoord()+i<0||playerTwoShips[Battleship2.getxCoord()-1][10-Battleship2.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Battleship2.getxCoord()-1][10-Battleship2.getyCoord()+i]='S';
				}
				drawBoard(2);
			}	
		}
		//Identical Code but for the Destroyer;
		System.out.println("Next place your Destroyer.  Will the destroyer be oriented horizontally?");
		System.out.println("Type y for yes and n for no");
		orientation = userInput.next().charAt(0);
		isHorizontal= false;
		while (orientation!= 'y'&& orientation!= 'Y' &&orientation!= 'n'&&orientation!= 'N') {
			System.out.println("Invalid selection, try again.");
			orientation = userInput.next().charAt(0);
		}
		//stores boolean values for constructor 
		if (orientation=='y'||orientation=='Y') {
			isHorizontal=true;
		}
		if (orientation=='n'||orientation=='N') {
			isHorizontal=false;
		}
		System.out.println("Select a rank and file for the first square of the piece.");
		System.out.println("If the piece is horizontal this square will be on the left with the rest of the boat to the right.");
		System.out.println("If the piece is vertical this square will be on the top with the rest of the boat below.");
		//player chooses their initial tile placement
		System.out.println("Choose the rank");
		placeRank=userInput.nextInt();
		System.out.println("Choose the file");
		placeFile=userInput.next().charAt(0);
		//converts file to int
		fileAsInt= convertFileToInt(placeFile);
		//initially makes sure the origin is within the gameboard limits
		while (placeRank>10 ||placeRank<1||fileAsInt>10||fileAsInt<1) {
			System.out.println("Choose the file");
			placeFile=userInput.next().charAt(0);
			System.out.println("Choose the Rank");
			placeRank=userInput.nextInt();
			fileAsInt= convertFileToInt(placeFile);
		}
		
		if (whichPlayer==1) {
			BoatPiece Destroyer1= new BoatPiece (placeRank, placeFile, 3, isHorizontal);
			if (Destroyer1.getIsHorizontal()==true) {
				for (int i=0; i<Destroyer1.getLength(); i++) {
					if(Destroyer1.getxCoord()+i-1>10||Destroyer1.getxCoord()+i-1<0||playerOneShips[10-Destroyer1.getyCoord()][Destroyer1.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Destroyer1.getxCoord()+i-1][10-Destroyer1.getyCoord()]='S';
				}
				drawBoard(1);
			}
			if (Destroyer1.getIsHorizontal()==false) {
				for (int i=0; i<Destroyer1.getLength(); i++) {
					if(10-Destroyer1.getyCoord()+i>10||10-Destroyer1.getyCoord()+i<0||playerOneShips[Destroyer1.getxCoord()-1][10-Destroyer1.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Destroyer1.getxCoord()-1][10-Destroyer1.getyCoord()+i]='S';
				}
				drawBoard(1);
			}
		}
		if (whichPlayer==2) {
			BoatPiece Destroyer2= new BoatPiece (placeRank, placeFile, 3, isHorizontal);
			if (Destroyer2.getIsHorizontal()==true) {
				for (int i=0; i<Destroyer2.getLength(); i++) {
					if(Destroyer2.getxCoord()+i-1>10||Destroyer2.getxCoord()+i-1<0||playerTwoShips[10-Destroyer2.getyCoord()][Destroyer2.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Destroyer2.getxCoord()+i-1][10-Destroyer2.getyCoord()]='S';
				}
				drawBoard(2);
			}
			if (Destroyer2.getIsHorizontal()==false) {
				for (int i=0; i<Destroyer2.getLength(); i++) {
					if(10-Destroyer2.getyCoord()+i>10||10-Destroyer2.getyCoord()+i<0||playerTwoShips[Destroyer2.getxCoord()-1][10-Destroyer2.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Destroyer2.getxCoord()-1][10-Destroyer2.getyCoord()+i]='S';
				}
				drawBoard(2);
			}	
		}
		//Code for Submarine placement
		System.out.println("Next place your Submarine.  Will the submarine be oriented horizontally?");
		System.out.println("Type y for yes and n for no");
		orientation = userInput.next().charAt(0);
		isHorizontal= false;
		while (orientation!= 'y'&& orientation!= 'Y' &&orientation!= 'n'&&orientation!= 'N') {
			System.out.println("Invalid selection, try again.");
			orientation = userInput.next().charAt(0);
		}
		//stores boolean values for constructor 
		if (orientation=='y'||orientation=='Y') {
			isHorizontal=true;
		}
		if (orientation=='n'||orientation=='N') {
			isHorizontal=false;
		}
		System.out.println("Select a rank and file for the first square of the piece.");
		System.out.println("If the piece is horizontal this square will be on the left with the rest of the boat to the right.");
		System.out.println("If the piece is vertical this square will be on the top with the rest of the boat below.");
		//player chooses their initial tile placement
		System.out.println("Choose the rank");
		placeRank=userInput.nextInt();
		System.out.println("Choose the file");
		placeFile=userInput.next().charAt(0);
		//converts file to int
		fileAsInt= convertFileToInt(placeFile);
		//initially makes sure the origin is within the gameboard limits
		while (placeRank>10 ||placeRank<1||fileAsInt>10||fileAsInt<1) {
			System.out.println("Choose the file");
			placeFile=userInput.next().charAt(0);
			System.out.println("Choose the Rank");
			placeRank=userInput.nextInt();
			fileAsInt= convertFileToInt(placeFile);
		}
		
		if (whichPlayer==1) {
			BoatPiece Submarine1= new BoatPiece (placeRank, placeFile, 3, isHorizontal);
			if (Submarine1.getIsHorizontal()==true) {
				for (int i=0; i<Submarine1.getLength(); i++) {
					if(Submarine1.getxCoord()+i-1>10||Submarine1.getxCoord()+i-1<0||playerOneShips[10-Submarine1.getyCoord()][Submarine1.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Submarine1.getxCoord()+i-1][10-Submarine1.getyCoord()]='S';
				}
				drawBoard(1);
			}
			if (Submarine1.getIsHorizontal()==false) {
				for (int i=0; i<Submarine1.getLength(); i++) {
					if(10-Submarine1.getyCoord()+i>10||10-Submarine1.getyCoord()+i<0||playerOneShips[Submarine1.getxCoord()-1][10-Submarine1.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[Submarine1.getxCoord()-1][10-Submarine1.getyCoord()+i]='S';
				}
				drawBoard(1);
			}
		}
		if (whichPlayer==2) {
			BoatPiece Submarine2= new BoatPiece (placeRank, placeFile, 3, isHorizontal);
			if (Submarine2.getIsHorizontal()==true) {
				for (int i=0; i<Submarine2.getLength(); i++) {
					if(Submarine2.getxCoord()+i-1>10||Submarine2.getxCoord()+i-1<0||playerTwoShips[10-Submarine2.getyCoord()][Submarine2.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Submarine2.getxCoord()+i-1][10-Submarine2.getyCoord()]='S';
				}
				drawBoard(2);
			}
			if (Submarine2.getIsHorizontal()==false) {
				for (int i=0; i<Submarine2.getLength(); i++) {
					if(10-Submarine2.getyCoord()+i>10||10-Submarine2.getyCoord()+i<0||playerTwoShips[Submarine2.getxCoord()-1][10-Submarine2.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[Submarine2.getxCoord()-1][10-Submarine2.getyCoord()+i]='S';
				}
				drawBoard(2);
			}	
		}
		//Code for patrol boat placement
		System.out.println("Next place your PatrolBoat.  Will the patrol boat be oriented horizontally?");
		System.out.println("Type y for yes and n for no");
		orientation = userInput.next().charAt(0);
		isHorizontal= false;
		while (orientation!= 'y'&& orientation!= 'Y' &&orientation!= 'n'&&orientation!= 'N') {
			System.out.println("Invalid selection, try again.");
			orientation = userInput.next().charAt(0);
		}
		//stores boolean values for constructor 
		if (orientation=='y'||orientation=='Y') {
			isHorizontal=true;
		}
		if (orientation=='n'||orientation=='N') {
			isHorizontal=false;
		}
		System.out.println("Select a rank and file for the first square of the piece.");
		System.out.println("If the piece is horizontal this square will be on the left with the rest of the boat to the right.");
		System.out.println("If the piece is vertical this square will be on the top with the rest of the boat below.");
		//player chooses their initial tile placement
		System.out.println("Choose the rank");
		placeRank=userInput.nextInt();
		System.out.println("Choose the file");
		placeFile=userInput.next().charAt(0);
		//converts file to int
		fileAsInt= convertFileToInt(placeFile);
		//initially makes sure the origin is within the gameboard limits
		while (placeRank>10 ||placeRank<1||fileAsInt>10||fileAsInt<1) {
			System.out.println("Choose the file");
			placeFile=userInput.next().charAt(0);
			System.out.println("Choose the Rank");
			placeRank=userInput.nextInt();
			fileAsInt= convertFileToInt(placeFile);
		}
		
		if (whichPlayer==1) {
			BoatPiece patrolBoat1= new BoatPiece (placeRank, placeFile, 2, isHorizontal);
			if (patrolBoat1.getIsHorizontal()==true) {
				for (int i=0; i<patrolBoat1.getLength(); i++) {
					if(patrolBoat1.getxCoord()+i-1>10||patrolBoat1.getxCoord()+i-1<0||playerOneShips[10-patrolBoat1.getyCoord()][patrolBoat1.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[patrolBoat1.getxCoord()+i-1][10-patrolBoat1.getyCoord()]='S';
				}
				drawBoard(1);
			}
			if (patrolBoat1.getIsHorizontal()==false) {
				for (int i=0; i<patrolBoat1.getLength(); i++) {
					if(10-patrolBoat1.getyCoord()+i>10||10-patrolBoat1.getyCoord()+i<0||playerOneShips[patrolBoat1.getxCoord()-1][10-patrolBoat1.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerOneShips[patrolBoat1.getxCoord()-1][10-patrolBoat1.getyCoord()+i]='S';
				}
				drawBoard(1);
			}
		}
		if (whichPlayer==2) {
			BoatPiece patrolBoat2= new BoatPiece (placeRank, placeFile, 2, isHorizontal);
			if (patrolBoat2.getIsHorizontal()==true) {
				for (int i=0; i<patrolBoat2.getLength(); i++) {
					if(patrolBoat2.getxCoord()+i-1>10||patrolBoat2.getxCoord()+i-1<0||playerTwoShips[10-patrolBoat2.getyCoord()][patrolBoat2.getxCoord()+i-1]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[patrolBoat2.getxCoord()+i-1][10-patrolBoat2.getyCoord()]='S';
				}
				drawBoard(2);
			}
			if (patrolBoat2.getIsHorizontal()==false) {
				for (int i=0; i<patrolBoat2.getLength(); i++) {
					if(10-patrolBoat2.getyCoord()+i>10||10-patrolBoat2.getyCoord()+i<0||playerTwoShips[patrolBoat2.getxCoord()-1][10-patrolBoat2.getyCoord()-i]=='S') {
						System.out.println("Invalid ship placement.");
						break;
					}
					playerTwoShips[patrolBoat2.getxCoord()-1][10-patrolBoat2.getyCoord()+i]='S';
				}
				drawBoard(2);
			}	
		}
	}
	public static boolean takeTurn() {
		//reset hit counter
		int hitCount=0;
		int targetRank;
		char targetFile;
		Scanner userInput= new Scanner(System.in);
		System.out.println("Player 1 choose your target");
		System.out.println("Choose the file for your attack");
		//take in attack coordinates
		targetFile=userInput.next().charAt(0);
		int fileAsInt= convertFileToInt(targetFile);
		System.out.println("Choose the Rank");
		targetRank=userInput.nextInt();
		//Set attacking players grid to show hit and defending players ship to show hit
		if(playerTwoShips[fileAsInt-1][10-targetRank]=='S') {
			//playerTwoShips[fileAsInt-1][10-targetRank]='H';
			playerOneGrid[fileAsInt-1][10-targetRank]='H';
			System.out.println("Hit!");
		}
		//Set grid to show a miss if it's a miss
		if(playerTwoShips[fileAsInt-1][10-targetRank]!='S') {
			playerOneGrid[fileAsInt-1][10-targetRank]='M';
			System.out.println("Miss!");
		}
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if (playerOneGrid[i][j]=='H') {
					 hitCount++;
					 //if all ships have been fully sunk return win
					 if (hitCount==2) {
						 System.out.println("Player 1 Wins");
						 drawBoard(1);
						 return true;
					 }
				}
			}
		}
		drawBoard(1);
		//reset hit counter
		hitCount=0;
		System.out.println("Player 2 choose your target");
		System.out.println("Choose the file for your attack");
		//take in attack coordinates
		targetFile=userInput.next().charAt(0);
		fileAsInt= convertFileToInt(targetFile);
		System.out.println("Choose the Rank");
		targetRank=userInput.nextInt();
		//Set attacking players grid to show hit and defending players ship to show hit
		if(playerOneShips[fileAsInt-1][10-targetRank]=='S') {
			//playerOneShips[fileAsInt-1][10-targetRank]='H';
			playerTwoGrid[fileAsInt-1][10-targetRank]='H';
			System.out.println("Hit!");
		}
		//Set grid to show a miss if it's a miss
		if(playerOneShips[fileAsInt-1][10-targetRank]!='S') {
			playerTwoGrid[fileAsInt-1][10-targetRank]='M';
			System.out.println("Miss!");
		}
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				//if all ships have been fully sunk return win
				if (playerTwoGrid[i][j]=='H') {
					 hitCount++;
					 if (hitCount==2) {
						 System.out.println("Player 2 Wins");
						 drawBoard(2);
						 return true;
					 }
				}
			}
		}
		drawBoard(2);
		return takeTurn();
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Battleship! Prepare your battlefield.");
		drawBoard(1);
		placeShips(1);
		drawBoard(2);
		placeShips(2);
		if(takeTurn()==true) {
			System.out.println("Thank you for playing Battleship!");
		}

	}

}
