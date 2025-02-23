package physics;

public class BuoyancyControlDevice {

  private static final float INFLATION_RATE_SEA_LEVEL = 10.0f; // 0.5-1.5 typically
  private static final float MIN_VOLUME = 0.0f;
  private static final float MAX_VOLUME = 80.0f;

  private final AmbientPressureProvider ambientPressureProvider;
  private float currentVolume;

  public BuoyancyControlDevice(
    AmbientPressureProvider ambientPressureProvider,
    float currentVolume) {
    this.ambientPressureProvider = ambientPressureProvider;
    this.currentVolume = currentVolume;
  }

  public float getCurrentVolume(float ambientPressure) {
    return currentVolume / ambientPressure;
  }

  public void inflate(float durationOfInflationInSeconds) {
    updateVolume(durationOfInflationInSeconds, true);
  }

  public void deflate(float durationOfInflationInSeconds) {
    updateVolume(durationOfInflationInSeconds, false);
  }

  private void updateVolume(float durationOfInflationInSeconds, boolean isInflating) {
    float volumeChange = durationOfInflationInSeconds * INFLATION_RATE_SEA_LEVEL * ambientPressureProvider.get();
    if (isInflating) {
      float updatedVolume = this.currentVolume + volumeChange;
      this.currentVolume = Math.min(updatedVolume, MAX_VOLUME);
    } else {
      float updatedVolume = this.currentVolume - volumeChange;
      this.currentVolume = Math.max(updatedVolume, MIN_VOLUME);
    }
  }
}
