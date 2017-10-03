package listandstrings.model;

public class Donut
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holeCount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
	}
	
	public String toString()
	{
		String description = "this donut is a " + flavor + "donut";
		
		return description;
	}
	
	public Donut(boolean isGlazed, boolean hasSprinkles)
	{
		this();
		this.isGlazed = true;
		this.hasSprinkles = true;
	}
	
	public Donut(String shape, String flavor, int holeCount)
	{
		this();
		this.shape = shape;
		this.flavor = flavor;
		this.holeCount = holeCount;
	}
	
}
