
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

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
              <a class="navbar-brand" href="/">Lab 2</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
              <li """),_display_(/*25.20*/if(title=="Home")/*25.37*/{_display_(Seq[Any](format.raw/*25.38*/("""class="active"""")))}),format.raw/*25.53*/("""><a href="/">Home</a></li>
              <li """),_display_(/*26.20*/if(title=="Aboutus")/*26.40*/{_display_(Seq[Any](format.raw/*26.41*/("""class="active"""")))}),format.raw/*26.56*/("""><a href="/about">About Us</a></li>
              <li """),_display_(/*27.20*/if(title=="Products")/*27.41*/{_display_(Seq[Any](format.raw/*27.42*/("""class="active"""")))}),format.raw/*27.57*/("""><a href="/products">Products</a></li>
              
            </ul>
          </nav>

        """),_display_(/*32.10*/content),format.raw/*32.17*/("""

        """),format.raw/*34.9*/("""<footer class="container-fluid text-center">
            <p>Copyright 2017</p>
        </footer>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("javascripts/main.js")),format.raw/*37.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 21:33:40 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/addProducts/app/views/main.scala.html
                  HASH: 64948924984bdfbdbd0a4594509e25dfcdb8087b
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|1791->589|1806->595|1867->634|2228->968|2254->985|2293->986|2339->1001|2412->1047|2441->1067|2480->1068|2526->1083|2608->1138|2638->1159|2677->1160|2723->1175|2849->1274|2877->1281|2914->1291|3060->1410|3075->1416|3136->1456
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|63->32|63->32|65->34|68->37|68->37|68->37
                  -- GENERATED --
              */
          