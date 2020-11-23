package state;

import java.util.ArrayList;

public class NintendoState {
	private GameConsole gameConsole;
	private ArrayList<String> Games;
	public void pressHomeButton()
	{
		System.out.println("Display Home Screen");
	}
	public void pressNintendoButton()
	{
		System.out.println("You are already viewing nintendo");
	}
	public void pressXboxButton()
	{
		System.out.println("Starting Xbox");
	}
	public void pressGameButton()
	{
		for(int i = 0; i < 6;i++)
		{
			System.out.println(Games);
		}
		
	}
}
