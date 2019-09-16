
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

object works extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[models.SubmittedWork],List[models.Genre],Long,String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.SubmittedWork],categories: List[models.Genre],catId: Long, filter: String, user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.147*/("""
"""),_display_(/*2.2*/main("Home",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" href=""""),_display_(/*3.35*/routes/*3.41*/.Assets.versioned("/stylesheets/works.css")),format.raw/*3.84*/("""">
    <h1>User Submitted Works</h1>

    <ul class="nav navbar-nav navbar-right">
				
            <div id="action">
                <form action=""""),_display_(/*9.32*/routes/*9.38*/.HomeController.works(catId)),format.raw/*9.66*/("""" method="GET">
                    <input type="search" id="searchbox" name="filter" value=""""),_display_(/*10.79*/filter),format.raw/*10.85*/("""" placeholder="Filter by work name... ">
                    <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
                </form>
            </div>
    
    </ul>

<div class="col-sm-3">
    <h4>Categories</h4>
        <ul class="list-group">
                <a href = """"),_display_(/*20.29*/routes/*20.35*/.HomeController.works(0, filter)),format.raw/*20.67*/("""" class="list-group-item">All Genres</a>
            """),_display_(/*21.14*/for(c<-categories) yield /*21.32*/ {_display_(Seq[Any](format.raw/*21.34*/("""
                """),_display_(/*22.18*/if(catId == c.getId)/*22.38*/{_display_(Seq[Any](format.raw/*22.39*/("""
                    """),format.raw/*23.21*/("""<a href = """"),_display_(/*23.33*/routes/*23.39*/.HomeController.works(c.getId, filter)),format.raw/*23.77*/("""" class="list-group-item catheight active">"""),_display_(/*23.121*/c/*23.122*/.getName),format.raw/*23.130*/("""
                    """),format.raw/*24.21*/("""</a>
                """)))}/*25.18*/else/*25.22*/{_display_(Seq[Any](format.raw/*25.23*/("""
                """),format.raw/*26.17*/("""<a href = """"),_display_(/*26.29*/routes/*26.35*/.HomeController.works(c.getId, filter)),format.raw/*26.73*/("""" class="list-group-item catheight">"""),_display_(/*26.110*/c/*26.111*/.getName),format.raw/*26.119*/("""
                """),format.raw/*27.17*/("""</a>
            """)))}),format.raw/*28.14*/("""
            """)))}),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</ul>
</div>
<div class="col-sm-9">
"""),_display_(/*33.2*/for(i<-items) yield /*33.15*/ {_display_(Seq[Any](format.raw/*33.17*/("""
    """),_display_(/*34.6*/if("p".equals(i.getType))/*34.31*/{_display_(Seq[Any](format.raw/*34.32*/("""
"""),format.raw/*35.1*/("""<div id="container">
        <div class="work-details">
            <a href=""""),_display_(/*37.23*/routes/*37.29*/.HomeController.fullWork(i.getId())),format.raw/*37.64*/("""">
                
                    <h4>Rating: """),_display_(/*39.34*/i/*39.35*/.getRating),format.raw/*39.45*/("""</h4>
                <div class="work-image">
                """),_display_(/*41.18*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*41.100*/ {_display_(Seq[Any](format.raw/*41.102*/("""
                    """),format.raw/*42.21*/("""<img src="/assets/images/productImages/"""),_display_(/*42.61*/(i.getId + "thumb.jpg")),format.raw/*42.84*/(""""/>
                """)))}/*43.19*/else/*43.24*/{_display_(Seq[Any](format.raw/*43.25*/("""
                    """),format.raw/*44.21*/("""<img src="/assets/images/productImages/noImage.jpg"/>
                """)))}),format.raw/*45.18*/("""



            """),format.raw/*49.13*/("""<p class="information"> Title: """),_display_(/*49.45*/i/*49.46*/.getName),format.raw/*49.54*/("""</p>


            <p class="information"> Author: """),_display_(/*52.46*/i/*52.47*/.getUser.getUsername),format.raw/*52.67*/("""</p>
  
            <div class = "info">
                <li><strong>Preview: </strong>"""),_display_(/*55.48*/i/*55.49*/.getText),format.raw/*55.57*/("""</li>
            </div> 
        </div>         
        <div class = "button1">
                    """),_display_(/*59.22*/if((user != null) && ((("admin".equals(user.getRole()))) || (user.getUsername().equals(i.getUser.getUsername))))/*59.134*/ {_display_(Seq[Any](format.raw/*59.136*/("""
					"""),format.raw/*60.6*/("""<a href=""""),_display_(/*60.16*/routes/*60.22*/.HomeController.updateItem(i.getId)),format.raw/*60.57*/("""" class="btn btn-warning">Edit</a>
                    <a href=""""),_display_(/*61.31*/routes/*61.37*/.HomeController.deleteItem(i.getId)),format.raw/*61.72*/("""" class="btn btn-danger" onclick="return confirmDel();">Delete</a>
                    """)))}),format.raw/*62.22*/("""
                """),format.raw/*63.17*/("""</div>
            </div>
        </div>

        """)))}),format.raw/*67.10*/("""
    """)))}),format.raw/*68.6*/("""
""")))}),format.raw/*69.2*/("""
 """))
      }
    }
  }

  def render(items:List[models.SubmittedWork],categories:List[models.Genre],catId:Long,filter:String,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,categories,catId,filter,user,env)

  def f:((List[models.SubmittedWork],List[models.Genre],Long,String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,categories,catId,filter,user,env) => apply(items,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:42 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/works.scala.html
                  HASH: 0b936fc26d93738d900897db27960459198af3a8
                  MATRIX: 1038->1|1279->146|1307->149|1332->166|1370->167|1402->173|1458->203|1472->209|1535->252|1716->407|1730->413|1778->441|1900->536|1927->542|2281->869|2296->875|2349->907|2431->962|2465->980|2505->982|2551->1001|2580->1021|2619->1022|2669->1044|2708->1056|2723->1062|2782->1100|2854->1144|2865->1145|2895->1153|2945->1175|2987->1198|3000->1202|3039->1203|3085->1221|3124->1233|3139->1239|3198->1277|3263->1314|3274->1315|3304->1323|3350->1341|3400->1360|3446->1375|3483->1385|3549->1425|3578->1438|3618->1440|3651->1447|3685->1472|3724->1473|3753->1475|3860->1555|3875->1561|3931->1596|4013->1651|4023->1652|4054->1662|4147->1728|4239->1810|4280->1812|4330->1834|4397->1874|4441->1897|4482->1920|4495->1925|4534->1926|4584->1948|4687->2020|4735->2040|4794->2072|4804->2073|4833->2081|4915->2136|4925->2137|4966->2157|5084->2248|5094->2249|5123->2257|5257->2364|5379->2476|5420->2478|5454->2485|5491->2495|5506->2501|5562->2536|5655->2602|5670->2608|5726->2643|5846->2732|5892->2750|5978->2805|6015->2812|6048->2815
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|41->9|41->9|41->9|42->10|42->10|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|60->28|61->29|62->30|65->33|65->33|65->33|66->34|66->34|66->34|67->35|69->37|69->37|69->37|71->39|71->39|71->39|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|81->49|81->49|81->49|81->49|84->52|84->52|84->52|87->55|87->55|87->55|91->59|91->59|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|95->63|99->67|100->68|101->69
                  -- GENERATED --
              */
          