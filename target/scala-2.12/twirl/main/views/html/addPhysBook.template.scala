
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

object addPhysBook extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.PhysWorks],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.PhysWorks],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Physical Book", user)/*5.33*/{_display_(Seq[Any](format.raw/*5.34*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add a new item</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addPhysSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*9.58*/{_display_(Seq[Any](format.raw/*9.59*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload"> 

        """),_display_(/*15.10*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.82*/("""
        """),_display_(/*16.10*/inputText(itemForm("price"), '_label -> "Price of Book", 'class -> "form-control")),format.raw/*16.92*/("""
        """),_display_(/*17.10*/inputText(itemForm("author"), '_label -> "Author", 'class -> "form-control")),format.raw/*17.86*/("""

        """),_display_(/*19.10*/inputText(itemForm("type").copy(value=Some("d")), '_label -> "",'hidden -> "hidden")),format.raw/*19.94*/("""
   
        """),_display_(/*21.10*/textarea(itemForm("description"), '_label -> "Enter the description of the book to be sold", 'class -> "form-control")),format.raw/*21.128*/("""

        """),_display_(/*23.10*/inputText(itemForm("stock"), '_label -> "Enter the amount in stock", 'class -> "form-control")),format.raw/*23.104*/("""
        
        """),_display_(/*25.10*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*25.71*/("""
        """),format.raw/*26.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Book" class ="btn btn-primary">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.shop()),format.raw/*28.51*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*32.6*/("""
""")))}),format.raw/*33.2*/("""
   """))
      }
    }
  }

  def render(itemForm:Form[models.PhysWorks],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.PhysWorks],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:40 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/addPhysBook.scala.html
                  HASH: bb46eaf82929aa900ebd68655424e747f81e65e3
                  MATRIX: 988->1|1119->64|1164->59|1194->81|1222->84|1261->115|1299->116|1331->122|1399->165|1562->320|1600->321|1638->332|1651->336|1682->346|1721->358|1859->469|1952->541|1990->552|2093->634|2131->645|2228->721|2268->734|2373->818|2416->834|2556->952|2596->965|2712->1059|2760->1080|2842->1141|2879->1151|3035->1280|3050->1286|3093->1308|3245->1430|3278->1433
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|41->9|41->9|42->10|42->10|42->10|44->12|47->15|47->15|48->16|48->16|49->17|49->17|51->19|51->19|53->21|53->21|55->23|55->23|57->25|57->25|58->26|60->28|60->28|60->28|64->32|65->33
                  -- GENERATED --
              */
          