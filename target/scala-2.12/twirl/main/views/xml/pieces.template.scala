
package views.xml

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.xml._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object pieces extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Piece],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pieces: List[Piece]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<pieces>
	"""),_display_(/*4.3*/for(piece <- pieces) yield /*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
		"""),_display_(/*5.4*/_piece(piece)),format.raw/*5.17*/("""
	""")))}),format.raw/*6.3*/("""
"""),format.raw/*7.1*/("""</pieces>"""))
      }
    }
  }

  def render(pieces:List[Piece]): play.twirl.api.XmlFormat.Appendable = apply(pieces)

  def f:((List[Piece]) => play.twirl.api.XmlFormat.Appendable) = (pieces) => apply(pieces)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 23 21:11:46 CEST 2018
                  SOURCE: /Users/Delfin/eclipse-workspace/Recambios/app/views/pieces.scala.xml
                  HASH: e0680b1c6efef1670fd7a57ad8207f77e98aef44
                  MATRIX: 948->1|1063->22|1090->23|1165->73|1200->93|1239->95|1268->99|1301->112|1333->115|1360->116
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|37->5|38->6|39->7
                  -- GENERATED --
              */
          