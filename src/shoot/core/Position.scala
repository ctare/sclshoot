package shoot.core

/**
  * Created by c0115114 on 2016/07/13.
  */
class Position (xPos: Int, yPos: Int){
  def x: Int = {
    xPos
  }

  def y: Int = {
    yPos
  }

  override def toString: String = {
    s"x=$x, y=$y"
  }
}
