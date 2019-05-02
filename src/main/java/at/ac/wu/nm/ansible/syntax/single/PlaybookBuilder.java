package at.ac.wu.nm.ansible.syntax.single;
import at.ac.wu.nm.ansible.model.Playbook;
import at.ac.wu.nm.ansible.model.Play;
import at.ac.wu.nm.ansible.model.Task;

/*// single //*/
public class PlaybookBuilder {
  private Playbook book;
  
  /* context variable */
  private Play currentPlay;

  public static PlaybookBuilder Playbook() {
    return new PlaybookBuilder();
  }

  public PlaybookBuilder() {
    /* eager construction */
    book = new Playbook();
  }

  public PlaybookBuilder play() {
    /* eager construction */
    currentPlay = new Play();
    book.add(currentPlay);
    return this;
  }

  public PlaybookBuilder task(String name) {
    if (currentPlay != null) {
      currentPlay.add(new Task(name));
    }
    return this;
  }
  
  public PlaybookBuilder task() {
    return task("");
  }

  public Playbook get() {
    return book;
  }
}
/*// end //*/