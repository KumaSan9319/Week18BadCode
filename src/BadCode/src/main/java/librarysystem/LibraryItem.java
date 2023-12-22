package librarysystem;

import java.time.LocalDate;

public abstract class LibraryItem {

  private final String title;
  private final LocalDate publicationDate;

  protected LibraryItem(String newTitle, LocalDate newPublicationDate) {
    title = newTitle;
    publicationDate = newPublicationDate;
  }

  /**
   * @return overview item text for library item
   */
  public String getOverviewItemText(){
    return title + " (" + publicationDate + ")";
  }

}
