
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

object services extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Services")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
   
    """),format.raw/*3.5*/("""<h4>
       What we do:
    </h4>

    <hr>

    <h3>
    Web Design
    </h3>

    <p>
        Our websites look better than this one usually, I swear.
    </p>

    <hr>
    
        <h3>
        Content Managment.
        </h3>
    
        <p>
            We make sure all the divs are where they're supposed to be so every aspect of project meets clear and concise deadlines.
        </p>

        <hr>
        
    <h3>
    Security
    </h3>
        
    <p>
    Don't mind those pesky hackers Mr. ZuckerBerg... Our clients personal information is our priority. Your site will be secure and fullproof.
    </p>
    
    
  
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
                  DATE: Fri Nov 17 17:51:05 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /app/views/services.scala.html
                  HASH: 362ed10b8afa934b798a37b3fe7403affa936877
                  MATRIX: 1033->1|1057->17|1096->19|1131->28
                  LINES: 33->1|33->1|33->1|35->3
                  -- GENERATED --
              */
          