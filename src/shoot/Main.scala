package shoot

import processing.core.PApplet
import shoot.core.{Layer, Obj}
/**
  * Created by c0115114 on 2016/07/13.
  */
object Main extends PApplet{
  def main(args: Array[String]): Unit = {
    this.runSketch()
    this.surface.setTitle("Test app")
  }

  override def settings(): Unit = {
    size(500, 500)
  }

  override def setup(): Unit ={
    background(255)
    val layer: Layer[Obj] = new Layer()
    layer.add(new Obj{
      override def update(): Boolean = {
        println("ok")
        isDone()
      }
    })

    layer.update()
  }

  override def draw(): Unit ={
    exit()
  }

  override def runSketch(): Unit ={
    super.runSketch()
  }
}
