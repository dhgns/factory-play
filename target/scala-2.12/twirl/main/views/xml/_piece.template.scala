
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

object _piece extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with _root_.play.twirl.api.Template1[Piece,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(piece: Piece):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
	"""),format.raw/*2.2*/("""<piece>
		<name>"""),_display_(/*3.10*/piece/*3.15*/.getName()),format.raw/*3.25*/("""</name>
		<weight>"""),_display_(/*4.12*/piece/*4.17*/.getWeight()),format.raw/*4.29*/("""</weight>
		<tags>
			"""),_display_(/*6.5*/for(tag <- piece.getTags()) yield /*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
				"""),format.raw/*7.5*/("""<tag>
					<name>"""),_display_(/*8.13*/tag/*8.16*/.getName()),format.raw/*8.26*/("""</name>
				</tag>				
				""")))}),format.raw/*10.6*/("""
		"""),format.raw/*11.3*/("""</tags>
		<prize>"""),_display_(/*12.11*/piece/*12.16*/.getPrize()),format.raw/*12.27*/("""</prize>
		<material>"""),_display_(/*13.14*/piece/*13.19*/.getMaterial()),format.raw/*13.33*/("""</material>
		<lifetime>"""),_display_(/*14.14*/piece/*14.19*/.getLifetime()),format.raw/*14.33*/("""</lifetime>
		<description>"""),_display_(/*15.17*/piece/*15.22*/.getDescription()),format.raw/*15.39*/("""</description>
		<default>"""),_display_(/*16.13*/piece/*16.18*/.isDef()),format.raw/*16.26*/("""</default>
	</piece>
	
	
	
"""))
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
                  SOURCE: /Users/Delfin/eclipse-workspace/Recambios/app/views/_piece.scala.xml
                  HASH: fd08f2596e8c36b54dd81d6e3c4e79fa41a0abd7
                  MATRIX: 942->1|1050->15|1078->17|1121->34|1134->39|1164->49|1209->68|1222->73|1254->85|1302->108|1344->135|1383->137|1414->142|1458->160|1469->163|1499->173|1557->201|1587->204|1632->222|1646->227|1678->238|1727->260|1741->265|1776->279|1828->304|1842->309|1877->323|1932->351|1946->356|1984->373|2038->400|2052->405|2081->413
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|36->4|36->4|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16
                  -- GENERATED --
              */
          