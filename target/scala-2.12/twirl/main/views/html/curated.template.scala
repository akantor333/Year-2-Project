
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

object curated extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.SubmittedWork],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.SubmittedWork],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""
"""),_display_(/*2.2*/main("Curated",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" href=""""),_display_(/*3.35*/routes/*3.41*/.Assets.versioned("/stylesheets/works.css")),format.raw/*3.84*/("""">
    <h1>Moderator Curated Works</h1>


<div class="col-sm-9">
        """),_display_(/*8.10*/for(i<-items) yield /*8.23*/ {_display_(Seq[Any](format.raw/*8.25*/("""
            """),_display_(/*9.14*/if("c".equals(i.getType))/*9.39*/{_display_(Seq[Any](format.raw/*9.40*/("""
                """),format.raw/*10.17*/("""<div id="container">
                    <div class="work-details">
                        <a href=""""),_display_(/*12.35*/routes/*12.41*/.HomeController.fullWork(i.getId())),format.raw/*12.76*/("""">
                            
                                <h4>Rating: """),_display_(/*14.46*/i/*14.47*/.getRating),format.raw/*14.57*/("""</h4>
                            <div class="work-image">
                            """),_display_(/*16.30*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*16.112*/ {_display_(Seq[Any](format.raw/*16.114*/("""
                                """),format.raw/*17.33*/("""<img src="/assets/images/productImages/"""),_display_(/*17.73*/(i.getId + "thumb.jpg")),format.raw/*17.96*/(""""/>
                            """)))}/*18.31*/else/*18.36*/{_display_(Seq[Any](format.raw/*18.37*/("""
                                """),format.raw/*19.33*/("""<img src="/assets/images/productImages/noImage.jpg"/>
                            """)))}),format.raw/*20.30*/("""
            
            
            
                        """),format.raw/*24.25*/("""<p class="information"> Title: """),_display_(/*24.57*/i/*24.58*/.getName),format.raw/*24.66*/("""</p>
            
            
                        <p class="information"> Author: """),_display_(/*27.58*/i/*27.59*/.getUser.getUsername),format.raw/*27.79*/("""</p>
              
                        <div class = "info">
                            <li><strong>Preview: </strong>"""),_display_(/*30.60*/i/*30.61*/.getText),format.raw/*30.69*/("""</li>
                        </div> 
                    </div>         
                    <div class = "button1">
                                """),_display_(/*34.34*/if((user != null) && ((("admin".equals(user.getRole()))) || (user.getUsername().equals(i.getUser.getUsername))))/*34.146*/ {_display_(Seq[Any](format.raw/*34.148*/("""
                                """),format.raw/*35.33*/("""<a href=""""),_display_(/*35.43*/routes/*35.49*/.HomeController.updateItem(i.getId)),format.raw/*35.84*/("""" class="btn btn-warning">Edit</a>
                                <a href=""""),_display_(/*36.43*/routes/*36.49*/.HomeController.deleteItem(i.getId)),format.raw/*36.84*/("""" class="btn btn-danger" onclick="return confirmDel();">Delete</a>
                                <a href=""""),_display_(/*37.43*/routes/*37.49*/.HomeController.addToPublished(i.getId)),format.raw/*37.88*/("""" class="btn btn-success">Publish</a>
                                """)))}),format.raw/*38.34*/("""
                            """),format.raw/*39.29*/("""</div>
                        </div>
                    </div>
            
                    """)))}),format.raw/*43.22*/("""
                """)))}),format.raw/*44.18*/("""
            """)))}))
      }
    }
  }

  def render(items:List[models.SubmittedWork],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,user,env)

  def f:((List[models.SubmittedWork],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,user,env) => apply(items,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/curated.scala.html
                  HASH: bbf38dee1d3812eccc6cd22ae025346a808fd28e
                  MATRIX: 1009->1|1190->87|1218->90|1246->110|1284->111|1316->117|1372->147|1386->153|1449->196|1554->275|1582->288|1621->290|1662->305|1695->330|1733->331|1779->349|1910->453|1925->459|1981->494|2087->573|2097->574|2128->584|2245->674|2337->756|2378->758|2440->792|2507->832|2551->855|2604->890|2617->895|2656->896|2718->930|2833->1014|2929->1082|2988->1114|2998->1115|3027->1123|3145->1214|3155->1215|3196->1235|3350->1362|3360->1363|3389->1371|3571->1526|3693->1638|3734->1640|3796->1674|3833->1684|3848->1690|3904->1725|4009->1803|4024->1809|4080->1844|4217->1954|4232->1960|4292->1999|4395->2071|4453->2101|4587->2204|4637->2223
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|40->8|40->8|40->8|41->9|41->9|41->9|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|52->20|56->24|56->24|56->24|56->24|59->27|59->27|59->27|62->30|62->30|62->30|66->34|66->34|66->34|67->35|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|75->43|76->44
                  -- GENERATED --
              */
          