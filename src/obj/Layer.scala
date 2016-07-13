package obj

import java.util
/**
  * Created by c0115114 on 2016/07/13.
  */
class Layer {
  val objs: util.ArrayList[Obj] = new util.ArrayList()

  def update(): Unit ={
    val itr: util.Iterator[Obj] = objs.iterator
    while(itr.hasNext) if(itr.next().update()) itr.remove()
  }

  final def add(obj: Obj): Unit = {
    objs.add(obj)
  }
}
