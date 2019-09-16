
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

object fullWork extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[models.Donation],Form[models.Comment],List[models.Comment],models.SubmittedWork,models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(donationForm: Form[models.Donation],itemForm: Form[models.Comment], comments: List[models.Comment],  work: models.SubmittedWork,user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.182*/("""
"""),_display_(/*3.2*/main("Works",user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<link rel="stylesheet" href=""""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("/stylesheets/fullWorks.css")),format.raw/*4.88*/("""">
    <div class="left-column">
            """),_display_(/*6.14*/if(env.resource("public/images/productImages/" + work.getId + "thumb.jpg").isDefined)/*6.99*/ {_display_(Seq[Any](format.raw/*6.101*/("""
                """),format.raw/*7.17*/("""<img src="/assets/images/productImages/"""),_display_(/*7.57*/(work.getId + "thumb.jpg")),format.raw/*7.83*/(""""/>
            """)))}/*8.15*/else/*8.20*/{_display_(Seq[Any](format.raw/*8.21*/("""
                """),format.raw/*9.17*/("""<img src="/assets/images/productImages/noImage.jpg"/>
            """)))}),format.raw/*10.14*/("""
            """),format.raw/*11.13*/("""<div class="work-description">
            <h1>Title: """),_display_(/*12.25*/work/*12.29*/.getName),format.raw/*12.37*/("""</h1>
            <a href=""""),_display_(/*13.23*/routes/*13.29*/.HomeController.profile(work.getUser.getUsername)),format.raw/*13.78*/("""">
            <h2>Author: """),_display_(/*14.26*/work/*14.30*/.getUser.getUsername),format.raw/*14.50*/("""</h2>
            </a>
            """),_display_(/*16.14*/if(work.getDate != null)/*16.38*/{_display_(Seq[Any](format.raw/*16.39*/("""
            """),format.raw/*17.13*/("""<h3>Publish Date: """),_display_(/*17.32*/work/*17.36*/.getDateString),format.raw/*17.50*/("""</h3>""")))}),format.raw/*17.56*/("""
            """),format.raw/*18.13*/("""<br>
            <br>
            <div class = "text-box">
            <p>"""),_display_(/*21.17*/work/*21.21*/.getText),format.raw/*21.29*/("""</p>
            </div>
        </div>
    </div>

        <div class="right-column">
                """),_display_(/*27.18*/if(((user != null) && (("admin".equals(user.getRole())))) && ("p".equals(work.getType)))/*27.106*/ {_display_(Seq[Any](format.raw/*27.108*/("""
                    """),format.raw/*28.21*/("""<a type="button" value="Add to Curated works" class="btn btn-primary" href=""""),_display_(/*28.98*/routes/*28.104*/.HomeController.addToCurated(work.getId())),format.raw/*28.146*/("""">Add to Curated Works</a>
                """)))}),format.raw/*29.18*/("""
    """),format.raw/*30.5*/("""<h3>Rating: """),_display_(/*30.18*/work/*30.22*/.getRating),format.raw/*30.32*/("""</h3>
    """),_display_(/*31.6*/if(user != null)/*31.22*/{_display_(Seq[Any](format.raw/*31.23*/("""
    """),format.raw/*32.5*/("""<a type="button" value="Upvote" class="btn btn-warning" href=""""),_display_(/*32.68*/routes/*32.74*/.HomeController.upvote(work.getId(),user.getUsername())),format.raw/*32.129*/("""">+1</a>
    <a type="button" value="Downvote" class="btn btn-danger" href=""""),_display_(/*33.69*/routes/*33.75*/.HomeController.downvote(work.getId(),user.getUsername())),format.raw/*33.132*/("""">-1</a>
    """)))}),format.raw/*34.6*/("""

    """),_display_(/*36.6*/form(action=routes.HomeController.addCommentSubmit(work.getId), 'class -> "form-horizontal", 'role -> "form")/*36.115*/ {_display_(Seq[Any](format.raw/*36.117*/("""
        """),format.raw/*37.37*/("""
        """),format.raw/*38.99*/("""
        """),_display_(/*39.10*/CSRF/*39.14*/.formField),format.raw/*39.24*/("""
    
        """),_display_(/*41.10*/textarea(itemForm("text"), '_label -> "",'placeholder -> "Add a comment",'rows -> 4,'cols -> 90)),format.raw/*41.106*/("""
    
            """),format.raw/*43.13*/("""<div class="actions">
                <input type="submit" value="Submit" class="btn btn-primary">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.HomeController.fullWork(work.getId)),format.raw/*45.69*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
            """),_display_(/*49.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*49.75*/("""
            """),_display_(/*50.14*/inputText(itemForm("user.username"), '_label -> "", 'hidden -> "hidden")),format.raw/*50.86*/("""
            """),_display_(/*51.14*/inputText(itemForm("work.id"), '_label -> "", 'hidden -> "hidden")),format.raw/*51.80*/("""
    """)))}),format.raw/*52.6*/(""" """),format.raw/*52.24*/("""
        """),format.raw/*53.9*/("""</div>


<div class="col-sm-9 well">
        <p class="lead">Comments</p>
    """),_display_(/*58.6*/for(i<-comments) yield /*58.22*/ {_display_(Seq[Any](format.raw/*58.24*/("""
        """),format.raw/*59.9*/("""<div class="well">
        <h5>User: """),_display_(/*60.20*/i/*60.21*/.getUser.getUsername),format.raw/*60.41*/(""" """),format.raw/*60.42*/("""</h5>
        <p>"""),_display_(/*61.13*/i/*61.14*/.getText),format.raw/*61.22*/("""</p>
        """),_display_(/*62.10*/if(((user != null) && (("admin".equals(user.getRole())))))/*62.68*/{_display_(Seq[Any](format.raw/*62.69*/("""
            """),format.raw/*63.13*/("""<a type="button" value="Delete" class="btn btn-danger" href=""""),_display_(/*63.75*/routes/*63.81*/.HomeController.deleteComment(i.getId)),format.raw/*63.119*/("""" onclick="return confirmDel();">Delete</a>
        """)))}),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""</div>
    """)))}),format.raw/*66.6*/("""
"""),format.raw/*67.1*/("""</div>

<div class="col-sm-9 well">
    <h3>Donations</h3>
    """),_display_(/*71.6*/if((user != null) && (user.getDonation == null))/*71.54*/{_display_(Seq[Any](format.raw/*71.55*/("""
        """),format.raw/*72.9*/("""<h3>Register your Paypal email to enable donations</h3>
    """),_display_(/*73.6*/form(action=routes.HomeController.addDonationSubmit(work.getId,user.getUsername), 'class -> "form-horizontal", 'role -> "form")/*73.133*/ {_display_(Seq[Any](format.raw/*73.135*/("""
    """),format.raw/*74.33*/("""
    """),format.raw/*75.95*/("""
    """),_display_(/*76.6*/CSRF/*76.10*/.formField),format.raw/*76.20*/("""

    """),_display_(/*78.6*/inputText(itemForm("donationEmail"), '_label -> "Email", 'class -> "form-control")),format.raw/*78.88*/("""

        """),_display_(/*80.10*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*80.71*/("""

        """),format.raw/*82.9*/("""<div class="actions">
            <input type="submit" value="Submit" class="btn btn-primary">
            <a href=""""),_display_(/*84.23*/routes/*84.29*/.HomeController.fullWork(work.getId)),format.raw/*84.65*/(""""></a>
        </div>
            """)))}),format.raw/*86.14*/("""
        """)))}),format.raw/*87.10*/("""
            """),_display_(/*88.14*/if((user != null) && (work.getUser.getDonation != null) && (work.getUser.getDonation.getDonationEmail != null))/*88.125*/ {_display_(Seq[Any](format.raw/*88.127*/("""
                """),format.raw/*89.17*/("""<h4>Support this creator by donating!</h4>
                <h4><form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                    <input type="hidden" name="cmd" value="_donations" />
                    <input type="hidden" name="business" value="""),_display_(/*92.65*/work/*92.69*/.getUser.getDonation.getDonationEmail),format.raw/*92.106*/(""" """),format.raw/*92.107*/("""/>
                    <input type="hidden" name="currency_code" value="USD" />
                    <input type="image" src="https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif" border="0" name="submit" title="PayPal - The safer, easier way to pay online!" alt="Donate with PayPal button" />
                    <img alt="" border="0" src="https://www.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1" />
                    </form></h4>
                """)))}/*97.18*/else/*97.22*/{_display_(Seq[Any](format.raw/*97.23*/("""
                    """),format.raw/*98.21*/("""<p>This user has not enabled donations</p>
                """)))}),format.raw/*99.18*/("""

"""),format.raw/*101.1*/("""</div>
""")))}),format.raw/*102.2*/("""

"""))
      }
    }
  }

  def render(donationForm:Form[models.Donation],itemForm:Form[models.Comment],comments:List[models.Comment],work:models.SubmittedWork,user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(donationForm,itemForm,comments,work,user,env)

  def f:((Form[models.Donation],Form[models.Comment],List[models.Comment],models.SubmittedWork,models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (donationForm,itemForm,comments,work,user,env) => apply(donationForm,itemForm,comments,work,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/fullWork.scala.html
                  HASH: 6736e6bf819aa9eefb8c2b4d5b187312f53b2297
                  MATRIX: 1068->1|1321->184|1367->181|1395->202|1421->220|1459->221|1491->227|1547->257|1561->263|1628->310|1702->358|1795->443|1835->445|1880->463|1946->503|1992->529|2028->548|2040->553|2078->554|2123->572|2222->640|2264->654|2347->710|2360->714|2389->722|2445->751|2460->757|2530->806|2586->835|2599->839|2640->859|2705->897|2738->921|2777->922|2819->936|2865->955|2878->959|2913->973|2950->979|2992->993|3097->1071|3110->1075|3139->1083|3275->1192|3373->1280|3414->1282|3464->1304|3568->1381|3584->1387|3648->1429|3724->1474|3757->1480|3797->1493|3810->1497|3841->1507|3879->1519|3904->1535|3943->1536|3976->1542|4066->1605|4081->1611|4158->1666|4263->1744|4278->1750|4357->1807|4402->1822|4437->1831|4556->1940|4597->1942|4635->1980|4673->2080|4711->2091|4724->2095|4755->2105|4799->2122|4917->2218|4965->2238|5119->2365|5134->2371|5191->2407|5360->2549|5442->2610|5484->2625|5577->2697|5619->2712|5706->2778|5743->2785|5772->2803|5809->2813|5919->2897|5951->2913|5991->2915|6028->2925|6094->2964|6104->2965|6145->2985|6174->2986|6220->3005|6230->3006|6259->3014|6301->3029|6368->3087|6407->3088|6449->3102|6538->3164|6553->3170|6613->3208|6698->3262|6731->3268|6774->3281|6803->3283|6897->3351|6954->3399|6993->3400|7030->3410|7118->3472|7255->3599|7296->3601|7330->3635|7364->3731|7397->3738|7410->3742|7441->3752|7476->3761|7579->3843|7619->3856|7701->3917|7740->3929|7886->4048|7901->4054|7958->4090|8026->4127|8068->4138|8110->4153|8231->4264|8272->4266|8318->4284|8631->4570|8644->4574|8703->4611|8733->4612|9225->5085|9238->5089|9277->5090|9327->5112|9419->5173|9451->5177|9491->5186
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|50->18|53->21|53->21|53->21|59->27|59->27|59->27|60->28|60->28|60->28|60->28|61->29|62->30|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|64->32|65->33|65->33|65->33|66->34|68->36|68->36|68->36|69->37|70->38|71->39|71->39|71->39|73->41|73->41|75->43|77->45|77->45|77->45|81->49|81->49|82->50|82->50|83->51|83->51|84->52|84->52|85->53|90->58|90->58|90->58|91->59|92->60|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|97->65|98->66|99->67|103->71|103->71|103->71|104->72|105->73|105->73|105->73|106->74|107->75|108->76|108->76|108->76|110->78|110->78|112->80|112->80|114->82|116->84|116->84|116->84|118->86|119->87|120->88|120->88|120->88|121->89|124->92|124->92|124->92|124->92|129->97|129->97|129->97|130->98|131->99|133->101|134->102
                  -- GENERATED --
              */
          