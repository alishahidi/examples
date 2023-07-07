package objects;

public enum Colors {
  Black(0, 0, 0),
  Blue(0, 0, 1),
  Green(0, 1, 0),
  Cyan(0, 1, 1),
  Red(1, 0, 0),
  Magenta(1, 0, 1),
  Yellow(1, 1, 0),
  White(1, 1, 1);

  public float R, G, B;

  Colors(float r, float g, float b) {
    this.R = r;
    this.G = g;
    this.B = b;
  }

    @Override
  public String toString() {
    return "rgb(" + R + ", " + G + ", " + B + ")";
  }
}
