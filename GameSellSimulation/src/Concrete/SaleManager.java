package Concrete;

import Abstract.Campaign;
import Abstract.Game;
import Abstract.Sale;
import Abstract.SaleService;
import Abstract.User;

public class SaleManager implements SaleService {

	@Override
	public void selling(User user, Game game, Campaign campaign, Sale sale) {
		/System.out.println(user.getName()+" has bought the "+game.getname() +" with the "+ campaign.getName()+" campaign.");
		System.out.println("Total price : "+ game.getPrice());
		System.out.println("After the discount : "+(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100)));
		
	}
	
}

		
	}

	
	
}
