// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/conf/routes
// @DATE:Wed Jul 17 11:29:59 GFT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  HomeController_1: controllers.HomeController,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    HomeController_1: controllers.HomeController,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.listar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inserir""", """controllers.HomeController.inserir"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """inserir""", """controllers.HomeController.inserirProduto"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remover/""" + "$" + """produto<[^/]+>""", """controllers.HomeController.remover(produto:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """incrementar/""" + "$" + """produto<[^/]+>""", """controllers.HomeController.incrementar(produto:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """decrementar/""" + "$" + """produto<[^/]+>""", """controllers.HomeController.decrementar(produto:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_HomeController_listar0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_listar0_invoker = createInvoker(
    HomeController_1.listar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listar",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_inserir1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inserir")))
  )
  private[this] lazy val controllers_HomeController_inserir1_invoker = createInvoker(
    HomeController_1.inserir,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "inserir",
      Nil,
      "GET",
      this.prefix + """inserir""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_inserirProduto2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("inserir")))
  )
  private[this] lazy val controllers_HomeController_inserirProduto2_invoker = createInvoker(
    HomeController_1.inserirProduto,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "inserirProduto",
      Nil,
      "POST",
      this.prefix + """inserir""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_remover3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remover/"), DynamicPart("produto", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_remover3_invoker = createInvoker(
    HomeController_1.remover(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "remover",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """remover/""" + "$" + """produto<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_incrementar4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("incrementar/"), DynamicPart("produto", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_incrementar4_invoker = createInvoker(
    HomeController_1.incrementar(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "incrementar",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """incrementar/""" + "$" + """produto<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_decrementar5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("decrementar/"), DynamicPart("produto", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_decrementar5_invoker = createInvoker(
    HomeController_1.decrementar(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "decrementar",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """decrementar/""" + "$" + """produto<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:8
    case controllers_HomeController_listar0_route(params@_) =>
      call { 
        controllers_HomeController_listar0_invoker.call(HomeController_1.listar)
      }
  
    // @LINE:10
    case controllers_HomeController_inserir1_route(params@_) =>
      call { 
        controllers_HomeController_inserir1_invoker.call(HomeController_1.inserir)
      }
  
    // @LINE:13
    case controllers_HomeController_inserirProduto2_route(params@_) =>
      call { 
        controllers_HomeController_inserirProduto2_invoker.call(HomeController_1.inserirProduto)
      }
  
    // @LINE:15
    case controllers_HomeController_remover3_route(params@_) =>
      call(params.fromPath[Int]("produto", None)) { (produto) =>
        controllers_HomeController_remover3_invoker.call(HomeController_1.remover(produto))
      }
  
    // @LINE:17
    case controllers_HomeController_incrementar4_route(params@_) =>
      call(params.fromPath[Int]("produto", None)) { (produto) =>
        controllers_HomeController_incrementar4_invoker.call(HomeController_1.incrementar(produto))
      }
  
    // @LINE:18
    case controllers_HomeController_decrementar5_route(params@_) =>
      call(params.fromPath[Int]("produto", None)) { (produto) =>
        controllers_HomeController_decrementar5_invoker.call(HomeController_1.decrementar(produto))
      }
  
    // @LINE:21
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
