package auctionsite;

public class AuctionItem {

  private final String name;
  private final String description;
  private final int startingPrice;

  public AuctionItem(String name, String description, int startingPrice) {
    this.name = name;
    this.description = description;
    this.startingPrice = startingPrice;
  }

  public String getListing() {
    return name + " - " + description + " - " + startingPrice;
  }

}
