
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Contact")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*2.5*/("""<h3>Contact us for more info:
    </h3>
    <h4>
       Email
    </h4>

  
 
  """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 17:51:50 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/contact.scala.html
                  HASH: 39c0728f711fbbb9fb38e58ba7dd63d0630db3ed
                  MATRIX: 1032->1|1055->16|1094->18|1125->23
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          