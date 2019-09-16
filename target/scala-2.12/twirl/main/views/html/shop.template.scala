
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

object shop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.PhysWorks],String,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.PhysWorks], filter: String, user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""
"""),_display_(/*2.2*/main("Shop",user)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" href=""""),_display_(/*3.35*/routes/*3.41*/.Assets.versioned("/stylesheets/shop.css")),format.raw/*3.83*/("""">
    <ul class="nav navbar-nav navbar-right">
    <div id="action">
        <form action=""""),_display_(/*6.24*/routes/*6.30*/.HomeController.shop()),format.raw/*6.52*/("""" method="GET"> 
            <input type="search" id="searchbox" name="filter" value=""""),_display_(/*7.71*/filter),format.raw/*7.77*/("""" placeholder="Filter by book name... ">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
    </div>
</ul>

    <div class="col-sm-9">
            <table class="table table-bordered table-hover table-condensed">
    
    <thead>
            <tr>
                    <th>Image</th>
            <th>Name</th>
            <th>Author</th>
            <th>Description</th>
            <th>Price</th>
            <th>Stock</th>
                """),_display_(/*24.18*/if((user != null) && ((("user".equals(user.getRole())))))/*24.75*/ {_display_(Seq[Any](format.raw/*24.77*/("""
                    """),format.raw/*25.21*/("""<th>Buy</th>
                """)))}),format.raw/*26.18*/("""
                
        """),format.raw/*28.9*/("""</tr>
    </thead>
    <tbody>
    """),_display_(/*31.6*/for(i<-items) yield /*31.19*/ {_display_(Seq[Any](format.raw/*31.21*/("""
        """),format.raw/*32.9*/("""<tr>
                """),_display_(/*33.18*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*33.100*/ {_display_(Seq[Any](format.raw/*33.102*/("""
                    """),format.raw/*34.21*/("""<td> <img src="/assets/images/productImages/"""),_display_(/*34.66*/(i.getId + "thumb.jpg")),format.raw/*34.89*/(""""/></td>
                """)))}/*35.19*/else/*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
                    """),format.raw/*36.21*/("""<td> <img src="/assets/images/productImages/noImage.jpg"/></td>
                """)))}),format.raw/*37.18*/("""
        			
                """),format.raw/*39.17*/("""<td>"""),_display_(/*39.22*/i/*39.23*/.getName),format.raw/*39.31*/("""</td>
                <td>"""),_display_(/*40.22*/i/*40.23*/.getAuthor),format.raw/*40.33*/("""</td>
                <td>"""),_display_(/*41.22*/i/*41.23*/.getDescription),format.raw/*41.38*/("""</td>
                <td>&euro; """),_display_(/*42.29*/("%.2f".format(i.getPrice))),format.raw/*42.56*/("""</td>
                <td>"""),_display_(/*43.22*/i/*43.23*/.getStock),format.raw/*43.32*/("""</td>
        

                """),_display_(/*46.18*/if((user != null))/*46.36*/ {_display_(Seq[Any](format.raw/*46.38*/("""
                    """),_display_(/*47.22*/if(i.getStock()>0)/*47.40*/{_display_(Seq[Any](format.raw/*47.41*/("""
                      """),format.raw/*48.23*/("""<td><a href=""""),_display_(/*48.37*/routes/*48.43*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*48.77*/("""" 
                          class="btn btn-default btn-xs"><span 
                          class="glyphicon glyphicon-shopping-cart"></span></a>
                      </td>
                  """)))}/*52.20*/else/*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
                      """),format.raw/*53.23*/("""<td><img src="/assets/images/oos.jpg"/></td>
                  """)))}),format.raw/*54.20*/("""
                """)))}),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""<!--Only checks to see if the user is admin-->
            """),_display_(/*57.14*/if((user != null) && ((("admin".equals(user.getRole())))))/*57.72*/ {_display_(Seq[Any](format.raw/*57.74*/("""
                """),format.raw/*58.17*/("""<td>
                <!--Update Book Button-->
                <a href=""""),_display_(/*60.27*/routes/*60.33*/.HomeController.updateBook(i.getId)),format.raw/*60.68*/("""" class="button-xs btn-warning">
                    <span class="glyphicon glyphicon-pencil"></span>
                </a>
            </td>
            <td>
                <!--Delete Book Button-->
                <a href=""""),_display_(/*66.27*/routes/*66.33*/.HomeController.deleteBook(i.getId)),format.raw/*66.68*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
        """)))}),format.raw/*70.10*/("""
            """),format.raw/*71.13*/("""</tr>
            """)))}),format.raw/*72.14*/("""
            """),_display_(/*73.14*/if((user != null) && ((("admin".equals(user.getRole())))))/*73.72*/ {_display_(Seq[Any](format.raw/*73.74*/("""
                """),format.raw/*74.17*/("""<p>
                <a href = """"),_display_(/*75.29*/routes/*75.35*/.HomeController.addPhys()),format.raw/*75.60*/("""">
                    <button class="btn btn-warning">Add New Book</button>
                </a>
            </p>
            """)))}),format.raw/*79.14*/("""
        """),format.raw/*80.9*/("""</tbody>
    </table>
</div>
        """)))}),format.raw/*83.10*/("""
    
"""))
      }
    }
  }

  def render(items:List[models.PhysWorks],filter:String,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(items,filter,user,env)

  def f:((List[models.PhysWorks],String,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (items,filter,user,env) => apply(items,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/shop.scala.html
                  HASH: 9adb29de4cf99f74ccbbbb6d94ddb250e1f425a9
                  MATRIX: 1009->1|1204->100|1232->103|1257->120|1295->121|1327->127|1383->157|1397->163|1459->205|1581->301|1595->307|1637->329|1751->417|1777->423|2329->948|2395->1005|2435->1007|2485->1029|2547->1060|2602->1088|2667->1127|2696->1140|2736->1142|2773->1152|2823->1175|2915->1257|2956->1259|3006->1281|3078->1326|3122->1349|3168->1377|3181->1382|3220->1383|3270->1405|3383->1487|3442->1518|3474->1523|3484->1524|3513->1532|3568->1560|3578->1561|3609->1571|3664->1599|3674->1600|3710->1615|3772->1650|3820->1677|3875->1705|3885->1706|3915->1715|3978->1751|4005->1769|4045->1771|4095->1794|4122->1812|4161->1813|4213->1837|4254->1851|4269->1857|4324->1891|4541->2089|4554->2093|4593->2094|4645->2118|4741->2183|4791->2202|4833->2216|4921->2277|4988->2335|5028->2337|5074->2355|5176->2430|5191->2436|5247->2471|5506->2703|5521->2709|5577->2744|5791->2927|5833->2941|5884->2961|5926->2976|5993->3034|6033->3036|6079->3054|6139->3087|6154->3093|6200->3118|6363->3250|6400->3260|6472->3301
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|35->3|35->3|35->3|38->6|38->6|38->6|39->7|39->7|56->24|56->24|56->24|57->25|58->26|60->28|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|69->37|71->39|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|75->43|75->43|75->43|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|80->48|84->52|84->52|84->52|85->53|86->54|87->55|88->56|89->57|89->57|89->57|90->58|92->60|92->60|92->60|98->66|98->66|98->66|102->70|103->71|104->72|105->73|105->73|105->73|106->74|107->75|107->75|107->75|111->79|112->80|115->83
                  -- GENERATED --
              */
          