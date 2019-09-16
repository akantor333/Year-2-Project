
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current
/*3.2*/import models.shopping._


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*4.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*5.2*/main("Shopping Basket", user)/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
"""),format.raw/*7.1*/("""<div class="row">
	<div class="col-md-12">
		"""),_display_(/*9.4*/if(flash.containsKey("success"))/*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
			  """),format.raw/*10.6*/("""<div class="alert alert-success">
			      """),_display_(/*11.11*/flash/*11.16*/.get("success")),format.raw/*11.31*/("""
			  """),format.raw/*12.6*/("""</div>
		""")))}),format.raw/*13.4*/(""" 
		
        """),format.raw/*15.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*17.69*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*17.115*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.ShoppingCtrl.emptyBasket()),format.raw/*23.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*29.31*/routes/*29.37*/.ShoppingCtrl.placeOrder()),format.raw/*29.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>
<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*38.24*/("""{"""),format.raw/*38.25*/("""
		"""),format.raw/*39.3*/("""return confirm('Are you sure?');
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/("""
"""),format.raw/*41.1*/("""</script>
<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Item Price</th>
        <th>Total</th>
        <th>Quantity</th>
        <th>dec.</th>
        <th>inc.</th>
    </tr>
    </thead>
    <tbody>
        """),_display_(/*56.10*/if(user.getBasket() != null)/*56.38*/ {_display_(Seq[Any](format.raw/*56.40*/("""
            """),format.raw/*57.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*58.14*/for(i <- user.getBasket().getBasketItems()) yield /*58.57*/ {_display_(Seq[Any](format.raw/*58.59*/("""
            """),format.raw/*59.13*/("""<tr>
                <td>"""),_display_(/*60.22*/i/*60.23*/.getPhysWorks.getName),format.raw/*60.44*/("""</td>
                <td>"""),_display_(/*61.22*/i/*61.23*/.getPhysWorks.getDescription()),format.raw/*61.53*/("""</td>
                <td>&euro; """),_display_(/*62.29*/("%.2f".format(i.getPrice))),format.raw/*62.56*/("""</td>
                <td>&euro; """),_display_(/*63.29*/("%.2f".format(i.getItemTotal))),format.raw/*63.60*/("""</td>
                <td>"""),_display_(/*64.22*/i/*64.23*/.getQuantity()),format.raw/*64.37*/("""</td>
                <td><a href=""""),_display_(/*65.31*/routes/*65.37*/.ShoppingCtrl.removeOne(i.getId, i.getPhysWorks.getId())),format.raw/*65.93*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                <td><a href=""""),_display_(/*66.31*/routes/*66.37*/.ShoppingCtrl.addOne(i.getId, i.getPhysWorks.getId())),format.raw/*66.90*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
            </tr>
            """)))}),format.raw/*68.14*/("""<!-- End of For loop -->
      """)))}),format.raw/*69.8*/("""
    """),format.raw/*70.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/basket.scala.html
                  HASH: 722576ecae714659ff8c576c5957908ff0797f65
                  MATRIX: 960->1|1058->29|1094->60|1148->26|1176->86|1248->133|1285->162|1324->164|1358->172|1431->220|1471->252|1510->254|1544->261|1616->306|1630->311|1666->326|1700->333|1741->344|1783->359|1934->483|2002->529|2215->715|2230->721|2278->748|2606->1049|2621->1055|2668->1081|3003->1388|3032->1389|3063->1393|3125->1428|3153->1429|3182->1431|3563->1785|3600->1813|3640->1815|3682->1829|3785->1905|3844->1948|3884->1950|3926->1964|3980->1991|3990->1992|4032->2013|4087->2041|4097->2042|4148->2072|4210->2107|4258->2134|4320->2169|4372->2200|4427->2228|4437->2229|4472->2243|4536->2280|4551->2286|4628->2342|4750->2437|4765->2443|4839->2496|4966->2592|5029->2625|5062->2631
                  LINES: 28->1|31->2|32->3|35->1|36->4|37->5|37->5|37->5|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|49->17|49->17|55->23|55->23|55->23|61->29|61->29|61->29|70->38|70->38|71->39|72->40|72->40|73->41|88->56|88->56|88->56|89->57|90->58|90->58|90->58|91->59|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|98->66|98->66|98->66|100->68|101->69|102->70
                  -- GENERATED --
              */
          