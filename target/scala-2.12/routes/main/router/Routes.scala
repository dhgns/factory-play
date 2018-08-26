
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Delfin/eclipse-workspace/Recambios/conf/routes
// @DATE:Sun Aug 26 20:43:50 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_5: controllers.Assets,
  // @LINE:20
  FactoryController_4: controllers.FactoryController,
  // @LINE:29
  DataBaseController_0: controllers.DataBaseController,
  // @LINE:32
  TagsController_6: controllers.TagsController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_5: controllers.Assets,
    // @LINE:20
    FactoryController_4: controllers.FactoryController,
    // @LINE:29
    DataBaseController_0: controllers.DataBaseController,
    // @LINE:32
    TagsController_6: controllers.TagsController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, FactoryController_4, DataBaseController_0, TagsController_6, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, FactoryController_4, DataBaseController_0, TagsController_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """piece""", """controllers.FactoryController.addPiece"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """piece/""" + "$" + """name<[^/]+>""", """controllers.FactoryController.retrievePiece(name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """piece""", """controllers.FactoryController.updatePiece()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """piece""", """controllers.FactoryController.deletePiece()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pieces""", """controllers.FactoryController.getPieces"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pieces/""" + "$" + """tag<[^/]+>""", """controllers.FactoryController.findPiecesByTag(tag:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """db""", """controllers.DataBaseController.deleteDB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """db""", """controllers.DataBaseController.resetDB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag/""" + "$" + """tag<[^/]+>""", """controllers.TagsController.retrieveTag(tag:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.TagsController.addTag()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tags""", """controllers.TagsController.getTags()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
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

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
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

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:20
  private[this] lazy val controllers_FactoryController_addPiece4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("piece")))
  )
  private[this] lazy val controllers_FactoryController_addPiece4_invoker = createInvoker(
    FactoryController_4.addPiece,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "addPiece",
      Nil,
      "POST",
      this.prefix + """piece""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_FactoryController_retrievePiece5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("piece/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FactoryController_retrievePiece5_invoker = createInvoker(
    FactoryController_4.retrievePiece(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "retrievePiece",
      Seq(classOf[String]),
      "GET",
      this.prefix + """piece/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_FactoryController_updatePiece6_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("piece")))
  )
  private[this] lazy val controllers_FactoryController_updatePiece6_invoker = createInvoker(
    FactoryController_4.updatePiece(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "updatePiece",
      Nil,
      "PUT",
      this.prefix + """piece""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_FactoryController_deletePiece7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("piece")))
  )
  private[this] lazy val controllers_FactoryController_deletePiece7_invoker = createInvoker(
    FactoryController_4.deletePiece(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "deletePiece",
      Nil,
      "DELETE",
      this.prefix + """piece""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_FactoryController_getPieces8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pieces")))
  )
  private[this] lazy val controllers_FactoryController_getPieces8_invoker = createInvoker(
    FactoryController_4.getPieces,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "getPieces",
      Nil,
      "GET",
      this.prefix + """pieces""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_FactoryController_findPiecesByTag9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pieces/"), DynamicPart("tag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FactoryController_findPiecesByTag9_invoker = createInvoker(
    FactoryController_4.findPiecesByTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FactoryController",
      "findPiecesByTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """pieces/""" + "$" + """tag<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_DataBaseController_deleteDB10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("db")))
  )
  private[this] lazy val controllers_DataBaseController_deleteDB10_invoker = createInvoker(
    DataBaseController_0.deleteDB(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DataBaseController",
      "deleteDB",
      Nil,
      "DELETE",
      this.prefix + """db""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_DataBaseController_resetDB11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("db")))
  )
  private[this] lazy val controllers_DataBaseController_resetDB11_invoker = createInvoker(
    DataBaseController_0.resetDB(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DataBaseController",
      "resetDB",
      Nil,
      "GET",
      this.prefix + """db""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TagsController_retrieveTag12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag/"), DynamicPart("tag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TagsController_retrieveTag12_invoker = createInvoker(
    TagsController_6.retrieveTag(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagsController",
      "retrieveTag",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tag/""" + "$" + """tag<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_TagsController_addTag13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_TagsController_addTag13_invoker = createInvoker(
    TagsController_6.addTag(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagsController",
      "addTag",
      Nil,
      "POST",
      this.prefix + """tag""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TagsController_getTags14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tags")))
  )
  private[this] lazy val controllers_TagsController_getTags14_invoker = createInvoker(
    TagsController_6.getTags(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TagsController",
      "getTags",
      Nil,
      "GET",
      this.prefix + """tags""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:20
    case controllers_FactoryController_addPiece4_route(params@_) =>
      call { 
        controllers_FactoryController_addPiece4_invoker.call(FactoryController_4.addPiece)
      }
  
    // @LINE:21
    case controllers_FactoryController_retrievePiece5_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_FactoryController_retrievePiece5_invoker.call(FactoryController_4.retrievePiece(name))
      }
  
    // @LINE:22
    case controllers_FactoryController_updatePiece6_route(params@_) =>
      call { 
        controllers_FactoryController_updatePiece6_invoker.call(FactoryController_4.updatePiece())
      }
  
    // @LINE:23
    case controllers_FactoryController_deletePiece7_route(params@_) =>
      call { 
        controllers_FactoryController_deletePiece7_invoker.call(FactoryController_4.deletePiece())
      }
  
    // @LINE:26
    case controllers_FactoryController_getPieces8_route(params@_) =>
      call { 
        controllers_FactoryController_getPieces8_invoker.call(FactoryController_4.getPieces)
      }
  
    // @LINE:27
    case controllers_FactoryController_findPiecesByTag9_route(params@_) =>
      call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_FactoryController_findPiecesByTag9_invoker.call(FactoryController_4.findPiecesByTag(tag))
      }
  
    // @LINE:29
    case controllers_DataBaseController_deleteDB10_route(params@_) =>
      call { 
        controllers_DataBaseController_deleteDB10_invoker.call(DataBaseController_0.deleteDB())
      }
  
    // @LINE:30
    case controllers_DataBaseController_resetDB11_route(params@_) =>
      call { 
        controllers_DataBaseController_resetDB11_invoker.call(DataBaseController_0.resetDB())
      }
  
    // @LINE:32
    case controllers_TagsController_retrieveTag12_route(params@_) =>
      call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_TagsController_retrieveTag12_invoker.call(TagsController_6.retrieveTag(tag))
      }
  
    // @LINE:33
    case controllers_TagsController_addTag13_route(params@_) =>
      call { 
        controllers_TagsController_addTag13_invoker.call(TagsController_6.addTag())
      }
  
    // @LINE:34
    case controllers_TagsController_getTags14_route(params@_) =>
      call { 
        controllers_TagsController_getTags14_invoker.call(TagsController_6.getTags())
      }
  }
}
