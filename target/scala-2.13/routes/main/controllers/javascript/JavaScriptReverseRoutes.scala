// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/conf/routes
// @DATE:Wed Jul 17 11:29:59 GFT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def inserirProduto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.inserirProduto",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "inserir"})
        }
      """
    )
  
    // @LINE:18
    def decrementar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.decrementar",
      """
        function(produto0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "decrementar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("produto", produto0))})
        }
      """
    )
  
    // @LINE:17
    def incrementar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.incrementar",
      """
        function(produto0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "incrementar/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("produto", produto0))})
        }
      """
    )
  
    // @LINE:10
    def inserir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.inserir",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inserir"})
        }
      """
    )
  
    // @LINE:15
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.remover",
      """
        function(produto0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remover/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("produto", produto0))})
        }
      """
    )
  
    // @LINE:8
    def listar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.listar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
