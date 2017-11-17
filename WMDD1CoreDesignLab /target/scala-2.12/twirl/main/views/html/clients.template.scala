
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

object clients extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Clients")/*1.17*/ {_display_(Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*2.5*/("""<h3>
       Our clients are always satisfied by our services.
    </h3>
   
    <h4>
            Some of our reviews:
         </h4>
         <ul>
           <li> "Speedy, Neat and awesome" - Some guy </li>
           <li> "kilian is the coolest guy I've ever met" - Everyone </li>
           <li> "Big Bang Theory is not funny" - Guy with a sense of humour</li>
           <li> "They're alright" - Honest Irishman</li>
           <li> "Meh" - Steve </li>
           <li> "Awesome" - Ethusiastic Eddie</li>
         </ul>

  
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
                  DATE: Fri Nov 17 17:42:18 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/clients.scala.html
                  HASH: 1733c00bb3462f69fad85e3a3322f68a0933528a
                  MATRIX: 1032->1|1055->16|1094->18|1125->23
                  LINES: 33->1|33->1|33->1|34->2
                  -- GENERATED --
              */
          