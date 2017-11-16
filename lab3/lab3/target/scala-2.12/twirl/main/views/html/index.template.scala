
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.3*/("""<h1>The Home Page</h1>
""")))}),format.raw/*5.2*/("""

"""),format.raw/*7.1*/("""<link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.51*/routes/*7.57*/.Assets.versioned("images/test.jpg")),format.raw/*7.93*/("""">
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 20:58:33 GMT 2017
                  SOURCE: /home/wdd/webapps/lab3/lab3/app/views/index.scala.html
                  HASH: e3e46a999bd4245cddf1dd959f2b2617acdd202c
                  MATRIX: 941->1|1037->3|1065->6|1085->18|1124->20|1153->23|1206->47|1234->49|1310->99|1324->105|1380->141
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|39->7|39->7|39->7|39->7
                  -- GENERATED --
              */
          