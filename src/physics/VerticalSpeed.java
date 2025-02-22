package physics;

public class VerticalSpeed {

  private static final float MAX_VERTICAL_SPEED = 30.0f;
  private static final float MIN_VERTICAL_SPEED = -30.0f;

  private final Diver diver;
  private final AmbientPressureProvider ambientPressureProvider;
  private float currentVerticalSpeed;

  public VerticalSpeed(Diver diver, AmbientPressureProvider ambientPressureProvider) {
    this.ambientPressureProvider = ambientPressureProvider;
    this.currentVerticalSpeed = 0.0f;
    this.diver = diver;
  }

  public float getCurrentVerticalSpeed() {
    return this.currentVerticalSpeed;
  }

  public float updateAndGetCurrentVerticalSpeed(float deltaTime) {
    float currentBuoyancy = diver.getCurrentBuoyancy(ambientPressureProvider.get());
    currentVerticalSpeed += currentBuoyancy * deltaTime;
    currentVerticalSpeed = validateVerticalSpeed(currentVerticalSpeed);
    return currentVerticalSpeed;
  }

  private float validateVerticalSpeed(float speed) {
    if (speed < MIN_VERTICAL_SPEED) {
      return MIN_VERTICAL_SPEED;
    } else if (speed > MAX_VERTICAL_SPEED) {
      return MAX_VERTICAL_SPEED;
    }
    return speed;
  }

}
