
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[models.Bio],models.users.User,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bioForm: Form[models.Bio], u: models.users.User, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.103*/("""

"""),_display_(/*4.2*/main("Profile",user)/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""

    """),format.raw/*6.5*/("""<link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("/stylesheets/profile.css")),format.raw/*6.86*/("""">
    <div class="col-sm-12 well">
    <h3>Role: """),_display_(/*8.16*/u/*8.17*/.getRole),format.raw/*8.25*/("""</h3>
    <h3>Username: """),_display_(/*9.20*/u/*9.21*/.getUsername),format.raw/*9.33*/("""</h3>
    <h3>Name: """),_display_(/*10.16*/u/*10.17*/.getName),format.raw/*10.25*/("""</h3>
    <h3>Birthday: """),_display_(/*11.20*/u/*11.21*/.getDateString),format.raw/*11.35*/("""</h3>
    <h3>Address: """),_display_(/*12.19*/u/*12.20*/.getAddress),format.raw/*12.31*/("""</h3>

    <div class="col-sm-12 well">
        """),_display_(/*15.10*/if((user != null) && (u.getBio == null) && (user == u))/*15.65*/{_display_(Seq[Any](format.raw/*15.66*/("""
        """),_display_(/*16.10*/form(action=routes.HomeController.addBioSubmit(user.getUsername), 'class -> "form-horizontal", 'role -> "form")/*16.121*/ {_display_(Seq[Any](format.raw/*16.123*/("""
        """),format.raw/*17.37*/("""
        """),format.raw/*18.99*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
    
        """),_display_(/*21.10*/textarea(bioForm("text"), '_label -> "", '_showConstraints -> false,'placeholder -> "Add a bio",'rows -> 4,'cols -> 110)),format.raw/*21.130*/("""
    
            """),_display_(/*23.14*/inputText(bioForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.74*/("""

            """),format.raw/*25.13*/("""<div class="actions">
                <input type="submit" value="Submit" class="btn btn-primary">
                <a href=""""),_display_(/*27.27*/routes/*27.33*/.HomeController.profile(u.getUsername)),format.raw/*27.71*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
                """)))}),format.raw/*31.18*/("""
            """)))}),format.raw/*32.14*/("""
            """),_display_(/*33.14*/if(u.getBio != null)/*33.34*/{_display_(Seq[Any](format.raw/*33.35*/("""
                """),format.raw/*34.17*/("""<h3>Bio</h3>
                <h4>"""),_display_(/*35.22*/u/*35.23*/.getBio.getText),format.raw/*35.38*/("""</h4>
            """)))}),format.raw/*36.14*/("""
    
    """),format.raw/*38.5*/("""</div>
    <br>
    <br>
</div>

    """),_display_(/*43.6*/for(w <- u.getWorks) yield /*43.26*/ {_display_(Seq[Any](format.raw/*43.28*/("""
        """),_display_(/*44.10*/if(w.getType().equals("p") || w.getType().equals("c"))/*44.64*/{_display_(Seq[Any](format.raw/*44.65*/("""
            """),format.raw/*45.13*/("""<div class="col-sm-12">
            <div id="container">
                <div class="work-details">
            <a href=""""),_display_(/*48.23*/routes/*48.29*/.HomeController.fullWork(w.getId())),format.raw/*48.64*/("""">

                <h4>Rating: """),_display_(/*50.30*/w/*50.31*/.getRating),format.raw/*50.41*/("""</h4>
                <div class="work-image">
                """),_display_(/*52.18*/if(env.resource("public/images/productImages/" + w.getId + "thumb.jpg").isDefined)/*52.100*/ {_display_(Seq[Any](format.raw/*52.102*/("""
                    """),format.raw/*53.21*/("""<img src="/assets/images/productImages/"""),_display_(/*53.61*/(w.getId + "thumb.jpg")),format.raw/*53.84*/(""""/>
                """)))}/*54.19*/else/*54.24*/{_display_(Seq[Any](format.raw/*54.25*/("""
                    """),format.raw/*55.21*/("""<img src="/assets/images/productImages/noImage.jpg"/>
                """)))}),format.raw/*56.18*/("""
                """),format.raw/*57.17*/("""<p class="information"> Title: """),_display_(/*57.49*/w/*57.50*/.getName),format.raw/*57.58*/("""</p>

                <p class="information"> Author: """),_display_(/*59.50*/w/*59.51*/.getUser.getUsername),format.raw/*59.71*/("""</p>
               
                <div class = "info">
                    <li><strong>Preview: </strong>"""),_display_(/*62.52*/w/*62.53*/.getText),format.raw/*62.61*/("""</li>
                </div>  
            </div>     
            <div class = "button1">
                """),_display_(/*66.18*/if((user != null) && ((("admin".equals(user.getRole()))) || (user.getUsername().equals(w.getUser.getUsername))))/*66.130*/ {_display_(Seq[Any](format.raw/*66.132*/("""
                """),format.raw/*67.17*/("""<a href=""""),_display_(/*67.27*/routes/*67.33*/.HomeController.updateItem(w.getId)),format.raw/*67.68*/("""" class="btn btn-warning">Edit</a>
                <a href=""""),_display_(/*68.27*/routes/*68.33*/.HomeController.deleteItem(w.getId)),format.raw/*68.68*/("""" class="btn btn-danger" onclick="return confirmDel();">Delete</a>
                """)))}),format.raw/*69.18*/("""
            """),format.raw/*70.13*/("""</div>
        </div>
    </div>
</div>
        """)))}),format.raw/*74.10*/("""
    """)))}),format.raw/*75.6*/("""
""")))}))
      }
    }
  }

  def render(bioForm:Form[models.Bio],u:models.users.User,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(bioForm,u,user,env)

  def f:((Form[models.Bio],models.users.User,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (bioForm,u,user,env) => apply(bioForm,u,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/profile.scala.html
                  HASH: b981cae023fdcb8789f2ea01056c3042a68517de
                  MATRIX: 1017->1|1191->107|1237->102|1267->125|1295->145|1333->146|1367->154|1423->184|1437->190|1502->235|1581->288|1590->289|1618->297|1670->323|1679->324|1711->336|1760->358|1770->359|1799->367|1852->393|1862->394|1897->408|1949->433|1959->434|1991->445|2070->497|2134->552|2173->553|2211->564|2332->675|2373->677|2411->715|2449->815|2487->826|2500->830|2531->840|2575->857|2717->977|2765->998|2846->1058|2890->1074|3044->1201|3059->1207|3118->1245|3295->1391|3341->1406|3383->1421|3412->1441|3451->1442|3497->1460|3559->1495|3569->1496|3605->1511|3656->1531|3695->1543|3764->1586|3800->1606|3840->1608|3878->1619|3941->1673|3980->1674|4022->1688|4174->1813|4189->1819|4245->1854|4307->1889|4317->1890|4348->1900|4441->1966|4533->2048|4574->2050|4624->2072|4691->2112|4735->2135|4776->2158|4789->2163|4828->2164|4878->2186|4981->2258|5027->2276|5086->2308|5096->2309|5125->2317|5209->2374|5219->2375|5260->2395|5399->2507|5409->2508|5438->2516|5577->2628|5699->2740|5740->2742|5786->2760|5823->2770|5838->2776|5894->2811|5983->2873|5998->2879|6054->2914|6170->2999|6212->3013|6296->3066|6333->3073
                  LINES: 28->1|31->3|34->1|36->4|36->4|36->4|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|53->21|55->23|55->23|57->25|59->27|59->27|59->27|63->31|64->32|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|70->38|75->43|75->43|75->43|76->44|76->44|76->44|77->45|80->48|80->48|80->48|82->50|82->50|82->50|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|89->57|89->57|89->57|91->59|91->59|91->59|94->62|94->62|94->62|98->66|98->66|98->66|99->67|99->67|99->67|99->67|100->68|100->68|100->68|101->69|102->70|106->74|107->75
                  -- GENERATED --
              */
          