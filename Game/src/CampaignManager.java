
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println("Campaign Added : " + campaign.getName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Campaign Updated : " + campaign.getName());
	}
	
	public void delete(Campaign campaign) {
		System.out.println("Campaign Deleted : " + campaign.getName());
	}

}
