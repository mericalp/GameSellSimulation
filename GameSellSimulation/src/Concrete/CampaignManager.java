package Concrete;
import java.util.Scanner;
import Abstract.Campaign;
import Abstract.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName()+" is added as a campaign.\nCampaign number : "+campaign.getId()+"\nDiscount percent : "+campaign.getDiscount());
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println(campaign.getName()+" is named campaign has been deleted");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		campaign.setName(name);
		scanner.close();
		System.out.println("Campaign name has been updated : "+campaign.getName());
	
	
	}

	
	
}

		
	
	


