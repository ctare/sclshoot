package shoot.core

import java.util

/**
  * Created by c0115114 on 2016/07/13.
  */
class Layer[T <: Obj] extends util.ArrayList[T]{
  def update(): Unit ={
    val itr: util.Iterator[T] = this.iterator
    while(itr.hasNext) if(itr.next().update()) itr.remove()
  }
}
