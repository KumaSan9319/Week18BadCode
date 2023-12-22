package librarysystem;

import java.time.LocalDate;

public class Book extends LibraryItem {

  private final String author;

  protected Book(String newTitle, String newAuthor, LocalDate newPublicationDate) {
    super(newTitle, newPublicationDate);
    author = newAuthor;
  }

  /**
   * @return overview item text for book
   */
  public String getOverviewItemText(){
    return super.getOverviewItemText() + " by " + author;
  }

}
