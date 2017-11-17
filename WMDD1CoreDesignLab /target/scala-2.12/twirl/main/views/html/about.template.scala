
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About Us")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
    """),format.raw/*2.5*/("""<h3>
       Were about slick, respsonsive and user-friendly design.
    </h3>
    <h4>
       To find out about specific job roles within the company you should contact us.
    </h4>

  
    <p>
      Please <a href="ContactUs.html"> contact us </a>
      to discuss your requirments
    </p>
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
                  DATE: Fri Nov 17 17:00:50 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/about.scala.html
                  HASH: 6adf2f1ed6985314f8b84f98b23b2ba2f5c034b9
                  MATRIX: 1030->1|1054->17|1093->19|1124->24
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          