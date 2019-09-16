
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""
    
    """),format.raw/*7.5*/("""<p class="lead">Add a new user</p>

    """),format.raw/*9.57*/("""
	"""),_display_(/*10.3*/if(flash.containsKey("error"))/*10.33*/ {_display_(Seq[Any](format.raw/*10.35*/("""
		"""),format.raw/*11.3*/("""<div class="alert alert-success">
			"""),_display_(/*12.5*/flash/*12.10*/.get("error")),format.raw/*12.23*/("""
		"""),format.raw/*13.3*/("""</div>
	""")))}),format.raw/*14.3*/("""

    """),_display_(/*16.6*/form(action=routes.LoginController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*16.108*/ {_display_(Seq[Any](format.raw/*16.110*/("""
        """),format.raw/*17.37*/("""
        """),format.raw/*18.99*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""

            """),_display_(/*21.14*/inputText(userForm("username"), '_label -> "Username", 'class -> "form-control")),format.raw/*21.94*/("""
            """),_display_(/*22.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*22.86*/("""
            """),_display_(/*23.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*23.88*/("""
            """),_display_(/*24.14*/inputDate(userForm("birthday"), '_label -> "Birthday", 'class -> "form-control")),format.raw/*24.94*/("""
            """),_display_(/*25.14*/inputText(userForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*25.92*/("""
            """),_display_(/*26.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.98*/("""
            """),format.raw/*27.13*/("""<p>Note: Password must be at least 6 characters,and containt at least one Uppercase, lowercase letter and number</p>
            """),_display_(/*28.14*/inputPassword(userForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*28.107*/("""
            
            """),_display_(/*30.14*/inputText(userForm("role").copy(value=Some("user")), '_label -> "",'hidden -> "hidden")),format.raw/*30.101*/("""
            """),_display_(/*31.14*/inputText(userForm("username"), '_label -> "", 'hidden -> "hidden")),format.raw/*31.81*/("""
            
            

            """),format.raw/*35.13*/("""<div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*37.27*/routes/*37.33*/.LoginController.registerUser()),format.raw/*37.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*41.6*/(""" """),format.raw/*41.24*/("""
""")))}),format.raw/*42.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/registerUser.scala.html
                  HASH: adbedfc07139e833b7c7a3b0b87ee472c8703af1
                  MATRIX: 999->1|1140->74|1185->69|1215->91|1243->94|1277->120|1315->121|1353->133|1422->227|1452->231|1491->261|1531->263|1562->267|1627->306|1641->311|1675->324|1706->328|1746->338|1781->347|1893->449|1934->451|1972->489|2010->589|2048->600|2061->604|2092->614|2136->631|2237->711|2279->726|2372->798|2414->813|2509->887|2551->902|2652->982|2694->997|2793->1075|2835->1090|2940->1174|2982->1188|3140->1319|3255->1412|3311->1441|3420->1528|3462->1543|3550->1610|3622->1654|3783->1788|3798->1794|3850->1825|4014->1959|4043->1977|4076->1980
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|53->21|54->22|54->22|55->23|55->23|56->24|56->24|57->25|57->25|58->26|58->26|59->27|60->28|60->28|62->30|62->30|63->31|63->31|67->35|69->37|69->37|69->37|73->41|73->41|74->42
                  -- GENERATED --
              */
          