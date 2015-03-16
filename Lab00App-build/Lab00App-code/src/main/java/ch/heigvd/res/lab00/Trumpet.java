package ch.heigvd.res.lab00;

/**
 *
 * @author Olivier Liechti
 */
public class Trumpet implements IInstrument {

  @Override
  public String play() {
    return "pouet";
  }

  @Override
  public int getSoundVolume() {
    return 1000;
  }

  @Override
  public String getColor() {
    return "golden";
  }

}
