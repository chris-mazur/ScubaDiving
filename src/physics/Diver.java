package physics;

public class Diver {

  private final float weightDisplacedWaterKg = 80.0f;
  private final float weightDiverKg = 78.0f;
  private final BuoyancyControlDevice  buoyancyControlDevice;
  private final float ballastWeight = 10.0f;

  public Diver(float currentBcdDisplacement) {
    this.buoyancyControlDevice = new BuoyancyControlDevice(currentBcdDisplacement);
  }

  public float getCurrentBuoyancy(float ambientPressure) {
    System.err.println("Positive " + getPositiveBuoyancy(ambientPressure) + " negative " + getNegativeBuoyancy());
    return getPositiveBuoyancy(ambientPressure) - getNegativeBuoyancy();
  }

  public BuoyancyControlDevice getBuoyancyControlDevice() {
    return buoyancyControlDevice;
  }

  public float getPositiveBuoyancy(float ambientPressure) {
    System.err.println("Weight displaced " + weightDisplacedWaterKg + "Current volume " + buoyancyControlDevice.getCurrentVolume(ambientPressure));
    return weightDisplacedWaterKg + buoyancyControlDevice.getCurrentVolume(ambientPressure);
  }

  public float getNegativeBuoyancy() {
    return weightDiverKg + ballastWeight;
  }
}
