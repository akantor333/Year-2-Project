
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

object addSubmission extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.SubmittedWork],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.SubmittedWork],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Submit Work",user)/*5.26*/{_display_(Seq[Any](format.raw/*5.27*/("""
    
    """),format.raw/*7.5*/("""<p class="lead">Add a new submission</p>

    """),_display_(/*9.6*/form(action=routes.HomeController.addSubmissionSubmit(), 'class -> "form-horizontal", 'role -> "form",
    'method -> "POST", 'enctype -> "multipart/form-data")/*10.58*/ {_display_(Seq[Any](format.raw/*10.60*/("""
        """),format.raw/*11.37*/("""
        """),format.raw/*12.99*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

            """),_display_(/*15.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.86*/("""
            """),format.raw/*16.13*/("""<p><strong>Genres</strong></p>
            """),_display_(/*17.14*/for((value, name)<- Genre.options) yield /*17.48*/{_display_(Seq[Any](format.raw/*17.49*/("""
                """),format.raw/*18.17*/("""<input type="checkbox" name="genreSelect[]" value=""""),_display_(/*18.69*/value),format.raw/*18.74*/(""""
                    """),_display_(/*19.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get != "")/*19.96*/{_display_(Seq[Any](format.raw/*19.97*/("""
                        """),_display_(/*20.26*/if(Genre.inGenre(value.toLong, itemForm("id").getValue.get.toLong))/*20.93*/{_display_(Seq[Any](format.raw/*20.94*/("""
                            """),format.raw/*21.29*/("""checked
                        """)))}),format.raw/*22.26*/("""
                    """)))}),format.raw/*23.22*/("""
                """),format.raw/*24.17*/("""/> """),_display_(/*24.21*/name),format.raw/*24.25*/(""" """),format.raw/*24.26*/("""</br>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""<br>
            """),_display_(/*27.14*/textarea(itemForm("text"), '_label -> "Content",'placeholder -> "Enter your literary work here",'rows -> 12,'cols -> 110)),format.raw/*27.135*/("""

            """),_display_(/*29.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.75*/("""
            """),_display_(/*30.14*/inputText(itemForm("user.username").copy(value=Some(user.getUsername())), '_label -> "",'hidden -> "hidden")),format.raw/*30.122*/("""
            """),_display_(/*31.14*/inputText(itemForm("rating").copy(value=Some("0")), '_label -> "",'hidden -> "hidden")),format.raw/*31.100*/("""


            """),format.raw/*34.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload"> 

            """),_display_(/*37.14*/inputText(itemForm("type").copy(value=Some("d")), '_showConstraints -> false,'_label -> "",'hidden -> "hidden")),format.raw/*37.125*/("""

            """),format.raw/*39.13*/("""<div class="actions">
                <input type="submit" value="Create Draft/Update Work" class="btn btn-primary">
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.works(0)),format.raw/*41.57*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*45.6*/(""" """),format.raw/*45.24*/("""
""")))}),format.raw/*46.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.SubmittedWork],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.SubmittedWork],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/addSubmission.scala.html
                  HASH: cc99f92afca801eea9e06fc4ae2c814ad3f351b5
                  MATRIX: 994->1|1129->68|1174->63|1204->85|1232->88|1264->112|1302->113|1340->125|1414->174|1584->335|1624->337|1662->375|1700->475|1738->486|1751->490|1782->500|1826->517|1919->589|1961->603|2033->648|2083->682|2122->683|2168->701|2247->753|2273->758|2324->782|2407->856|2446->857|2500->884|2576->951|2615->952|2673->982|2738->1016|2792->1039|2838->1057|2869->1061|2894->1065|2923->1066|2974->1086|3011->1096|3057->1115|3200->1236|3244->1253|3326->1314|3368->1329|3498->1437|3540->1452|3648->1538|3694->1556|3840->1675|3973->1786|4017->1802|4189->1947|4204->1953|4249->1977|4413->2111|4442->2129|4475->2132
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|43->11|44->12|45->13|45->13|45->13|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|54->22|55->23|56->24|56->24|56->24|56->24|57->25|58->26|59->27|59->27|61->29|61->29|62->30|62->30|63->31|63->31|66->34|69->37|69->37|71->39|73->41|73->41|73->41|77->45|77->45|78->46
                  -- GENERATED --
              */
          