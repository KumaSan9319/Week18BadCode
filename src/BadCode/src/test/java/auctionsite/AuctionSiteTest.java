package auctionsite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuctionSiteTest {

  /*
   * Als je de onderstaande code uncomment, krijg je een foutmelding.
   *
   * Waardoor komt de foutmelding? Vindt het probleem en los hem op.
   */
  @Test
  void testListing(){
    // De fix die ik heb toegepast is het veranderen van de reference type van AuctionItem naar
    // Painting. De test kon de Painting versie van getListing() niet herkennen omdat alleen de
    // AuctionItem versie zichtbaar was voor java. Nu dat de reference type Painting is kun je
    // gewoon methods uit Painting en AuctionItem gebruiken. Om dit zeker te weten heb ik daar
    // een test voor toegevoegd.
    Painting painting = new Painting("De Nachtwacht", "Een schilderij van Rembrandt",
        1000000, "Rembrandt", "Barok");

    assertEquals("De Nachtwacht - Een schilderij van Rembrandt - 1000000 - Rembrandt - Barok - 05-12-2023",
        painting.getListing("05-12-2023"));
    assertEquals("De Nachtwacht - Een schilderij van Rembrandt - 1000000", painting.getListing());

  }

}
