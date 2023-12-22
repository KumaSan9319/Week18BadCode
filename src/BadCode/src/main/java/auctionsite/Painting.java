package auctionsite;

public class Painting extends AuctionItem {

  private final String artist;
  private final String style;

  public Painting(String name, String description, int startingPrice, String artist, String style) {
    super(name, description, startingPrice);
    this.artist = artist;
    this.style = style;
  }

  public String getListing(String date) {
    return super.getListing() + " - " + artist + " - " + style + " - " + date;
  }
}