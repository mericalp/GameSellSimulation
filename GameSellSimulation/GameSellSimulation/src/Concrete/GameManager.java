package Concrete;

import Abstract.Game;
import Abstract.GameService;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game) {
		System.out.println("We have sold the "+game.getname()+"\nPrice : "+game.getPrice());
		
	}

	@Override
	public void addGame(Game game) {
		System.out.println(game.getId() + " " + game.getname() + " " + game.getPrice()+ "\nIt has been added to the cataloge.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getname()+"'s infos has been updated.");
		
	}

}
