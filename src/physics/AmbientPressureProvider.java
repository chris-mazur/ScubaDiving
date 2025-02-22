package physics;

public class AmbientPressureProvider {

  private float ambientPressure; // Height of water above the diver

  public AmbientPressureProvider() {
    this.ambientPressure = 0.0f;
  }

  public float get() {
    return this.ambientPressure;
  }

  public void update(float yDiver) {
    this.ambientPressure = yDiver / 100 + 1; // plus atmospheric pressure
  }
}
