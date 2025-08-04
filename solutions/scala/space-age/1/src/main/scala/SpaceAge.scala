object SpaceAge {
  private val earth: Int = 31557600

  def onEarth(age: Double): Double =
    age / earth

  def onVenus(age: Double): Double =
    age / (0.61519726 * earth)

  def onMercury(age: Double): Double =
    age / (0.2408467 * earth)

  def onMars(age: Double): Double =
    age / (1.8808158 * earth)

  def onJupiter(age: Double): Double =
    age / (11.862615 * earth)

  def onSaturn(age: Double): Double =
    age / (29.447498 * earth)

  def onUranus(age: Double): Double =
    age / (84.016846 * earth)

  def onNeptune(age: Double): Double =
    age / (164.79132 * earth)
}
