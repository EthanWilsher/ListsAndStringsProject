package listandstrings.holder;

import java.util.List;
import java.util.ArrayList;
import listandstrings.model.Bagel;
import listandstrings.view.PopupDisplay;

public class BagelController
{
	private List<bagel> bagelList;
	private PopupDisplay display;
	
	private BagelController()
	{
		bagelList = new ArrayList<donut>();
		display = new PopupDisplay();
		
	}
	
	public void start()
	{
		Bagel temp = new Bagel();
		bagelList.add(new Bagel());
		fillTheList();
		changeTheList();
	}
	
	
	private void fillTheList()
	{
		Bagel bagelSandwich = new Bagel("Meat and cream sandwich");
		
		
		bagelList.add(bagelSandwich);
	}
	
	private void changeTheList()
	{
		
	}
	
	
	
	
	
	
	
}
