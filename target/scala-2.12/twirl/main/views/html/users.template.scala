
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

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.User],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
"""),_display_(/*2.2*/main("Users",user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" href=""""),_display_(/*3.35*/routes/*3.41*/.Assets.versioned("/stylesheets/shop.css")),format.raw/*3.83*/("""">
<div class="col-sm-9">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <tr>
            <th>Username</th>
            <th>Role</th>
            <th>Email</th>
            <th>Name</th>

        </tr>
        </thead>
        <tbody>
            """),_display_(/*16.14*/for(i<-users) yield /*16.27*/ {_display_(Seq[Any](format.raw/*16.29*/("""
               """),format.raw/*17.16*/("""<tr>
                  <td>"""),_display_(/*18.24*/i/*18.25*/.getUsername),format.raw/*18.37*/("""</td>
                  <td>"""),_display_(/*19.24*/i/*19.25*/.getRole),format.raw/*19.33*/("""</td>
                  <td>"""),_display_(/*20.24*/i/*20.25*/.getEmail),format.raw/*20.34*/("""</td>
                  <td>"""),_display_(/*21.24*/i/*21.25*/.getName),format.raw/*21.33*/("""</td>
               </tr>
        """)))}),format.raw/*23.10*/("""
        
        """),format.raw/*25.9*/("""</tbody>
    </table>
</div>
            """)))}),format.raw/*28.14*/("""
"""))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/users.scala.html
                  HASH: 70e131e057ccf8d9cdce0d72ea737f4213fcc160
                  MATRIX: 983->1|1134->57|1162->60|1188->78|1226->79|1258->85|1314->115|1328->121|1390->163|1732->478|1761->491|1801->493|1846->510|1902->539|1912->540|1945->552|2002->582|2012->583|2041->591|2098->621|2108->622|2138->631|2195->661|2205->662|2234->670|2303->708|2350->728|2426->773
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|57->25|60->28
                  -- GENERATED --
              */
          