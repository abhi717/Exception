package exception;
abstract class Game
	{
public abstract void play();
	}
class Football extends Game
{
	public void play()
	{
	 System.out.println("in football game class");
	}	
}
class Cricket extends Game
{
	public void play()
	{
		System.out.println("in Cricket  game class");	
	}
}
class Tennis extends Game
{
	public void play()
	{
	 System.out.println("in tennis game class");
	}	
}
public class GamesDemo 
{
	public static void main(String args[])
	{
	Game ref[]=new Game[3];
	ref [0]= new Football();
	ref [1]= new Cricket();
	ref [2]= new Tennis();
	for(int i=0;i<ref.length;i++)
	{
		if(ref[i] instanceof Cricket)
		{
			ref[i].play();
		}		
	}
	
	}

}
