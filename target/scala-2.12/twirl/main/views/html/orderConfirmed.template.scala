
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current
/*3.2*/import models.shopping._


Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*4.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*5.2*/main("Order Confirmation", user)/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""<div class="row">
	<div class="col-md-12">
		"""),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
			  """),format.raw/*9.6*/("""<div class="alert alert-success">
			      """),_display_(/*10.11*/flash/*10.16*/.get("success")),format.raw/*10.31*/("""
			  """),format.raw/*11.6*/("""</div>
		""")))}),format.raw/*12.4*/(""" 
		"""),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*25.18*/if(order != null)/*25.35*/ {_display_(Seq[Any](format.raw/*25.37*/("""
                    """),format.raw/*26.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*27.22*/for(i <- order.getItems) yield /*27.46*/ {_display_(Seq[Any](format.raw/*27.48*/("""
                    """),format.raw/*28.21*/("""<tr>
                        <td>"""),_display_(/*29.30*/i/*29.31*/.getPhysWorks.getName),format.raw/*29.52*/("""</td>
                        <td>"""),_display_(/*30.30*/i/*30.31*/.getPhysWorks.getDescription),format.raw/*30.59*/("""</td>
                        <td>&euro; """),_display_(/*31.37*/("%.2f".format(i.getPrice))),format.raw/*31.64*/("""</td>
                        <td>"""),_display_(/*32.30*/i/*32.31*/.getQuantity()),format.raw/*32.45*/("""</td>
                        <td>&euro; """),_display_(/*33.37*/("%.2f".format(i.getItemTotal))),format.raw/*33.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*35.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*36.16*/("""
			"""),format.raw/*37.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*41.68*/("%.2f".format(order.getOrderTotal))),format.raw/*41.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(user:models.users.User,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(user,order)

  def f:((models.users.User,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (user,order) => apply(user,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/orderConfirmed.scala.html
                  HASH: 8ce7a994d2302bf794f856ee822a609d4aa6e308
                  MATRIX: 994->1|1126->63|1162->94|1216->60|1244->120|1316->167|1356->199|1395->201|1423->203|1496->251|1536->283|1575->285|1608->292|1680->337|1694->342|1730->357|1764->364|1805->375|1837->380|2155->671|2181->688|2221->690|2271->712|2382->796|2422->820|2462->822|2512->844|2574->879|2584->880|2626->901|2689->937|2699->938|2748->966|2818->1009|2866->1036|2929->1072|2939->1073|2974->1087|3044->1130|3096->1161|3182->1216|3254->1257|3286->1262|3466->1415|3524->1451
                  LINES: 28->1|31->2|32->3|35->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|64->32|64->32|64->32|65->33|65->33|67->35|68->36|69->37|73->41|73->41
                  -- GENERATED --
              */
          