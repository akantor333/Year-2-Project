
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

object drafts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.SubmittedWork],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.SubmittedWork],user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""
"""),_display_(/*2.2*/main("Drafts",user)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" href=""""),_display_(/*3.35*/routes/*3.41*/.Assets.versioned("/stylesheets/works.css")),format.raw/*3.84*/("""">
    <h1>Your Drafts</h1>
    <p>This page contains all of your drafts that are ready to publish at your discretion.</p>


    <div class="col-sm-9">
        """),_display_(/*9.10*/for(i<-items) yield /*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
            """),_display_(/*10.14*/if("d".equals(i.getType) && user.getUsername().equals(i.getUser.getUsername))/*10.91*/{_display_(Seq[Any](format.raw/*10.92*/("""
                """),format.raw/*11.17*/("""<div id="container">
                        <div class="work-details">
                            <a href=""""),_display_(/*13.39*/routes/*13.45*/.HomeController.fullWork(i.getId())),format.raw/*13.80*/("""">
                                
                                    <h4>Rating: """),_display_(/*15.50*/i/*15.51*/.getRating),format.raw/*15.61*/("""</h4>
                                <div class="work-image">
                                """),_display_(/*17.34*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*17.116*/ {_display_(Seq[Any](format.raw/*17.118*/("""
                                    """),format.raw/*18.37*/("""<img src="/assets/images/productImages/"""),_display_(/*18.77*/(i.getId + "thumb.jpg")),format.raw/*18.100*/(""""/>
                                """)))}/*19.35*/else/*19.40*/{_display_(Seq[Any](format.raw/*19.41*/("""
                                    """),format.raw/*20.37*/("""<img src="/assets/images/productImages/noImage.jpg"/>
                                """)))}),format.raw/*21.34*/("""
                
                
                
                            """),format.raw/*25.29*/("""<p class="information"> Title: """),_display_(/*25.61*/i/*25.62*/.getName),format.raw/*25.70*/("""</p>
                
                
                            <p class="information"> Author: """),_display_(/*28.62*/i/*28.63*/.getUser.getUsername),format.raw/*28.83*/("""</p>
                  
                            <div class = "info">
                                <li><strong>Preview: </strong>"""),_display_(/*31.64*/i/*31.65*/.getText),format.raw/*31.73*/("""</li>
                            </div> 
                        </div>         
                        <div class = "button1">
                                    """),_display_(/*35.38*/if((user != null) && ((("admin".equals(user.getRole()))) || (user.getUsername().equals(i.getUser.getUsername))))/*35.150*/ {_display_(Seq[Any](format.raw/*35.152*/("""
                                    """),format.raw/*36.37*/("""<a href=""""),_display_(/*36.47*/routes/*36.53*/.HomeController.updateItem(i.getId)),format.raw/*36.88*/("""" class="btn btn-warning">Edit</a>
                                    <a href=""""),_display_(/*37.47*/routes/*37.53*/.HomeController.deleteItem(i.getId)),format.raw/*37.88*/("""" class="btn btn-danger" onclick="return confirmDel();">Delete</a>
                                    <a href=""""),_display_(/*38.47*/routes/*38.53*/.HomeController.addToPublished(i.getId)),format.raw/*38.92*/("""" class="btn btn-success">Publish</a>
                                    """)))}),format.raw/*39.38*/("""
                                """),format.raw/*40.33*/("""</div>
                            </div>
                        </div>
                
                        """)))}),format.raw/*44.26*/("""
                    """)))}),format.raw/*45.22*/("""
                """)))}),format.raw/*46.18*/("""
                 """))
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
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/drafts.scala.html
                  HASH: 82e8dbc929aea091848ddd0dd5c611d78dff48d3
                  MATRIX: 1008->1|1189->87|1217->90|1244->109|1282->110|1314->116|1370->146|1384->152|1447->195|1640->362|1668->375|1707->377|1749->392|1835->469|1874->470|1920->488|2059->600|2074->606|2130->641|2244->728|2254->729|2285->739|2410->837|2502->919|2543->921|2609->959|2676->999|2721->1022|2778->1061|2791->1066|2830->1067|2896->1105|3015->1193|3127->1277|3186->1309|3196->1310|3225->1318|3355->1421|3365->1422|3406->1442|3572->1581|3582->1582|3611->1590|3809->1761|3931->1873|3972->1875|4038->1913|4075->1923|4090->1929|4146->1964|4255->2046|4270->2052|4326->2087|4467->2201|4482->2207|4542->2246|4649->2322|4711->2356|4861->2475|4915->2498|4965->2517
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|41->9|41->9|41->9|42->10|42->10|42->10|43->11|45->13|45->13|45->13|47->15|47->15|47->15|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|53->21|57->25|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|67->35|67->35|67->35|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|72->40|76->44|77->45|78->46
                  -- GENERATED --
              */
          