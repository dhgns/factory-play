
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

object tags extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[List[Tag],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tags: List[Tag]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<?xml version="1.0" encoding="UTF-8"?>
<pieces>
	"""),_display_(/*4.3*/for(tag <- tags) yield /*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
		"""),_display_(/*5.4*/_tag(tag)),format.raw/*5.13*/("""
	""")))}),format.raw/*6.3*/("""
"""),format.raw/*7.1*/("""</pieces>"""))
      }
    }
  }

  def render(tags:List[Tag]): play.twirl.api.XmlFormat.Appendable = apply(tags)

  def f:((List[Tag]) => play.twirl.api.XmlFormat.Appendable) = (tags) => apply(tags)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 23 21:11:46 CEST 2018
                  SOURCE: /Users/Delfin/eclipse-workspace/Recambios/app/views/tags.scala.xml
                  HASH: b506e296d1fbb3886cbb404d6944da4fa9a9f23e
                  MATRIX: 944->1|1055->18|1082->19|1157->69|1188->85|1227->87|1256->91|1285->100|1317->103|1344->104
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|37->5|38->6|39->7
                  -- GENERATED --
              */
          