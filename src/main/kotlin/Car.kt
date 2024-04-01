class Car{
    var color : String = ""
    var speed : Int = 0

    companion object{
        var carCount : Int =200
        const val MAXSPEED  :Int = 200
        const val MINSPEED : Int = 0
        fun currentCarCount() : Int {
            return carCount
        }
    }

    constructor(color : String, speed : Int){
        this.color = color
        this.speed = speed
        carCount ++
    }

    constructor(speed: Int){
        this.speed = speed
    }
    constructor(){

    }

    fun upSpeed(value: Int){
        if(speed+value>= 200)
            speed=200
        else
            speed = speed + value
    }
    fun downSpeed(value: Int){
        if(speed-value<=0)
            speed=0
        else
            speed=speed-value
    }



}