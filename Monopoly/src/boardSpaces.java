
public class boardSpaces
	{
	private String propertyName;
	private String ownership;
	private String boardFillerPlayer1;
	private String boardFillerPlayer2;
	private int purchaseValue;
	private int stayValue;
	private int numberOfHouses;
	private int valueOfHouses;
	private int numberOfHotels;
	private int valueOfHotels;
	
	public boardSpaces (String pn, String o, String bf1, String bf2, int pv, int sv, int nhou, int vhou, int nhot, int vhot)
		{
		propertyName = pn;
		ownership = o;
		boardFillerPlayer1 = bf1;
		boardFillerPlayer2 = bf2;
		purchaseValue = pv;
		stayValue = sv;
		numberOfHouses = nhou;
		valueOfHouses = vhou;
		numberOfHotels = nhot;
		valueOfHotels = vhot;
		}

	public String getPropertyName()
		{
		return propertyName;
		}

	public void setPropertyName(String propertyName)
		{
		this.propertyName = propertyName;
		}

	public String getOwnership()
		{
		return ownership;
		}

	public void setOwnership(String ownership)
		{
		this.ownership = ownership;
		}

	public String getBoardFillerPlayer1()
		{
		return boardFillerPlayer1;
		}

	public void setBoardFillerPlayer1(String boardFillerPlayer1)
		{
		this.boardFillerPlayer1 = boardFillerPlayer1;
		}

	public String getBoardFillerPlayer2()
		{
		return boardFillerPlayer2;
		}

	public void setBoardFillerPlayer2(String boardFillerPlayer2)
		{
		this.boardFillerPlayer2 = boardFillerPlayer2;
		}

	public int getPurchaseValue()
		{
		return purchaseValue;
		}

	public void setPurchaseValue(int purchaseValue)
		{
		this.purchaseValue = purchaseValue;
		}

	public int getStayValue()
		{
		return stayValue;
		}

	public void setStayValue(int stayValue)
		{
		this.stayValue = stayValue;
		}

	public int getNumberOfHouses()
		{
		return numberOfHouses;
		}

	public void setNumberOfHouses(int numberOfHouses)
		{
		this.numberOfHouses = numberOfHouses;
		}

	public int getValueOfHouses()
		{
		return valueOfHouses;
		}

	public void setValueOfHouses(int valueOfHouses)
		{
		this.valueOfHouses = valueOfHouses;
		}

	public int getNumberOfHotels()
		{
		return numberOfHotels;
		}

	public void setNumberOfHotels(int numberOfHotels)
		{
		this.numberOfHotels = numberOfHotels;
		}

	public int getValueOfHotels()
		{
		return valueOfHotels;
		}

	public void setValueOfHotels(int valueOfHotels)
		{
		this.valueOfHotels = valueOfHotels;
		}
	}