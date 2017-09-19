import processing.core.PApplet

class ProcessingMain : PApplet(){
    override fun settings() {
        size(1440, 900)
    }

    override fun setup() {
        background(0)
    }

    override fun draw() {
        fill(255)
        noStroke()
        ellipse(100.0f,100.0f,100.0f,100.0f)
    }

    fun run(args: Array<String>) : Unit = PApplet.main("ProcessingMain")
}

fun main(args: Array<String>) : Unit = ProcessingMain().run(args)