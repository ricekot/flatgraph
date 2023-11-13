package io.shiftleft.codepropertygraph.generated.v2.nodes

import io.joern.odb2
import io.shiftleft.codepropertygraph.generated.v2.Language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}

trait DependencyEMT extends AnyRef with HasDependencyGroupIdEMT with HasNameEMT with HasVersionEMT
trait DependencyBase extends AbstractNode with StaticType[DependencyEMT] {

  override def propertiesMap: java.util.Map[String, Any] = {
    import io.shiftleft.codepropertygraph.generated.v2.accessors.Lang.*
    val res = new java.util.HashMap[String, Any]()
    this.dependencyGroupId.foreach { p => res.put("DEPENDENCY_GROUP_ID", p) }
    res.put("NAME", this.name)
    res.put("VERSION", this.version)
    res
  }
}
class Dependency(graph_4762: odb2.Graph, seq_4762: Int)
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
  override def productArity  = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Dependency]
}
object NewDependency { def apply(): NewDependency = new NewDependency }
class NewDependency extends NewNode(12.toShort) with DependencyBase {
  type RelatedStored = Dependency
  override def label: String                              = "DEPENDENCY"
  var dependencyGroupId: Option[String]                   = None
  var name: String                                        = "<empty>": String
  var version: String                                     = "<empty>": String
  def dependencyGroupId(value: Option[String]): this.type = { this.dependencyGroupId = value; this }
  def dependencyGroupId(value: String): this.type         = { this.dependencyGroupId = Option(value); this }
  def name(value: String): this.type                      = { this.name = value; this }
  def version(value: String): this.type                   = { this.version = value; this }
  override def flattenProperties(interface: odb2.BatchedUpdateInterface): Unit = {
    if (dependencyGroupId.nonEmpty) interface.insertProperty(this, 16, this.dependencyGroupId)
    interface.insertProperty(this, 39, Iterator(this.name))
    interface.insertProperty(this, 52, Iterator(this.version))
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

  override def productPrefix                = "NewDependency"
  override def productArity                 = 3
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewDependency]
}