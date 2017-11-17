
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.33*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Core Design """),_display_(/*7.29*/pageID),format.raw/*7.35*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
    </head>
    <body>
        <div id="Container">
            <div id="logo">
                <h1> Core Design </h1>
                <h3>
                    <em> Website Design and Development Services </em>
                </h3>
            </div>
            <div id="Navigation">
                <ul>
                    <li><a href="/" class="home">Home</a></li>
                    <li><a href="/about" class="about">About Us</a></li>
                    <li><a href="/services" class="services">Services</a></li>
                    <li><a href="/clients" class="clients">Clients</a></li>
                    <li><a href="/contact" class="contact">Contact Us</a></li>
                </ul>
            </div>
            <div id="Content">
                """),_display_(/*28.18*/content),format.raw/*28.25*/("""
            """),format.raw/*29.13*/("""</div>
            <div id="Footer">
                </div>
        </div>
        

        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("javascripts/main.js")),format.raw/*35.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 17 17:31:21 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/main.scala.html
                  HASH: c8fec3e8867fe2b9f9dcc2dea42658d134b74d1f
                  MATRIX: 952->2|1078->33|1106->35|1204->107|1230->113|1318->175|1332->181|1394->222|2190->991|2218->998|2259->1011|2393->1118|2408->1124|2469->1164
                  LINES: 28->2|33->2|35->4|38->7|38->7|39->8|39->8|39->8|59->28|59->28|60->29|66->35|66->35|66->35
                  -- GENERATED --
              */
          