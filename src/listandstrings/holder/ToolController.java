package listandstrings.holder;

import java.util.List;
import java.util.ArrayList;
import listandstrings.model.Donut; //Must import the donut model so we can put it in a list.
import listandstrings.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>(); //this is how to initialize the list for donut.
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		donutList.add(new Donut()); //Added a new donut into the list.
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "chocolate and more chocolate";
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("MMMMMM My favorite");
				}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index));
		    
			}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut glazedSprinkles = new Donut("Glazed and Sprinkles");
		Donut chocolate = new Donut("Chocolate");
		Donut mapleBar = new Donut("Rectangle, Maple, 0");
		
		donutList.add(jellyFilled);
		donutList.add(glazedSprinkles);
		donutList.add(chocolate);
		donutList.add(mapleBar);
		
		
	}

}
