package io.shiftleft.codepropertygraph.generated.v2.neighboraccessors

import io.shiftleft.codepropertygraph.generated.v2.nodes
import io.shiftleft.codepropertygraph.generated.v2.Language.*

final class AccessNeighborsForLocal(val node: nodes.Local) extends AnyVal {

  /** Traverse to CLOSURE_BINDING via CAPTURED_BY OUT edge.
    */
  def closureBindingViaCapturedByOut: Iterator[nodes.ClosureBinding] = capturedByOut.collectAll[nodes.ClosureBinding]

  /** Traverse to CLOSURE_BINDING via REF IN edge.
    */
  def closureBindingViaRefIn: Iterator[nodes.ClosureBinding] = refIn.collectAll[nodes.ClosureBinding]

  /** Traverse to CONTROL_STRUCTURE via AST IN edge.
    */
  def controlStructureViaAstIn: Iterator[nodes.ControlStructure] = astIn.collectAll[nodes.ControlStructure]

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def tagViaTaggedByOut: Iterator[nodes.Tag] = taggedByOut.collectAll[nodes.Tag]

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def unknownViaAstIn: Iterator[nodes.Unknown] = astIn.collectAll[nodes.Unknown]

  /** Places (identifier) where this local is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  @deprecated("please use referencingIdentifiers instead")
  def identifierViaRefIn: Iterator[nodes.Identifier] = referencingIdentifiers

  /** Places (identifier) where this local is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  def referencingIdentifiers: Iterator[nodes.Identifier] = refIn.collectAll[nodes.Identifier]

  /** The block in which local is declared. Traverse to BLOCK via AST IN edge.
    */
  @deprecated("please use definingBlock instead")
  def blockViaAstIn: Iterator[nodes.Block] = definingBlock

  /** The block in which local is declared. Traverse to BLOCK via AST IN edge.
    */
  def definingBlock: Iterator[nodes.Block] = astIn.collectAll[nodes.Block]

  /** The type of the local. Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  @deprecated("please use typ instead")
  def typeViaEvalTypeOut: Iterator[nodes.Type] = typ

  /** The type of the local. Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  def typ: Iterator[nodes.Type] = evalTypeOut.collectAll[nodes.Type]

  def astIn: Iterator[nodes.Expression] = node._astIn.cast[nodes.Expression]

  def capturedByOut: Iterator[nodes.ClosureBinding] = node._capturedByOut.cast[nodes.ClosureBinding]

  def evalTypeOut: Iterator[nodes.Type] = node._evalTypeOut.cast[nodes.Type]

  def refIn: Iterator[nodes.StoredNode] = node._refIn.cast[nodes.StoredNode]

  def taggedByOut: Iterator[nodes.Tag] = node._taggedByOut.cast[nodes.Tag]
}

final class AccessNeighborsForLocalTraversal(val traversal: Iterator[nodes.Local]) extends AnyVal {

  /** Traverse to CLOSURE_BINDING via CAPTURED_BY OUT edge.
    */
  def closureBindingViaCapturedByOut: Iterator[nodes.ClosureBinding] = traversal.flatMap(_.closureBindingViaCapturedByOut)

  /** Traverse to CLOSURE_BINDING via REF IN edge.
    */
  def closureBindingViaRefIn: Iterator[nodes.ClosureBinding] = traversal.flatMap(_.closureBindingViaRefIn)

  /** Traverse to CONTROL_STRUCTURE via AST IN edge.
    */
  def controlStructureViaAstIn: Iterator[nodes.ControlStructure] = traversal.flatMap(_.controlStructureViaAstIn)

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def tagViaTaggedByOut: Iterator[nodes.Tag] = traversal.flatMap(_.tagViaTaggedByOut)

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def unknownViaAstIn: Iterator[nodes.Unknown] = traversal.flatMap(_.unknownViaAstIn)

  /** Places (identifier) where this local is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  def referencingIdentifiers: Iterator[nodes.Identifier] = traversal.flatMap(_.referencingIdentifiers)

  /** Places (identifier) where this local is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  @deprecated("please use referencingIdentifiers instead")
  def identifierViaRefIn: Iterator[nodes.Identifier] = traversal.flatMap(_.identifierViaRefIn)

  /** The block in which local is declared. Traverse to BLOCK via AST IN edge.
    */
  def definingBlock: Iterator[nodes.Block] = traversal.flatMap(_.definingBlock)

  /** The block in which local is declared. Traverse to BLOCK via AST IN edge.
    */
  @deprecated("please use definingBlock instead")
  def blockViaAstIn: Iterator[nodes.Block] = traversal.flatMap(_.blockViaAstIn)

  /** The type of the local. Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  def typ: Iterator[nodes.Type] = traversal.flatMap(_.typ)

  /** The type of the local. Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  @deprecated("please use typ instead")
  def typeViaEvalTypeOut: Iterator[nodes.Type] = traversal.flatMap(_.typeViaEvalTypeOut)

  def astIn: Iterator[nodes.Expression] = traversal.flatMap(_.astIn)

  def capturedByOut: Iterator[nodes.ClosureBinding] = traversal.flatMap(_.capturedByOut)

  def evalTypeOut: Iterator[nodes.Type] = traversal.flatMap(_.evalTypeOut)

  def refIn: Iterator[nodes.StoredNode] = traversal.flatMap(_.refIn)

  def taggedByOut: Iterator[nodes.Tag] = traversal.flatMap(_.taggedByOut)
}
