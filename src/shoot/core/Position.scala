package shoot.core

/**
  * Created by c0115114 on 2016/07/13.
  */
class Position (var xPos: Int, var yPos: Int){
  def this(position: Position){
    this(position.x, position.y)
  }

  def x: Int = {
    xPos
  }

  def y: Int = {
    yPos
  }

  def set(xPos: Int, yPos: Int): Unit ={
    this.xPos = xPos
    this.yPos = yPos
  }

  def set(pos: Position): Unit ={
    this.set(pos.x, pos.y)
  }

  override def toString: String = {
    s"x=$x, y=$y"
  }
}
