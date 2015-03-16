package ch.heigvd.res.lab00;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * @author Olivier Liechti
 */
public class Steps {

  List<IInstrument> orchestra;
  String music;

  @Given("^there is an orchestra available$")
  public void there_is_an_orchestra_available() throws Throwable {
    orchestra = new ArrayList<IInstrument>();
    orchestra.add(new Flute());
    orchestra.add(new Trumpet());
  }

  @When("^I ask them to play$")
  public void i_ask_them_to_play() throws Throwable {
    StringBuilder music = new StringBuilder();
    for (IInstrument instrument : orchestra) {
      music.append(instrument.play());
    }
    this.music = music.toString();
  }

  @Then("^I hear some music$")
  public void i_hear_some_music() throws Throwable {
    assertNotNull(music);
    assertNotEquals("", music);
  }


}
