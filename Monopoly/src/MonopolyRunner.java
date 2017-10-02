import java.io.*;
import java.util.*;
public class MonopolyRunner
	{
	static ArrayList <boardSpaces> board = new ArrayList <boardSpaces>();
	static ArrayList <Player> player = new ArrayList <Player>();
	static ArrayList <Peice> boardPiece = new ArrayList <Peice>();
	public static void main(String[] args)
		{
		boardSetUp();
		peiceSetUp();
		playerSetUp();
		playGame1();
		}
	private static void peiceSetUp()
		{
		boardPiece.add(new Peice ("Doggo", 1200));
		boardPiece.add(new Peice ("Top Hat", 1600));
		boardPiece.add(new Peice ("Thimble", 1200));
		boardPiece.add(new Peice ("Car", 1200));
		boardPiece.add(new Peice ("Boot", 1000));
		boardPiece.add(new Peice ("Wheelbarrow", 1200));
		}
	private static void boardSetUp()
		{
		board.add(new boardSpaces ("Go. Collect 200", "Unsellable", " ", " ", 200, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Shitty Back Alley Lane", "None", " ", " ", 60, 30, 0, 10, 0, 20));
		board.add(new boardSpaces ("Chance", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Balsamic VineAvenue", "None", " ", " ", 60, 30, 0, 10, 0, 20));
		board.add(new boardSpaces ("Income Tax", "Unsellable", "X", "X", 0, 200, 0, 0, 0, 0));
		board.add(new boardSpaces ("Illiteracy Choo-Choo", "None", " ", " ", 200, 50, 0, 0, 0, 0));
		board.add(new boardSpaces ("Doctor Strange Referance", "None", " ", " ", 100, 50, 0, 10, 0, 30));
		board.add(new boardSpaces ("Chance", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Vermange Avenue", "None", " ", " ", 100, 50, 0, 10, 0, 30));
		board.add(new boardSpaces ("Slighty More Expensive Street", "None", " ", " ", 120, 60, 0, 20, 0, 30));
		board.add(new boardSpaces ("Visiting Jail Yo", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("St. Chase's Place", "None", " ", " ", 140, 70, 0, 20, 0, 40));
		board.add(new boardSpaces ("Monty Burns Utilities", "None", " ", " ", 150, 40, 0, 0, 0, 0));
		board.add(new boardSpaces ("Stan Lee Cameo", "None", " ", " ", 140, 70, 0, 20, 0, 40));
		board.add(new boardSpaces ("Someplace in the South Street", "None", " ", " ", 160, 80, 0, 20, 0, 50));
		board.add(new boardSpaces ("Transcontinental Choo-Choo", "None", " ", " ", 200, 50, 0, 0, 0, 0));
		board.add(new boardSpaces ("St. McGuire Way", "None", " ", " ", 180, 90, 0, 30, 0, 50));
		board.add(new boardSpaces ("Chance", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("The Only 10-I-See Avenue", "None", " ", " ", 180, 90, 0, 30, 0, 50));
		board.add(new boardSpaces ("Live From New York! It's *Insert crummy late night show here*", "None", " ", " ", 200, 100, 0, 30, 0, 60));
		board.add(new boardSpaces ("Stringy Old Scrooge Parking!!!", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Mmmmmmmmmm.....Bourbon", "None", " ", " ", 220, 110, 0, 40, 0, 60));
		board.add(new boardSpaces ("Chance", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Home of the Colts Lane", "None", " ", " ", 220, 110, 0, 40, 0, 60));
		board.add(new boardSpaces ("Nothin but Corn Here", "None", " ", " ", 240, 120, 0, 50, 0, 60));
		board.add(new boardSpaces ("Brand Name Choo-Choo", "None", " ", " ", 200, 50, 0, 0, 0, 0));
		board.add(new boardSpaces ("The Lost City of Atlanta Avenue", "None", " ", " ", 260, 130, 0, 50, 0, 80));
		board.add(new boardSpaces ("Weirdly Spelled Street", "None", " ", " ", 260, 130, 0, 50, 0, 80));
		board.add(new boardSpaces ("WE SELL WATER SUCKAS Utilities", "None", " ", " ", 150, 40, 0, 0, 0, 0));
		board.add(new boardSpaces ("YOU DONE GOT CAUGHT MY DEWD", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("The Big Ocean Avenue", "None", " ", " ", 300, 150, 0, 60, 0, 90));
		board.add(new boardSpaces ("To The North of South Carolina Place", "None", " ", " ", 300, 150, 0, 60, 0, 90));
		board.add(new boardSpaces ("THE BIRTHPLACE OF THE GREATEST COUNTRY ON EARTH Street", "None", " ", " ", 320, 160, 0, 70, 0, 90));
		board.add(new boardSpaces ("Smol Fancy Choo-Choo", "None", " ", " ", 200, 50, 0, 0, 0, 0));
		board.add(new boardSpaces ("Chance", "Unsellable", " ", " ", 0, 0, 0, 0, 0, 0));
		board.add(new boardSpaces ("Gated Community Street", "None", " ", " ", 360, 180, 0, 80, 0, 120));
		board.add(new boardSpaces ("Rich Person Tax", "Unsellable", "X", "X", 0, 100, 0, 0, 0, 0));
		board.add(new boardSpaces ("Not Even a Street Street", "None", " ", " ", 400, 200, 0, 100, 0, 160));
		}
	private static void playerSetUp()
		{
		for (int i = 0; i < 2; i ++)
			{
			System.out.println("What is your name?");
			Scanner userInput = new Scanner (System.in);
			String name = userInput.nextLine();
			System.out.println("Which piece would you like to play as today?");
			int counter = 1;
			for (Peice p: boardPiece)
				{
				System.out.println(counter + "). " + p.getType());
				counter++;
				}
			Scanner userInput1 = new Scanner (System.in);
			int selection = userInput1.nextInt();
			player.add(new Player (name, "Player" + (i + 1), boardPiece.get(selection -1).getStartingValue(), 0, 0));
			}
		}
	private static void playGame1()
		{
		int dice = (int) (Math.random() * 6) + 1;
		if (player.get(0).getPosition() + dice > 37)
			{
			player.get(0).setPosition((player.get(0).getPosition() + dice) - 37);
			System.out.println(player.get(0).getName() + " you have rolled a " + dice + ". That means you have landed on " + board.get(player.get(0).getPosition()).getPropertyName());
			collect2001();
			}
		else
			{
			player.get(0).setPosition(player.get(0).getPosition() + dice);
			System.out.println(player.get(0).getName() + " you have rolled a " + dice + ". That means you have landed on " + board.get(player.get(0).getPosition()).getPropertyName());
			}
		if (board.get(player.get(0).getPosition()).equals(0))
			{
			System.out.println("You're on Go. Nothing else happens here...");
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().equals("Chance"))
			{
			drawAChanceCard1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().equals("YOU DONE GOT CAUGHT MY DEWD"))
			{
			jailTime1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().equals("Stringy Old Scrooge Parking!!!"))
			{
			freeParking1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().equals("Visiting Jail Yo"))
			{
			visitingJail1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().contains("Choo-Choo"))
			{
			joinTheRailRoad1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().contains("Utilities"))
			{
			utilityCompany1();
			}
		else if (board.get(player.get(0).getPosition()).getPropertyName().contains("Tax"))
			{
			taxThemAHoles1();
			}
		else
			{
			propertyManagement1();
			}
		}
	private static void taxThemAHoles1()
		{
		System.out.println("This is a tax! You'll have to pay " + board.get(player.get(0).getPosition()).getStayValue() + ". You have $" + player.get(0).getAmountOfMoney());
		if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() == 0)
			{
			System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
			System.exit(0);
			}
		else if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() > 0)
			{
			System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
			int counter = 0;
			for (int i = 0; i <= 37; i++)
				{
				if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(0).getPosition()).getStayValue() > -1)
					{
					System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
					counter ++;
					}
				}
			if (counter == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else
				{
				Scanner userInput = new Scanner (System.in);
				int decision = userInput.nextInt();
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
				System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
				board.get(decision - 1).setOwnership("None");
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(0).getPosition()).getStayValue() + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		else 
			{
			player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getStayValue()));
			System.out.println("You have paid the fee of " + (board.get(player.get(0).getPosition()).getStayValue()) + ". You now have " + player.get(0).getAmountOfMoney());
			playGame2();
			}
		}
	private static void propertyManagement1()
		{
		if (board.get(player.get(0).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println(board.get(player.get(0).getPosition()).getPropertyName() + " is owned by " + player.get(1).getName() + "!");
			System.out.println("You will have to pay a fine of " + (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())) + " to stay here.");
			if (player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())) < 0 && player.get(0).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())) < 0 && player.get(0).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(0).getPosition()).getStayValue() > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					board.get(decision -1).setNumberOfHotels(0);
					board.get(decision - 1).setNumberOfHouses(0);
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())));
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())));
					System.out.println("You have paid the fee of " + (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())) + ". You now have " + player.get(0).getAmountOfMoney());
					playGame2();
					}
				}
			else 
				{
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())));
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())));
				System.out.println("You have paid the fee of " + (board.get(player.get(0).getPosition()).getStayValue() + (board.get(player.get(0).getPosition()).getValueOfHotels() * board.get(player.get(0).getPosition()).getNumberOfHotels()) + (board.get(player.get(0).getPosition()).getValueOfHouses() * board.get(player.get(0).getPosition()).getNumberOfHouses())) + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		else if (board.get(player.get(0).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println("You own this property...you get to stay for free!!!");
			if ((board.get(player.get(0).getPosition()).getNumberOfHotels() < 4 && board.get(player.get(0).getPosition()).getNumberOfHouses() == 4) && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHotels() / 2) >= 0)
				{
				System.out.println("You have the chance to upgrade to a hotel! Buy it for " + board.get(player.get(0).getPosition()).getValueOfHotels() / 2 + "? You currently have " + player.get(0).getAmountOfMoney() + ".");
				System.out.println("1). yes");
				System.out.println("2). no");
				Scanner userInput = new Scanner (System.in);
				int decision1 = userInput.nextInt();
				if (decision1 == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHotels() / 2) >= 0)
					{
					board.get(player.get(0).getPosition()).setNumberOfHotels(board.get(player.get(0).getPosition()).getNumberOfHotels() + 1);
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHotels() / 2));
					System.out.println("You bought a hotel. You now have " + board.get(player.get(0).getPosition()).getNumberOfHotels() + " hotels and " + board.get(player.get(0).getPosition()).getNumberOfHouses() + " houses. You have " + player.get(0).getAmountOfMoney() + " in cash.");
					}
				else if (decision1 == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHotels() / 2) < 0)
					{
					System.out.println("Sorry, you don't have the money...");
					}
				else 
					{
					System.out.println("Ok, it's your money.");
					}
				}
			else if (board.get(player.get(0).getPosition()).getNumberOfHouses() < 4 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHouses() / 2) >= 0)
				{
				System.out.println("You have the chance to upgrade to a house! Buy it for " + board.get(player.get(0).getPosition()).getValueOfHouses() / 2 + "? You currently have " + player.get(0).getAmountOfMoney() + ".");
				System.out.println("1). yes");
				System.out.println("2). no");
				Scanner userInput = new Scanner (System.in);
				int decision2 = userInput.nextInt();
				if (decision2 == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHouses() / 2) >= 0)
					{
					board.get(player.get(0).getPosition()).setNumberOfHouses(board.get(player.get(0).getPosition()).getNumberOfHouses() + 1);
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHouses() / 2));
					System.out.println("You bought a house. You now have " + board.get(player.get(0).getPosition()).getNumberOfHouses() + " houses. You have " + player.get(0).getAmountOfMoney() + " in cash.");
					}
				else if (decision2 == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getValueOfHouses() / 2) < 0)
					{
					System.out.println("Sorry, you don't have the money...");
					}
				else 
					{
					System.out.println("Ok, it's your money.");
					}
				}
			playGame2();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(0).getPosition()).getPurchaseValue() + "? You have $" + player.get(0).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(0).getPosition()).setOwnership("Player1");
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(0).getAmountOfMoney() + " in cash.");
				playGame2();
				}
			else if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("Sorry, you don't have the cash...");
				playGame2();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame2();
				}
			}
		}
	private static void utilityCompany1()
		{
		if (board.get(player.get(0).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println("The " + board.get(player.get(0).getPosition()).getPropertyName() + " is owned by " + player.get(1).getName() + "!");
			System.out.println("You will have to pay a fine of " + board.get(player.get(0).getPosition()).getStayValue() + " to use these utilities.");
			if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(0).getPosition()).getStayValue() > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue());
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + board.get(player.get(0).getPosition()).getStayValue());
					System.out.println("You have paid the fee of " + board.get(player.get(0).getPosition()).getStayValue() + ". You now have " + player.get(0).getAmountOfMoney());
					playGame2();
					}
				}
			else 
				{
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue());
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + board.get(player.get(0).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(0).getPosition()).getStayValue() + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		else if (board.get(player.get(0).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println("You own this company...you get it for free!!!");
			playGame2();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(0).getPosition()).getPurchaseValue() + "? You have $" + player.get(0).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(0).getPosition()).setOwnership("Player1");
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(0).getAmountOfMoney() + " in cash.");
				playGame2();
				}
			else if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("Sorry man, you don't have the money...");
				playGame2();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame2();
				}
			}
		}
	private static void joinTheRailRoad1()
		{
		if (board.get(player.get(0).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println("The " + board.get(player.get(0).getPosition()).getPropertyName() + " is owned by " + player.get(1).getName() + "!");
			System.out.println("You will have to pay a fine of " + board.get(player.get(0).getPosition()).getStayValue() + " to ride this train.");
			if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(0).getPosition()).getStayValue() > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue());
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + board.get(player.get(0).getPosition()).getStayValue());
					System.out.println("You have paid the fee of " + board.get(player.get(0).getPosition()).getStayValue() + ". You now have " + player.get(0).getAmountOfMoney());
					playGame2();
					}
				}
			else 
				{
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getStayValue());
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + board.get(player.get(0).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(0).getPosition()).getStayValue() + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		else if (board.get(player.get(0).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println("You own this Choo-Choo...you get to ride for free!!!");
			playGame2();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(0).getPosition()).getPurchaseValue() + "? You have $" + player.get(0).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(0).getPosition()).setOwnership("Player1");
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - board.get(player.get(0).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(0).getAmountOfMoney() + " in cash.");
				playGame2();
				}
			else if (decision == 1 && player.get(0).getAmountOfMoney() - (board.get(player.get(0).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("You don't have the cash.");
				playGame2();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame2();
				}
			}
		}
	private static void visitingJail1()
		{
		System.out.println("Just visiting my homie in jail. Nothing to see here...");
		playGame2();
		}
	private static void drawAChanceCard1()
		{
		System.out.println("You have landed on a Chance card. Let's hope it pans out.");
		int fate = (int) (Math.random() * 2);
		if (fate == 0)
			{
			int goodOutcome = (int) (Math.random() * 400) + 100;
			player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + goodOutcome);
			System.out.println("Hooray!!! Bank error in your favor my man! You just got paid " + goodOutcome + "! You now have a total of " + player.get(0).getAmountOfMoney());
			playGame2();
			}
		else 
			{
			int badOutcome = (int) (Math.random() * 400) + 100;
			System.out.println("Uh oh!!! An audit has revealed you owe back taxes worth upwards of " + badOutcome + ". You currently have $" + player.get(0).getAmountOfMoney() + " in the bank.");
			if (player.get(0).getAmountOfMoney() - badOutcome < 0 && player.get(0).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(0).getAmountOfMoney() - badOutcome < 0 && player.get(0).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - badOutcome > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - badOutcome);
					System.out.println("You have paid the fee of " + badOutcome + ". You now have " + player.get(0).getAmountOfMoney());
					playGame2();
					}
				}
			else 
				{
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - badOutcome);
				System.out.println("You have paid the price of " + badOutcome + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		}
	private static void freeParking1()
		{
		System.out.println("Free parking my man!!!!! Enjoy the freeness!!!");
		playGame2();
		}
	private static void jailTime1()
		{
		int bail = (int) (Math.random() * 200) + 50;
		System.out.println("You've been caught you dirty bastard. Bail is set at " + bail + ".");
		if (player.get(0).getAmountOfMoney() - bail < 0 && player.get(0).getNumberOfProperties() == 0)
			{
			System.out.println("Congrats my man. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
			System.exit(0);
			}
		else if (player.get(0).getAmountOfMoney() - bail < 0 && player.get(0).getNumberOfProperties() > 0)
			{
			System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
			int counter = 0;
			for (int i = 0; i <= 37; i++)
				{
				if (board.get(i).getOwnership().equals(player.get(0).getPlayerDesignation()) && (player.get(0).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - bail > -1)
					{
					System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
					counter ++;
					}
				}
			if (counter == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(1).getName() + "! You win!!!");
				System.exit(0);
				}
			else
				{
				Scanner userInput = new Scanner (System.in);
				int decision = userInput.nextInt();
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
				System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(0).getAmountOfMoney());
				board.get(decision - 1).setOwnership("None");
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - bail);
				System.out.println("You have paid the fee of " + bail + ". You now have " + player.get(0).getAmountOfMoney());
				playGame2();
				}
			}
		else 
			{
			player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() - bail);
			System.out.println("You have paid the bail of " + bail + ". You now have " + player.get(0).getAmountOfMoney());
			playGame2();
			}
		}
	private static void collect2001()
		{
		player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + 200);
		System.out.println("You have passed go and collected 200. Your net cash value is" + player.get(0).getAmountOfMoney());
		}
	private static void playGame2()
		{
		int dice = (int) (Math.random() * 6) + 1;
		if (player.get(1).getPosition() + dice > 37)
			{
			player.get(1).setPosition((player.get(1).getPosition() + dice) - 37);
			System.out.println(player.get(1).getName() + " you have rolled a " + dice + ". That means you have landed on " + board.get(player.get(1).getPosition()).getPropertyName());
			collect2002();
			}
		else
			{
			player.get(1).setPosition(player.get(1).getPosition() + dice);
			System.out.println(player.get(1).getName() + " you have rolled a " + dice + ". That means you have landed on " + board.get(player.get(1).getPosition()).getPropertyName());
			}
		if (board.get(player.get(1).getPosition()).equals(0))
			{
			System.out.println("You're on Go. Nothing else happens here...");
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().equals("Chance"))
			{
			drawAChanceCard2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().equals("YOU DONE GOT CAUGHT MY DEWD"))
			{
			jailTime2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().equals("Stringy Old Scrooge Parking!!!"))
			{
			freeParking2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().equals("Visiting Jail Yo"))
			{
			visitingJail2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().contains("Choo-Choo"))
			{
			joinTheRailRoad2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().contains("Utilities"))
			{
			utilityCompany2();
			}
		else if (board.get(player.get(1).getPosition()).getPropertyName().contains("Tax"))
			{
			taxThemAHoles2();
			}
		else
			{
			propertyManagement2();
			}
		}
	private static void propertyManagement2()
		{
		if (board.get(player.get(1).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println(board.get(player.get(1).getPosition()).getPropertyName() + " is owned by " + player.get(0).getName() + "!");
			System.out.println("You will have to pay a fine of " + (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) + " to stay here.");
			if (player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) < 0 && player.get(1).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) < 0 && player.get(1).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(1).getPosition()).getStayValue() + ((board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) < 0 && player.get(1).getNumberOfProperties()> -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					board.get(decision -1).setNumberOfHotels(0);
					board.get(decision - 1).setNumberOfHouses(0);
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())));
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())));
					System.out.println("You have paid the fee of " + (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) + ". You now have " + player.get(1).getAmountOfMoney());
					playGame1();
					}
				}
			else 
				{
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())));
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())));
				System.out.println("You have paid the fee of " + (board.get(player.get(1).getPosition()).getStayValue() + (board.get(player.get(1).getPosition()).getValueOfHotels() * board.get(player.get(1).getPosition()).getNumberOfHotels()) + (board.get(player.get(1).getPosition()).getValueOfHouses() * board.get(player.get(1).getPosition()).getNumberOfHouses())) + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		else if (board.get(player.get(1).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println("You own this property...you get to stay for free!!!");
			if ((board.get(player.get(1).getPosition()).getNumberOfHotels() < 4 && board.get(player.get(1).getPosition()).getNumberOfHouses() == 4) && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHotels() / 2) >= 0)
				{
				System.out.println("You have the chance to upgrade to a hotel! Buy it for " + board.get(player.get(1).getPosition()).getValueOfHotels() / 2 + "? You currently have " + player.get(1).getAmountOfMoney() + ".");
				System.out.println("1). yes");
				System.out.println("2). no");
				Scanner userInput = new Scanner (System.in);
				int decision1 = userInput.nextInt();
				if (decision1 == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHotels() / 2) >= 0)
					{
					board.get(player.get(1).getPosition()).setNumberOfHotels(board.get(player.get(1).getPosition()).getNumberOfHotels() + 1);
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHotels() / 2));
					System.out.println("You bought a hotel. You now have " + board.get(player.get(1).getPosition()).getNumberOfHotels() + " hotels and " + board.get(player.get(1).getPosition()).getNumberOfHouses() + " houses. You have " + player.get(1).getAmountOfMoney() + " in cash.");
					}
				else if (decision1 == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHotels() / 2) < 0)
					{
					System.out.println("Sorry, you don't have the money...");
					}
				else 
					{
					System.out.println("Ok, it's your money.");
					}
				}
			else if (board.get(player.get(1).getPosition()).getNumberOfHouses() < 4 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHouses() / 2) >= 0)
				{
				System.out.println("You have the chance to upgrade to a house! Buy it for " + board.get(player.get(1).getPosition()).getValueOfHouses() / 2 + "? You currently have " + player.get(1).getAmountOfMoney() + ".");
				System.out.println("1). yes");
				System.out.println("2). no");
				Scanner userInput = new Scanner (System.in);
				int decision2 = userInput.nextInt();
				if (decision2 == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHouses() / 2) >= 0)
					{
					board.get(player.get(1).getPosition()).setNumberOfHouses(board.get(player.get(1).getPosition()).getNumberOfHouses() + 1);
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHouses() / 2));
					System.out.println("You bought a house. You now have " + board.get(player.get(1).getPosition()).getNumberOfHouses() + " houses. You have " + player.get(1).getAmountOfMoney() + " in cash.");
					}
				else if (decision2 == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getValueOfHouses() / 2) < 0)
					{
					System.out.println("Sorry, you don't have the money...");
					}
				else 
					{
					System.out.println("Ok, it's your money.");
					}
				}
			playGame1();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(1).getPosition()).getPurchaseValue() + "? You have $" + player.get(1).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(1).getPosition()).setOwnership("Player2");
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(1).getAmountOfMoney() + " in cash.");
				playGame1();
				}
			else if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("Sorry, you don't have the cash...");
				playGame1();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame1();
				}
			}
		}
	private static void taxThemAHoles2()
		{
		System.out.println("This is a tax! You'll have to pay " + board.get(player.get(1).getPosition()).getStayValue() + ". You have $" + player.get(1).getAmountOfMoney());
		if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(1).getNumberOfProperties() == 0)
			{
			System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
			System.exit(0);
			}
		else if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(1).getNumberOfProperties() > 0)
			{
			System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
			int counter = 0;
			for (int i = 0; i <= 37; i++)
				{
				if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(1).getPosition()).getStayValue() > -1)
					{
					System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
					counter ++;
					}
				}
			if (counter == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else
				{
				Scanner userInput = new Scanner (System.in);
				int decision = userInput.nextInt();
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
				System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
				board.get(decision - 1).setOwnership("None");
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(1).getPosition()).getStayValue() + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		else 
			{
			player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getStayValue()));
			System.out.println("You have paid the fee of " + (board.get(player.get(1).getPosition()).getStayValue()) + ". You now have " + player.get(1).getAmountOfMoney());
			playGame1();
			}
		}
	private static void utilityCompany2()
		{
		if (board.get(player.get(1).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println("The " + board.get(player.get(1).getPosition()).getPropertyName() + " is owned by " + player.get(0).getName() + "!");
			System.out.println("You will have to pay a fine of " + board.get(player.get(1).getPosition()).getStayValue() + " to use these utilities.");
			if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(1).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(1).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(1).getPosition()).getStayValue() > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue());
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + board.get(player.get(1).getPosition()).getStayValue());
					System.out.println("You have paid the fee of " + board.get(player.get(1).getPosition()).getStayValue() + ". You now have " + player.get(1).getAmountOfMoney());
					playGame1();
					}
				}
			else 
				{
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue());
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + board.get(player.get(1).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(1).getPosition()).getStayValue() + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		else if (board.get(player.get(1).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println("You own this company...you get it for free!!!");
			playGame1();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(1).getPosition()).getPurchaseValue() + "? You have $" + player.get(1).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(1).getPosition()).setOwnership("Player2");
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(1).getAmountOfMoney() + " in cash.");
				playGame1();
				}
			else if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("Sorry man, you don't have the money...");
				playGame1();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame1();
				}
			}
		}
	private static void joinTheRailRoad2()
		{
		if (board.get(player.get(1).getPosition()).getOwnership().equals("Player1"))
			{
			System.out.println("The " + board.get(player.get(1).getPosition()).getPropertyName() + " is owned by " + player.get(0).getName() + "!");
			System.out.println("You will have to pay a fine of " + board.get(player.get(1).getPosition()).getStayValue() + " to ride this train.");
			if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(0).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue() < 0 && player.get(1).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - board.get(player.get(1).getPosition()).getStayValue() > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue());
					player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + board.get(player.get(1).getPosition()).getStayValue());
					System.out.println("You have paid the fee of " + board.get(player.get(1).getPosition()).getStayValue() + ". You now have " + player.get(1).getAmountOfMoney());
					playGame1();
					}
				}
			else 
				{
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getStayValue());
				player.get(0).setAmountOfMoney(player.get(0).getAmountOfMoney() + board.get(player.get(1).getPosition()).getStayValue());
				System.out.println("You have paid the fee of " + board.get(player.get(1).getPosition()).getStayValue() + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		else if (board.get(player.get(1).getPosition()).getOwnership().equals("Player2"))
			{
			System.out.println("You own this Choo-Choo...you get to ride for free!!!");
			playGame1();
			}
		else 
			{
			System.out.println("This space is unowned. Would you like to buy it for " + board.get(player.get(1).getPosition()).getPurchaseValue() + "? You have $" + player.get(1).getAmountOfMoney());
			System.out.println("1). yes");
			System.out.println("2). no");
			Scanner userInput = new Scanner (System.in);
			int decision = userInput.nextInt();
			if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) >= 0)
				{
				board.get(player.get(1).getPosition()).setOwnership("Player2");
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - board.get(player.get(1).getPosition()).getPurchaseValue());
				System.out.println("You have purchased this property! You know have " + player.get(1).getAmountOfMoney() + " in cash.");
				playGame1();
				}
			else if (decision == 1 && player.get(1).getAmountOfMoney() - (board.get(player.get(1).getPosition()).getPurchaseValue()) < 0)
				{
				System.out.println("You don't have the cash.");
				playGame1();
				}
			else 
				{
				System.out.println("Well in that case its still free to stay here...for now!");
				playGame1();
				}
			}
		}
	private static void visitingJail2()
		{
		System.out.println("Just visiting my homie in jail. Nothing to see here...");
		playGame1();
		}
	private static void freeParking2()
		{
		System.out.println("Free parking my man!!!!! Enjoy the freeness!!!");
		playGame1();
		}
	private static void jailTime2()
		{
		int bail = (int) (Math.random() * 200) + 50;
		System.out.println("You've been caught you dirty bastard. Bail is set at " + bail + ".");
		if (player.get(1).getAmountOfMoney() - bail < 0 && player.get(1).getNumberOfProperties() == 0)
			{
			System.out.println("Congrats my man. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
			System.exit(0);
			}
		else if (player.get(1).getAmountOfMoney() - bail < 0 && player.get(1).getNumberOfProperties() > 0)
			{
			System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
			int counter = 0;
			for (int i = 0; i <= 37; i++)
				{
				if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - bail > -1)
					{
					System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
					counter ++;
					}
				}
			if (counter == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else
				{
				Scanner userInput = new Scanner (System.in);
				int decision = userInput.nextInt();
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
				System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
				board.get(decision - 1).setOwnership("None");
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - bail);
				System.out.println("You have paid the fee of " + bail + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		else 
			{
			player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - bail);
			System.out.println("You have paid the bail of " + bail + ". You now have " + player.get(1).getAmountOfMoney());
			playGame1();
			}
		}
	private static void drawAChanceCard2()
		{
		System.out.println("You have landed on a Chance card. Let's hope it pans out.");
		int fate = (int) (Math.random() * 2);
		if (fate == 0)
			{
			int goodOutcome = (int) (Math.random() * 400) + 100;
			player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + goodOutcome);
			System.out.println("Hooray!!! Bank error in your favor my man! You just got paid " + goodOutcome + "! You now have a total of " + player.get(1).getAmountOfMoney());
			playGame1();
			}
		else 
			{
			int badOutcome = (int) (Math.random() * 400) + 100;
			System.out.println("Uh oh!!! An audit has revealed you owe back taxes worth upwards of " + badOutcome + ". You currently have $" + player.get(1).getAmountOfMoney() + " in the bank.");
			if (player.get(1).getAmountOfMoney() - badOutcome < 0 && player.get(1).getNumberOfProperties() == 0)
				{
				System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
				System.exit(0);
				}
			else if (player.get(1).getAmountOfMoney() - badOutcome < 0 && player.get(1).getNumberOfProperties() > 0)
				{
				System.out.println("Uh oh! Looks like you have no money...you'll have to sell one of these to get by...");
				int counter = 0;
				for (int i = 0; i <= 37; i++)
					{
					if (board.get(i).getOwnership().equals(player.get(1).getPlayerDesignation()) && (player.get(1).getAmountOfMoney() + (board.get(i).getPurchaseValue()/2)) - badOutcome > -1)
						{
						System.out.println("Space " + (i + 1) + ": " + board.get(i).getPropertyName() + " - " + (board.get(i).getPurchaseValue() / 2));
						counter ++;
						}
					}
				//haha
				if (counter == 0)
					{
					System.out.println("Darn. You're officially broke...Good job " + player.get(0).getName() + "! You win!!!");
					System.exit(0);
					}
				else
					{
					Scanner userInput = new Scanner (System.in);
					int decision = userInput.nextInt();
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + (board.get(decision-1).getPurchaseValue() / 2));
					System.out.println("Decided to sell " + board.get(decision - 1).getPropertyName() + ". You now have " + player.get(1).getAmountOfMoney());
					board.get(decision - 1).setOwnership("None");
					player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - badOutcome);
					System.out.println("You have paid the fee of " + badOutcome + ". You now have " + player.get(1).getAmountOfMoney());
					playGame1();
					}
				}
			else 
				{
				player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() - badOutcome);
				System.out.println("You have paid the fee of " + badOutcome + ". You now have " + player.get(1).getAmountOfMoney());
				playGame1();
				}
			}
		}
	private static void collect2002()
		{
		player.get(1).setAmountOfMoney(player.get(1).getAmountOfMoney() + 200);
		System.out.println("You have passed go and collected 200. Your net cash value is" + player.get(1).getAmountOfMoney());
		}
	}
