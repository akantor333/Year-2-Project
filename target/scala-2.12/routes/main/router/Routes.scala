// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Gabriel/Year%202%20Project/conf/routes
// @DATE:Sun Apr 28 21:18:40 BST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:14
  ShoppingCtrl_3: controllers.ShoppingCtrl,
  // @LINE:31
  LoginController_5: controllers.LoginController,
  // @LINE:43
  CountController_0: controllers.CountController,
  // @LINE:45
  AsyncController_2: controllers.AsyncController,
  // @LINE:48
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:14
    ShoppingCtrl_3: controllers.ShoppingCtrl,
    // @LINE:31
    LoginController_5: controllers.LoginController,
    // @LINE:43
    CountController_0: controllers.CountController,
    // @LINE:45
    AsyncController_2: controllers.AsyncController,
    // @LINE:48
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, ShoppingCtrl_3, LoginController_5, CountController_0, AsyncController_2, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ShoppingCtrl_3, LoginController_5, CountController_0, AsyncController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.works(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """curated""", """controllers.HomeController.curated"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """drafts""", """controllers.HomeController.drafts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shop""", """controllers.HomeController.shop(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPhys""", """controllers.HomeController.addPhys"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPhysSubmit""", """controllers.HomeController.addPhysSubmit(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteBook/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteBook(id:Long, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateBook/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateBook(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long, pid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addSubmission""", """controllers.HomeController.addSubmission"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/""" + "$" + """uid<[^/]+>""", """controllers.HomeController.profile(uid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBioSubmit/""" + "$" + """uid<[^/]+>""", """controllers.HomeController.addBioSubmit(uid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addSubmissionSubmit""", """controllers.HomeController.addSubmissionSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDonationSubmit/""" + "$" + """id<[^/]+>/""" + "$" + """uid<[^/]+>""", """controllers.HomeController.addDonationSubmit(id:Long, uid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fullWork/""" + "$" + """id<[^/]+>""", """controllers.HomeController.fullWork(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToCurated/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCurated(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToPublished/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToPublished(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.LoginController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.LoginController.registerUserSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upvote/""" + "$" + """id<[^/]+>/""" + "$" + """username<[^/]+>""", """controllers.HomeController.upvote(id:Long, username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downvote/""" + "$" + """id<[^/]+>/""" + "$" + """username<[^/]+>""", """controllers.HomeController.downvote(id:Long, username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCommentSubmit/""" + "$" + """wid<[^/]+>""", """controllers.HomeController.addCommentSubmit(wid:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteComment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteComment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.HomeController.users"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_works0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_works0_invoker = createInvoker(
    HomeController_1.works(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "works",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_curated1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("curated")))
  )
  private[this] lazy val controllers_HomeController_curated1_invoker = createInvoker(
    HomeController_1.curated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "curated",
      Nil,
      "GET",
      this.prefix + """curated""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_drafts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("drafts")))
  )
  private[this] lazy val controllers_HomeController_drafts2_invoker = createInvoker(
    HomeController_1.drafts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "drafts",
      Nil,
      "GET",
      this.prefix + """drafts""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_shop3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shop")))
  )
  private[this] lazy val controllers_HomeController_shop3_invoker = createInvoker(
    HomeController_1.shop(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "shop",
      Seq(classOf[String]),
      "GET",
      this.prefix + """shop""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addPhys4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPhys")))
  )
  private[this] lazy val controllers_HomeController_addPhys4_invoker = createInvoker(
    HomeController_1.addPhys,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPhys",
      Nil,
      "GET",
      this.prefix + """addPhys""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addPhysSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPhysSubmit")))
  )
  private[this] lazy val controllers_HomeController_addPhysSubmit5_invoker = createInvoker(
    HomeController_1.addPhysSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPhysSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addPhysSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_deleteBook6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteBook6_invoker = createInvoker(
    HomeController_1.deleteBook(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteBook",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """deleteBook/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_updateBook7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateBook7_invoker = createInvoker(
    HomeController_1.updateBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateBook",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateBook/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_invoker = createInvoker(
    ShoppingCtrl_3.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_invoker = createInvoker(
    ShoppingCtrl_3.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingCtrl_addOne10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne10_invoker = createInvoker(
    ShoppingCtrl_3.addOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_invoker = createInvoker(
    ShoppingCtrl_3.removeOne(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_invoker = createInvoker(
    ShoppingCtrl_3.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_invoker = createInvoker(
    ShoppingCtrl_3.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_invoker = createInvoker(
    ShoppingCtrl_3.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_addSubmission15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addSubmission")))
  )
  private[this] lazy val controllers_HomeController_addSubmission15_invoker = createInvoker(
    HomeController_1.addSubmission,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addSubmission",
      Nil,
      "GET",
      this.prefix + """addSubmission""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_profile16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_profile16_invoker = createInvoker(
    HomeController_1.profile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """profile/""" + "$" + """uid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_addBioSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBioSubmit/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addBioSubmit17_invoker = createInvoker(
    HomeController_1.addBioSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addBioSubmit",
      Seq(classOf[String]),
      "POST",
      this.prefix + """addBioSubmit/""" + "$" + """uid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_addSubmissionSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addSubmissionSubmit")))
  )
  private[this] lazy val controllers_HomeController_addSubmissionSubmit18_invoker = createInvoker(
    HomeController_1.addSubmissionSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addSubmissionSubmit",
      Nil,
      "POST",
      this.prefix + """addSubmissionSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_addDonationSubmit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDonationSubmit/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addDonationSubmit19_invoker = createInvoker(
    HomeController_1.addDonationSubmit(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDonationSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """addDonationSubmit/""" + "$" + """id<[^/]+>/""" + "$" + """uid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_deleteItem20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteItem20_invoker = createInvoker(
    HomeController_1.deleteItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_updateItem21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateItem21_invoker = createInvoker(
    HomeController_1.updateItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_fullWork22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fullWork/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_fullWork22_invoker = createInvoker(
    HomeController_1.fullWork(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "fullWork",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """fullWork/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_addToCurated23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToCurated/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCurated23_invoker = createInvoker(
    HomeController_1.addToCurated(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCurated",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToCurated/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_addToPublished24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToPublished/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToPublished24_invoker = createInvoker(
    HomeController_1.addToPublished(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToPublished",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      this.prefix + """addToPublished/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LoginController_registerUser25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_LoginController_registerUser25_invoker = createInvoker(
    LoginController_5.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LoginController_registerUserSubmit26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_LoginController_registerUserSubmit26_invoker = createInvoker(
    LoginController_5.registerUserSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_upvote27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upvote/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_upvote27_invoker = createInvoker(
    HomeController_1.upvote(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "upvote",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """upvote/""" + "$" + """id<[^/]+>/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_downvote28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downvote/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_downvote28_invoker = createInvoker(
    HomeController_1.downvote(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "downvote",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """downvote/""" + "$" + """id<[^/]+>/""" + "$" + """username<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_LoginController_login29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login29_invoker = createInvoker(
    LoginController_5.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_LoginController_loginSubmit30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit30_invoker = createInvoker(
    LoginController_5.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_addCommentSubmit31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCommentSubmit/"), DynamicPart("wid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addCommentSubmit31_invoker = createInvoker(
    HomeController_1.addCommentSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCommentSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """addCommentSubmit/""" + "$" + """wid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_deleteComment32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteComment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteComment32_invoker = createInvoker(
    HomeController_1.deleteComment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteComment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteComment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_users33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_users33_invoker = createInvoker(
    HomeController_1.users,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "users",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LoginController_logout34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout34_invoker = createInvoker(
    LoginController_5.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CountController_count35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count35_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AsyncController_message36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message36_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Assets_versioned37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned37_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_works0_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_works0_invoker.call(HomeController_1.works(cat, filter))
      }
  
    // @LINE:7
    case controllers_HomeController_curated1_route(params@_) =>
      call { 
        controllers_HomeController_curated1_invoker.call(HomeController_1.curated)
      }
  
    // @LINE:8
    case controllers_HomeController_drafts2_route(params@_) =>
      call { 
        controllers_HomeController_drafts2_invoker.call(HomeController_1.drafts)
      }
  
    // @LINE:9
    case controllers_HomeController_shop3_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_HomeController_shop3_invoker.call(HomeController_1.shop(filter))
      }
  
    // @LINE:10
    case controllers_HomeController_addPhys4_route(params@_) =>
      call { 
        controllers_HomeController_addPhys4_invoker.call(HomeController_1.addPhys)
      }
  
    // @LINE:11
    case controllers_HomeController_addPhysSubmit5_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_HomeController_addPhysSubmit5_invoker.call(HomeController_1.addPhysSubmit(filter))
      }
  
    // @LINE:12
    case controllers_HomeController_deleteBook6_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_HomeController_deleteBook6_invoker.call(HomeController_1.deleteBook(id, filter))
      }
  
    // @LINE:13
    case controllers_HomeController_updateBook7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateBook7_invoker.call(HomeController_1.updateBook(id))
      }
  
    // @LINE:14
    case controllers_ShoppingCtrl_showBasket8_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket8_invoker.call(ShoppingCtrl_3.showBasket())
      }
  
    // @LINE:15
    case controllers_ShoppingCtrl_addToBasket9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket9_invoker.call(ShoppingCtrl_3.addToBasket(id))
      }
  
    // @LINE:16
    case controllers_ShoppingCtrl_addOne10_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_addOne10_invoker.call(ShoppingCtrl_3.addOne(itemId, pid))
      }
  
    // @LINE:17
    case controllers_ShoppingCtrl_removeOne11_route(params@_) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("pid", None)) { (itemId, pid) =>
        controllers_ShoppingCtrl_removeOne11_invoker.call(ShoppingCtrl_3.removeOne(itemId, pid))
      }
  
    // @LINE:18
    case controllers_ShoppingCtrl_emptyBasket12_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket12_invoker.call(ShoppingCtrl_3.emptyBasket())
      }
  
    // @LINE:19
    case controllers_ShoppingCtrl_placeOrder13_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder13_invoker.call(ShoppingCtrl_3.placeOrder())
      }
  
    // @LINE:20
    case controllers_ShoppingCtrl_viewOrder14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder14_invoker.call(ShoppingCtrl_3.viewOrder(id))
      }
  
    // @LINE:21
    case controllers_HomeController_addSubmission15_route(params@_) =>
      call { 
        controllers_HomeController_addSubmission15_invoker.call(HomeController_1.addSubmission)
      }
  
    // @LINE:22
    case controllers_HomeController_profile16_route(params@_) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_HomeController_profile16_invoker.call(HomeController_1.profile(uid))
      }
  
    // @LINE:23
    case controllers_HomeController_addBioSubmit17_route(params@_) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_HomeController_addBioSubmit17_invoker.call(HomeController_1.addBioSubmit(uid))
      }
  
    // @LINE:24
    case controllers_HomeController_addSubmissionSubmit18_route(params@_) =>
      call { 
        controllers_HomeController_addSubmissionSubmit18_invoker.call(HomeController_1.addSubmissionSubmit)
      }
  
    // @LINE:25
    case controllers_HomeController_addDonationSubmit19_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("uid", None)) { (id, uid) =>
        controllers_HomeController_addDonationSubmit19_invoker.call(HomeController_1.addDonationSubmit(id, uid))
      }
  
    // @LINE:26
    case controllers_HomeController_deleteItem20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteItem20_invoker.call(HomeController_1.deleteItem(id))
      }
  
    // @LINE:27
    case controllers_HomeController_updateItem21_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateItem21_invoker.call(HomeController_1.updateItem(id))
      }
  
    // @LINE:28
    case controllers_HomeController_fullWork22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_fullWork22_invoker.call(HomeController_1.fullWork(id))
      }
  
    // @LINE:29
    case controllers_HomeController_addToCurated23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_addToCurated23_invoker.call(HomeController_1.addToCurated(id))
      }
  
    // @LINE:30
    case controllers_HomeController_addToPublished24_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_HomeController_addToPublished24_invoker.call(HomeController_1.addToPublished(id, cat, filter))
      }
  
    // @LINE:31
    case controllers_LoginController_registerUser25_route(params@_) =>
      call { 
        controllers_LoginController_registerUser25_invoker.call(LoginController_5.registerUser)
      }
  
    // @LINE:32
    case controllers_LoginController_registerUserSubmit26_route(params@_) =>
      call { 
        controllers_LoginController_registerUserSubmit26_invoker.call(LoginController_5.registerUserSubmit())
      }
  
    // @LINE:33
    case controllers_HomeController_upvote27_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
        controllers_HomeController_upvote27_invoker.call(HomeController_1.upvote(id, username))
      }
  
    // @LINE:34
    case controllers_HomeController_downvote28_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
        controllers_HomeController_downvote28_invoker.call(HomeController_1.downvote(id, username))
      }
  
    // @LINE:35
    case controllers_LoginController_login29_route(params@_) =>
      call { 
        controllers_LoginController_login29_invoker.call(LoginController_5.login)
      }
  
    // @LINE:36
    case controllers_LoginController_loginSubmit30_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit30_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:37
    case controllers_HomeController_addCommentSubmit31_route(params@_) =>
      call(params.fromPath[Long]("wid", None)) { (wid) =>
        controllers_HomeController_addCommentSubmit31_invoker.call(HomeController_1.addCommentSubmit(wid))
      }
  
    // @LINE:38
    case controllers_HomeController_deleteComment32_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteComment32_invoker.call(HomeController_1.deleteComment(id))
      }
  
    // @LINE:39
    case controllers_HomeController_users33_route(params@_) =>
      call { 
        controllers_HomeController_users33_invoker.call(HomeController_1.users)
      }
  
    // @LINE:41
    case controllers_LoginController_logout34_route(params@_) =>
      call { 
        controllers_LoginController_logout34_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:43
    case controllers_CountController_count35_route(params@_) =>
      call { 
        controllers_CountController_count35_invoker.call(CountController_0.count)
      }
  
    // @LINE:45
    case controllers_AsyncController_message36_route(params@_) =>
      call { 
        controllers_AsyncController_message36_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:48
    case controllers_Assets_versioned37_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned37_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
