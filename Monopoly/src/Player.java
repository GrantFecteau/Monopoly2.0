
public class Player
	{
	private String name;
	private String playerDesignation;
	private int amountOfMoney;
	private int numberOfProperties;
	private int position;
	
	public Player (String n, String pd, int am, int np, int p)
		{
		name = n;
		playerDesignation = pd;
		amountOfMoney = am;
		numberOfProperties = np;
		position = p;
		}

	public int getPosition()
		{
		return position;
		}

	public void setPosition(int position)
		{
		this.position = position;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getPlayerDesignation()
		{
		return playerDesignation;
		}

	public void setPlayerDesignation(String playerDesignation)
		{
		this.playerDesignation = playerDesignation;
		}

	public int getAmountOfMoney()
		{
		return amountOfMoney;
		}

	public void setAmountOfMoney(int amountOfMoney)
		{
		this.amountOfMoney = amountOfMoney;
		}

	public int getNumberOfProperties()
		{
		return numberOfProperties;
		}

	public void setNumberOfProperties(int numberOfProperties)
		{
		this.numberOfProperties = numberOfProperties;
		}
	}
