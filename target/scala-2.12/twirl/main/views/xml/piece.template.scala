
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

object piece extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Piece,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(piece: Piece):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<?xml version="1.0" encoding="UTF-8"?>
"""),_display_(/*3.2*/_piece(piece)))
      }
    }
  }

  def render(piece:Piece): play.twirl.api.XmlFormat.Appendable = apply(piece)

  def f:((Piece) => play.twirl.api.XmlFormat.Appendable) = (piece) => apply(piece)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 23 21:11:46 CEST 2018
                  SOURCE: /Users/Delfin/eclipse-workspace/Recambios/app/views/piece.scala.xml
                  HASH: 7a694f72917933e4899c95585c0aad6706d0b084
                  MATRIX: 941->1|1049->15|1076->16|1141->56
                  LINES: 28->1|33->1|34->2|35->3
                  -- GENERATED --
              */
          