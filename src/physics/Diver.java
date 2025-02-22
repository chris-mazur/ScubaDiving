package physics;

public class Diver {

  private static final float WEIGHT_DISPLACED_WATER_KG = 80.0f;
  private static final float WEIGHT_DIVER_KG = 78.0f;
  private static final float BALLAST_WEIGHT = 10.0f;
  private final BuoyancyControlDevice  buoyancyControlDevice;

  public Diver(AmbientPressureProvider ambientPressureProvider, float currentBcdDisplacement) {
    this.buoyancyControlDevice = new BuoyancyControlDevice(ambientPressureProvider, currentBcdDisplacement);
  }

  public float getCurrentBuoyancy(float ambientPressure) {
    return getPositiveBuoyancy(ambientPressure) - getNegativeBuoyancy();
  }

  public BuoyancyControlDevice getBuoyancyControlDevice() {
    return buoyancyControlDevice;
  }

  public float getPositiveBuoyancy(float ambientPressure) {
    return WEIGHT_DISPLACED_WATER_KG + buoyancyControlDevice.getCurrentVolume(ambientPressure);
  }

  public float getNegativeBuoyancy() {
    return WEIGHT_DIVER_KG + BALLAST_WEIGHT;
  }
}
