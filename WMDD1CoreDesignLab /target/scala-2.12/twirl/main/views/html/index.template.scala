
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
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Home")/*1.14*/ {_display_(Seq[Any](format.raw/*1.16*/("""
  """),format.raw/*2.3*/("""<h3>
    Core Design is a professional web design and online application development company based in Dublin, Ireland.
  </h3>
  <h4>
     We specialise in the following areas:
  </h4>
  <ul>
    <li> Web Design </li>
    <li> Content Managment </li>
    <li> Web Application Development</li>
    <li> Ecommerce and payment</li>
    <li> Security </li>
    <li> Search Engine Optimisation</li>
  </ul>

  <p>
    Please <a href="ContactUs.html"> contact us </a>
    to discuss your requirments
  </p>
""")))}),format.raw/*21.2*/("""
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
                  DATE: Fri Nov 17 17:00:50 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/index.scala.html
                  HASH: 06a576c36beae2bcc31010eb094ffc3eb44cb98c
                  MATRIX: 1030->1|1050->13|1089->15|1118->18|1650->520
                  LINES: 33->1|33->1|33->1|34->2|53->21
                  -- GENERATED --
              */
          