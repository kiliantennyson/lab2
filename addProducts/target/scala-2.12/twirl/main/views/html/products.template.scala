
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
""")))}),format.raw/*4.2*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>

<head>
  <title>Products</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" />
</head>

<body>


  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-3">
        <h4 class="well">
            Menu
        </h4>
      </div>
      <div class="col-sm-9">
        <h4 class="well">
          Products page
        </h4>
      </div>
  </div>
    <footer class="container-fluid text-center">
      <p>Copyright 2017</p>
    </footer>
    
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 21:14:03 GMT 2017
                  SOURCE: /home/wdd/webapps/lab2upload/addProducts/app/views/products.scala.html
                  HASH: c57a632a9b6dd10edaa93d16e252d1a0c54c63d0
                  MATRIX: 944->1|1040->3|1068->6|1092->22|1131->24|1162->26|1189->27
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5
                  -- GENERATED --
              */
          