package shoot.core

/**
  * Created by c0115114 on 2016/07/13.
  */
trait Obj {
  private var done = false
  def update(): Boolean

  def kill(): Unit ={
    done = true
  }

  final def isDone(): Boolean = {
    done
  }
}
