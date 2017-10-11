package useful.controller;

import java.util.List;
import java.util.ArrayList;

import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList;
	private PopupDisplay display;

	public ListController()
	{
		donutList = new ArrayList<Donut>(); // this is how to initialize the list for donut.
		display = new PopupDisplay();
	}

	public void start()
	{
		Donut temp = new Donut();
		donutList.add(new Donut()); // Added a new donut into the list.
		fillTheList();
		// showTheList();
		changeTheList();
	}

	private void showTheList()
	{
		String favorite = "chocolate and more chocolate";
		for (int index = 0; index < donutList.size(); index += 1)
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

	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);

		display.displayText("The list is still contains: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");

		display.displayText("The list is this big: " + donutList.size());

	}

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		
		return display;
	}

}
