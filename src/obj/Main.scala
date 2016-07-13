package obj

import processing.core.PApplet
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
  }

  override def draw(): Unit ={
  }

  override def runSketch(): Unit ={
    super.runSketch()
  }
}
