package listandstrings.holder;

import java.util.List;
import java.util.ArrayList;
import listandstrings.model.Donut; //Must import the donut model so we can put it in a list.
import listandstrings.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>(); //this is how to initialize the list for donut.
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
		for(int index = 0; index < donutList.size(); index += 1)
		{
			display.displayText(donutList.get(index));
		}
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
