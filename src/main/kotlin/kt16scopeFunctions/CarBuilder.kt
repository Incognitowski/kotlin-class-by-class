package kt16scopeFunctions

class CarBuilder {

    private var wheelSize: Int? = null
    private var color: String? = null
    private var horsePower: Double? = null
    private var doors: Int? = null
    private var hasHeatedSeats: Boolean? = null
    private var directionType: DirectionType? = null
    private var transmissionType: TransmissionType? = null

    fun wheelSize(wheelSize: Int) {
        this.wheelSize = wheelSize
    }

    fun color(color: String) {
        this.color = color
    }

    fun horsePower(horsePower: Double) {
        this.horsePower = horsePower
    }

    fun doors(doors: Int) {
        this.doors = doors
    }

    fun hasHeatedSeats(hasHeatedSeats: Boolean) {
        this.hasHeatedSeats = hasHeatedSeats
    }

    fun directionType(directionType: DirectionType) {
        this.directionType = directionType
    }

    fun transmissionType(transmissionType: TransmissionType) {
        this.transmissionType = transmissionType
    }

    fun build(): Car {
        return Car(
            wheelSize ?: 18,
            color ?: "Blue",
            horsePower ?: 120.0,
            doors ?: 4,
            hasHeatedSeats ?: false,
            directionType ?: DirectionType.HYDRAULIC,
            transmissionType ?: TransmissionType.MANUAL,
        )
    }

}