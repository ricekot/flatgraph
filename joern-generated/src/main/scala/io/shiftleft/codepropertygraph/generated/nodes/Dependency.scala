package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.Language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}

trait DependencyEMT extends AnyRef with HasDependencyGroupIdEMT with HasNameEMT with HasVersionEMT

trait DependencyBase extends AbstractNode with StaticType[DependencyEMT] {

  override def propertiesMap: java.util.Map[String, Any] = {
    import io.shiftleft.codepropertygraph.generated.accessors.Lang.*
    val res = new java.util.HashMap[String, Any]()
    this.dependencyGroupId.foreach { p => res.put("DEPENDENCY_GROUP_ID", p) }
    res.put("NAME", this.name)
    res.put("VERSION", this.version)
    res
  }
}

object Dependency {
  val Label = "DEPENDENCY"
  object PropertyNames {
    val DependencyGroupId = io.shiftleft.codepropertygraph.generated.PropertyNames.DEPENDENCY_GROUP_ID
    val Name = io.shiftleft.codepropertygraph.generated.PropertyNames.NAME
    val Version = io.shiftleft.codepropertygraph.generated.PropertyNames.VERSION
  }
  object PropertyDefaults {
    val Name = "<empty>"
    val Version = "<empty>"
  }
}

class Dependency(graph_4762: flatgraph.Graph, seq_4762: Int)
    extends StoredNode(graph_4762, 12.toShort, seq_4762)
    with DependencyBase
    with StaticType[DependencyEMT] {

  override def productElementName(n: Int): String =
    n match {
      case 0 => "dependencyGroupId"
      case 1 => "name"
      case 2 => "version"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.dependencyGroupId
      case 1 => this.name
      case 2 => this.version
      case _ => null
    }

  override def productPrefix = "Dependency"
  override def productArity = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Dependency]
}

object NewDependency {
  def apply(): NewDependency = new NewDependency
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]] = Map("IMPORTS" -> Set("IMPORT"))
}
class NewDependency extends NewNode(12.toShort) with DependencyBase {
  override type StoredNodeType = Dependency
  override def label: String = "DEPENDENCY"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewDependency.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewDependency.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var dependencyGroupId: Option[String] = None
  var name: String = "<empty>": String
  var version: String = "<empty>": String
  def dependencyGroupId(value: Option[String]): this.type = { this.dependencyGroupId = value; this }
  def dependencyGroupId(value: String): this.type = { this.dependencyGroupId = Option(value); this }
  def name(value: String): this.type = { this.name = value; this }
  def version(value: String): this.type = { this.version = value; this }
  override def flattenProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
    if (dependencyGroupId.nonEmpty) interface.insertProperty(this, 16, this.dependencyGroupId)
    interface.insertProperty(this, 39, Iterator(this.name))
    interface.insertProperty(this, 54, Iterator(this.version))
  }

  override def copy(): this.type = {
    val newInstance = new NewDependency
    newInstance.dependencyGroupId = this.dependencyGroupId
    newInstance.name = this.name
    newInstance.version = this.version
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "dependencyGroupId"
      case 1 => "name"
      case 2 => "version"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.dependencyGroupId
      case 1 => this.name
      case 2 => this.version
      case _ => null
    }

  override def productPrefix = "NewDependency"
  override def productArity = 3
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewDependency]
}