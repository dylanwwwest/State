package state;

public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	public GameConsole()
	{
		System.out.println("STarting up game console");
	}
	public void pressHomeButton()
	{
		 pressHomeButton();
	}
	public void pressNintendoButton()
	{
	pressNintendoButton();
	}
	public void pressXboxButton()
	{
		pressXboxButton();
	}
	public void pressGameButton()
	{
		pressGameButton();
	}
	public void setState(State state)
	{
		
	}
	public State getHomeState()
	{
		System.out.println(HomeState);
		return HomeState;
		
	}
	public State getNintendoState()
	{
		System.out.println(NintendoState);
		return NintendoState;
		
	}
	public State getXBoxState()
	{
		System.out.println(xBoxState);
		return xBoxState;
		
	}
}
