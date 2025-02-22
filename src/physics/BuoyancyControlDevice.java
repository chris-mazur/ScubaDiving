package physics;

public class BuoyancyControlDevice {

  private final float inflationRateSeaLevel = 10.5f; // 0.5-1.5 typically

  private float minVolume = 3f;
  private float maxVolume = 10f;

  private float currentVolume ;

  public BuoyancyControlDevice(float currentVolume) {
    this.currentVolume = currentVolume;
  }

  public float getCurrentVolume(float ambientPressure) {
    return currentVolume / ambientPressure;
  }

  public void inflate(float durationOfInflationInSeconds, float ambientPressure) {
    this.currentVolume = this.currentVolume + durationOfInflationInSeconds * inflationRateSeaLevel * ambientPressure;
    System.err.println("Inflate Volume " + currentVolume);
  }

  public void deflate(float durationOfInflationInSeconds, float ambientPressure) {
    this.currentVolume = this.currentVolume - durationOfInflationInSeconds * inflationRateSeaLevel * ambientPressure;
    System.err.println("Deflate Volume " + currentVolume);
  }
}
