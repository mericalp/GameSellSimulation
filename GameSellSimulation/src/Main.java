import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("51513513","Talha","Balcı","1995");
		UserManager userManager = new UserManager();
		userManager.signIn(user);
		userManager.updateAccount(user);
		userManager.deleteAccount(user);
		
		Campaign campaign = new Campaign("YeniYıl",15,1);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		
		
		Game game = new Game(1,"Resident Evil 3",40);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		gameManager.update(game);
		gameManager.sellGame(game);
		
		Sale sale = new Sale(1,"Kredi Kartı","2021");
		SaleManager saleManager = new SaleManager();
		saleManager.selling(user, game, campaign, sale);	

	}

}
