package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.Language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}

trait LocationEMT
    extends AnyRef
    with HasClassNameEMT
    with HasClassShortNameEMT
    with HasFilenameEMT
    with HasLineNumberEMT
    with HasMethodFullNameEMT
    with HasMethodShortNameEMT
    with HasNodeLabelEMT
    with HasPackageNameEMT
    with HasSymbolEMT

trait LocationBase extends AbstractNode with StaticType[LocationEMT] {
  def node: Option[AbstractNode]
  override def propertiesMap: java.util.Map[String, Any] = {
    import io.shiftleft.codepropertygraph.generated.accessors.Lang.*
    val res = new java.util.HashMap[String, Any]()
    res.put("CLASS_NAME", this.className)
    res.put("CLASS_SHORT_NAME", this.classShortName)
    res.put("FILENAME", this.filename)
    this.lineNumber.foreach { p => res.put("LINE_NUMBER", p) }
    res.put("METHOD_FULL_NAME", this.methodFullName)
    res.put("METHOD_SHORT_NAME", this.methodShortName)
    res.put("NODE_LABEL", this.nodeLabel)
    res.put("PACKAGE_NAME", this.packageName)
    res.put("SYMBOL", this.symbol)
    this.node.foreach { p => res.put("node", p) }
    res
  }
}

object Location {
  val Label = "LOCATION"
  object PropertyNames {
    val ClassName = io.shiftleft.codepropertygraph.generated.PropertyNames.CLASS_NAME
    val ClassShortName = io.shiftleft.codepropertygraph.generated.PropertyNames.CLASS_SHORT_NAME
    val Filename = io.shiftleft.codepropertygraph.generated.PropertyNames.FILENAME
    val LineNumber = io.shiftleft.codepropertygraph.generated.PropertyNames.LINE_NUMBER
    val MethodFullName = io.shiftleft.codepropertygraph.generated.PropertyNames.METHOD_FULL_NAME
    val MethodShortName = io.shiftleft.codepropertygraph.generated.PropertyNames.METHOD_SHORT_NAME
    val NodeLabel = io.shiftleft.codepropertygraph.generated.PropertyNames.NODE_LABEL
    val PackageName = io.shiftleft.codepropertygraph.generated.PropertyNames.PACKAGE_NAME
    val Symbol = io.shiftleft.codepropertygraph.generated.PropertyNames.SYMBOL
  }
  object PropertyDefaults {
    val ClassName = "<empty>"
    val ClassShortName = "<empty>"
    val Filename = "<empty>"
    val MethodFullName = "<empty>"
    val MethodShortName = "<empty>"
    val NodeLabel = "<empty>"
    val PackageName = "<empty>"
    val Symbol = "<empty>"
  }
}

class Location(graph_4762: flatgraph.Graph, seq_4762: Int)
    extends StoredNode(graph_4762, 23.toShort, seq_4762)
    with LocationBase
    with StaticType[LocationEMT] {
  def node: Option[StoredNode] = flatgraph.Accessors.getNodePropertyOption[StoredNode](graph, nodeKind, 57, seq)

  override def productElementName(n: Int): String =
    n match {
      case 0 => "className"
      case 1 => "classShortName"
      case 2 => "filename"
      case 3 => "lineNumber"
      case 4 => "methodFullName"
      case 5 => "methodShortName"
      case 6 => "nodeLabel"
      case 7 => "packageName"
      case 8 => "symbol"
      case 9 => "node"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.className
      case 1 => this.classShortName
      case 2 => this.filename
      case 3 => this.lineNumber
      case 4 => this.methodFullName
      case 5 => this.methodShortName
      case 6 => this.nodeLabel
      case 7 => this.packageName
      case 8 => this.symbol
      case 9 => this.node
      case _ => null
    }

  override def productPrefix = "Location"
  override def productArity = 10

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Location]
}

object NewLocation {
  def apply(): NewLocation = new NewLocation
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]] = Map()
}
class NewLocation extends NewNode(23.toShort) with LocationBase {
  override type StoredNodeType = Location
  override def label: String = "LOCATION"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLocation.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLocation.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var className: String = "<empty>": String
  var classShortName: String = "<empty>": String
  var filename: String = "<empty>": String
  var lineNumber: Option[Int] = None
  var methodFullName: String = "<empty>": String
  var methodShortName: String = "<empty>": String
  var node: Option[AbstractNode] = None
  var nodeLabel: String = "<empty>": String
  var packageName: String = "<empty>": String
  var symbol: String = "<empty>": String
  def className(value: String): this.type = { this.className = value; this }
  def classShortName(value: String): this.type = { this.classShortName = value; this }
  def filename(value: String): this.type = { this.filename = value; this }
  def lineNumber(value: Int): this.type = { this.lineNumber = Option(value); this }
  def lineNumber(value: Option[Int]): this.type = { this.lineNumber = value; this }
  def methodFullName(value: String): this.type = { this.methodFullName = value; this }
  def methodShortName(value: String): this.type = { this.methodShortName = value; this }
  def node(value: AbstractNode): this.type = { this.node = Option(value); this }
  def node(value: Option[AbstractNode]): this.type = { this.node = value; this }
  def nodeLabel(value: String): this.type = { this.nodeLabel = value; this }
  def packageName(value: String): this.type = { this.packageName = value; this }
  def symbol(value: String): this.type = { this.symbol = value; this }
  override def flattenProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
    interface.insertProperty(this, 6, Iterator(this.className))
    interface.insertProperty(this, 7, Iterator(this.classShortName))
    interface.insertProperty(this, 21, Iterator(this.filename))
    if (lineNumber.nonEmpty) interface.insertProperty(this, 34, this.lineNumber)
    interface.insertProperty(this, 36, Iterator(this.methodFullName))
    interface.insertProperty(this, 37, Iterator(this.methodShortName))
    interface.insertProperty(this, 40, Iterator(this.nodeLabel))
    interface.insertProperty(this, 45, Iterator(this.packageName))
    interface.insertProperty(this, 50, Iterator(this.symbol))
    if (node.nonEmpty) interface.insertProperty(this, 57, this.node)
  }

  override def copy(): this.type = {
    val newInstance = new NewLocation
    newInstance.className = this.className
    newInstance.classShortName = this.classShortName
    newInstance.filename = this.filename
    newInstance.lineNumber = this.lineNumber
    newInstance.methodFullName = this.methodFullName
    newInstance.methodShortName = this.methodShortName
    newInstance.nodeLabel = this.nodeLabel
    newInstance.packageName = this.packageName
    newInstance.symbol = this.symbol
    newInstance.node = this.node
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "className"
      case 1 => "classShortName"
      case 2 => "filename"
      case 3 => "lineNumber"
      case 4 => "methodFullName"
      case 5 => "methodShortName"
      case 6 => "nodeLabel"
      case 7 => "packageName"
      case 8 => "symbol"
      case 9 => "node"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.className
      case 1 => this.classShortName
      case 2 => this.filename
      case 3 => this.lineNumber
      case 4 => this.methodFullName
      case 5 => this.methodShortName
      case 6 => this.nodeLabel
      case 7 => this.packageName
      case 8 => this.symbol
      case 9 => this.node
      case _ => null
    }

  override def productPrefix = "NewLocation"
  override def productArity = 10
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLocation]
}