
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String, user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href=""""),_display_(/*9.32*/routes/*9.38*/.Assets.versioned("/stylesheets/main.css")),format.raw/*9.80*/(""""> <meta name="viewport"
    content="width=device-width, initial-scale=1">
	<style>
		.footer """),format.raw/*12.11*/("""{"""),format.raw/*12.12*/(""" """),format.raw/*12.13*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*12.71*/("""}"""),format.raw/*12.72*/("""
	    """),format.raw/*13.6*/(""".midcol h1 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; font-weight: bold; """),format.raw/*13.58*/("""}"""),format.raw/*13.59*/("""
	    """),format.raw/*14.6*/(""".midcol h3 """),format.raw/*14.17*/("""{"""),format.raw/*14.18*/(""" """),format.raw/*14.19*/("""text-align: center; color: rgb(62, 65, 68); """),format.raw/*14.63*/("""}"""),format.raw/*14.64*/("""
		"""),format.raw/*15.3*/(""".account """),format.raw/*15.12*/("""{"""),format.raw/*15.13*/(""" """),format.raw/*15.14*/("""color:black"""),format.raw/*15.25*/("""}"""),format.raw/*15.26*/("""
		
	"""),format.raw/*17.2*/("""</style>
	<title>Crux """),_display_(/*18.15*/pagename),format.raw/*18.23*/("""</title>
</head>
<body>
<div class = "container-fluid">
			<div class="row">
						<div class="col-sm-12">
					<img class = "banner" src = "assets/images/CruxBanner.jpg" alt = "Community Banner"></img>
					</div>
				</div>
			
		
			
	<nav class="navbar navbar-inverse">
			<ul class="nav navbar-nav">
				<li """),_display_(/*32.10*/if(pagename=="Home" )/*32.31*/ {_display_(Seq[Any](format.raw/*32.33*/("""class="active" """)))}),format.raw/*32.49*/("""><a href=""""),_display_(/*32.60*/routes/*32.66*/.HomeController.works(0)),format.raw/*32.90*/("""">Home</a></li>
				<li """),_display_(/*33.10*/if(pagename=="Curated" )/*33.34*/ {_display_(Seq[Any](format.raw/*33.36*/("""class="active" """)))}),format.raw/*33.52*/("""><a href=""""),_display_(/*33.63*/routes/*33.69*/.HomeController.curated()),format.raw/*33.94*/("""">Curated</a></li>
				<li """),_display_(/*34.10*/if(pagename=="Drafts" )/*34.33*/ {_display_(Seq[Any](format.raw/*34.35*/("""class="active" """)))}),format.raw/*34.51*/("""><a href=""""),_display_(/*34.62*/routes/*34.68*/.HomeController.drafts()),format.raw/*34.92*/("""">Drafts</a></li>
				<li """),_display_(/*35.10*/if(pagename=="Submit Work" )/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/("""class="active" """)))}),format.raw/*35.56*/("""><a href=""""),_display_(/*35.67*/routes/*35.73*/.HomeController.addSubmission()),format.raw/*35.104*/("""">Submit Work</a></li>
				<li """),_display_(/*36.10*/if(pagename=="Shop" )/*36.31*/ {_display_(Seq[Any](format.raw/*36.33*/("""class="active" """)))}),format.raw/*36.49*/("""><a href=""""),_display_(/*36.60*/routes/*36.66*/.HomeController.shop()),format.raw/*36.88*/("""">Shop</a></li>
				"""),_display_(/*37.6*/if(((user != null) && (("admin".equals(user.getRole())))))/*37.64*/ {_display_(Seq[Any](format.raw/*37.66*/("""
				"""),format.raw/*38.5*/("""<li """),_display_(/*38.10*/if(pagename=="Users" )/*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""class="active" """)))}),format.raw/*38.50*/("""><a href=""""),_display_(/*38.61*/routes/*38.67*/.HomeController.users()),format.raw/*38.90*/("""">User List</a></li>
				""")))}),format.raw/*39.6*/("""
			"""),format.raw/*40.4*/("""</ul>

				<ul class="nav navbar-nav navbar-right">
								"""),_display_(/*43.10*/if(user != null)/*43.26*/ {_display_(Seq[Any](format.raw/*43.28*/("""
									"""),format.raw/*44.10*/("""<li type="button" value="Logout" """),format.raw/*44.43*/("""{"""),format.raw/*44.44*/("""class="active" """),format.raw/*44.59*/("""}"""),format.raw/*44.60*/("""><a href=""""),_display_(/*44.71*/routes/*44.77*/.LoginController.logout),format.raw/*44.100*/("""">Log Out</a></li>
									<li type="button" value="Profile" """),format.raw/*45.44*/("""{"""),format.raw/*45.45*/("""class="active" """),format.raw/*45.60*/("""}"""),format.raw/*45.61*/("""><a href=""""),_display_(/*45.72*/routes/*45.78*/.HomeController.profile(user.getUsername())),format.raw/*45.121*/("""">Profile</a></li>
									
								""")))}/*47.10*/else/*47.14*/{_display_(Seq[Any](format.raw/*47.15*/("""
									"""),format.raw/*48.10*/("""<li type="button" value="Login" """),format.raw/*48.42*/("""{"""),format.raw/*48.43*/("""class="active" """),format.raw/*48.58*/("""}"""),format.raw/*48.59*/("""><a href=""""),_display_(/*48.70*/routes/*48.76*/.LoginController.login),format.raw/*48.98*/("""">Login</a></li>
									<li type="button" value="Register" """),format.raw/*49.45*/("""{"""),format.raw/*49.46*/("""class="active" """),format.raw/*49.61*/("""}"""),format.raw/*49.62*/("""><a href=""""),_display_(/*49.73*/routes/*49.79*/.LoginController.registerUser),format.raw/*49.108*/("""">Create Account</a></li>

									

										
								""")))}),format.raw/*54.10*/("""

						"""),format.raw/*56.7*/("""</ul>

	</nav>
	<div class = "container-fluid">

		"""),format.raw/*61.72*/("""
		"""),_display_(/*62.4*/if(flash.containsKey("success"))/*62.36*/ {_display_(Seq[Any](format.raw/*62.38*/("""
		"""),format.raw/*63.3*/("""<div class="alert alert-success">
			"""),_display_(/*64.5*/flash/*64.10*/.get("success")),format.raw/*64.25*/("""
		""")))}),format.raw/*65.4*/("""
	"""),format.raw/*66.2*/("""</div>
</div>

<div class = "container-fluid">
		"""),_display_(/*70.4*/content),format.raw/*70.11*/("""
	"""),format.raw/*71.2*/("""</div>

	<div class="row">
		<div class="col-sm-12">
			<div class="well footer">
					<p class="text-center">© Copyright 2019, Crux.com</p>
			</div>
		</div>
	</div>
</div>

	<script src =""""),_display_(/*82.17*/routes/*82.23*/.Assets.versioned("javascripts/main.js")),format.raw/*82.63*/(""""></script>
 </body>
  </html>"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:18:41 BST 2019
                  SOURCE: C:/Users/Gabriel/Year%202%20Project/app/views/main.scala.html
                  HASH: a36fdcbfcba51ce250eacf0d6af7999d3c070a47
                  MATRIX: 970->1|1121->57|1149->59|1444->328|1458->334|1520->376|1646->474|1675->475|1704->476|1790->534|1819->535|1853->542|1892->553|1921->554|1950->555|2017->594|2046->595|2080->602|2119->613|2148->614|2177->615|2249->659|2278->660|2309->664|2346->673|2375->674|2404->675|2443->686|2472->687|2506->694|2557->718|2586->726|2941->1054|2971->1075|3011->1077|3058->1093|3096->1104|3111->1110|3156->1134|3209->1160|3242->1184|3282->1186|3329->1202|3367->1213|3382->1219|3428->1244|3484->1273|3516->1296|3556->1298|3603->1314|3641->1325|3656->1331|3701->1355|3756->1383|3793->1411|3833->1413|3880->1429|3918->1440|3933->1446|3986->1477|4046->1510|4076->1531|4116->1533|4163->1549|4201->1560|4216->1566|4259->1588|4307->1610|4374->1668|4414->1670|4447->1676|4479->1681|4510->1703|4550->1705|4597->1721|4635->1732|4650->1738|4694->1761|4751->1788|4783->1793|4874->1857|4899->1873|4939->1875|4978->1886|5039->1919|5068->1920|5111->1935|5140->1936|5178->1947|5193->1953|5238->1976|5329->2039|5358->2040|5401->2055|5430->2056|5468->2067|5483->2073|5548->2116|5607->2156|5620->2160|5659->2161|5698->2172|5758->2204|5787->2205|5830->2220|5859->2221|5897->2232|5912->2238|5955->2260|6045->2322|6074->2323|6117->2338|6146->2339|6184->2350|6199->2356|6250->2385|6344->2448|6381->2458|6465->2583|6496->2588|6537->2620|6577->2622|6608->2626|6673->2665|6687->2670|6723->2685|6758->2690|6788->2693|6868->2747|6896->2754|6926->2757|7156->2960|7171->2966|7232->3006
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|49->17|50->18|50->18|64->32|64->32|64->32|64->32|64->32|64->32|64->32|65->33|65->33|65->33|65->33|65->33|65->33|65->33|66->34|66->34|66->34|66->34|66->34|66->34|66->34|67->35|67->35|67->35|67->35|67->35|67->35|67->35|68->36|68->36|68->36|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|72->40|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|77->45|77->45|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|80->48|80->48|80->48|80->48|80->48|81->49|81->49|81->49|81->49|81->49|81->49|81->49|86->54|88->56|93->61|94->62|94->62|94->62|95->63|96->64|96->64|96->64|97->65|98->66|102->70|102->70|103->71|114->82|114->82|114->82
                  -- GENERATED --
              */
          