
public class Peice
	{
	private String type;
	private int startingValue;
	
	public Peice (String t, int s)
		{
		type = t;
		startingValue = s;
		}

	public String getType()
		{
		return type;
		}

	public void setType(String type)
		{
		this.type = type;
		}

	public int getStartingValue()
		{
		return startingValue;
		}

	public void setStartingValue(int startingValue)
		{
		this.startingValue = startingValue;
		}
	}


