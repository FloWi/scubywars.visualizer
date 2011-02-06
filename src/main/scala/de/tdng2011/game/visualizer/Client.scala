package de.tdng2011.game.visualizer

import de.tdng2011.game.library.connection.{RelationTypes, AbstractClient}

class Client(hostname : String) extends AbstractClient(hostname, RelationTypes.Visualizer) {

  Visualizer.start

  def processFrame(frame : List[Any]) {
    Visualizer !! frame
  }
}
object Client {
  def main(args : Array[String]){
    new Client("remote.coding4coffee.org")
  }
}
