package exhibition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ExhibitionServiceTest {

  /*
   * De ExhibitionService loopt door een lijst van Insurable objecten en berekent hoeveel
   * beveiliging er nodig is voor de expositie, wat de kosten daar van zijn, en brengt
   * de juiste afdelingen op de hoogte.
   *
   * Vervolgens doet het de totale verzekeringswaarde van alle insurable expositie objecten berekenen.
   */

  // ik heb de oplossing en de uitleg hiervoor in de ExhibitionService class gezet

  @Test
  void testExhibitionService() {
    List<Insurable> exhibitions = new ArrayList<>(List.of(
      new ModernPainting("The Starry Night", "Vincent van Gogh", 100000, "Post-Impressionism"),
      new ModernPainting("The Persistence of Memory", "Salvador Dalí", 80000, "Surrealism"),
      new ModernPainting("Les Demoiselles d'Avignon", "Pablo Picasso", 75000, "Cubism"),
      new ModernPainting("Guernica", "Pablo Picasso", 90000, "Cubism"),
      new ModernPainting("The Scream", "Edvard Munch", 85000, "Expressionism"),
      new ModernPainting("Composition VII", "Wassily Kandinsky", 70000, "Abstract Art"),
      new ModernPainting("Impression, Sunrise", "Claude Monet", 65000, "Impressionism"),
      new ModernPainting("The Night Watch", "Rembrandt", 95000, "Baroque"),
      new ModernPainting("The Kiss", "Gustav Klimt", 60000, "Symbolism"),
      new ModernPainting("The Son of Man", "René Magritte", 55000, "Surrealism"),
      new Painting("Mona Lisa", "Leonardo da Vinci", 100000),
      new Painting("The Last Supper", "Leonardo da Vinci", 80000),
      new Painting("The Creation of Adam", "Michelangelo", 75000),
      new Painting("The Birth of Venus", "Sandro Botticelli", 90000),
      new Painting("Girl with a Pearl Earring", "Johannes Vermeer", 85000),
      new Painting("The Arnolfini Portrait", "Jan van Eyck", 70000),
      new Painting("American Gothic", "Grant Wood", 60000),
      new Painting("The Night Watch", "Rembrandt", 60000),
      new Painting("Las Meninas", "Diego Velázquez", 55000),
      new Painting("The School of Athens", "Raphael", 50000)
    ));

    ExhibitionService exhibitionService = new ExhibitionService();
    exhibitionService.addExhibitions(exhibitions);

    assertEquals(22, exhibitionService.getNumberOfSecurityGuards());
    assertEquals(26400, exhibitionService.getSecurityCosts());
    assertEquals(1500000, exhibitionService.getTotalInsuranceValue());
  }

}