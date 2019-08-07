// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/conf/routes
// @DATE:Wed Jul 17 11:29:59 GFT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def inserirProduto(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "inserir")
    }
  
    // @LINE:18
    def decrementar(produto:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "decrementar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("produto", produto)))
    }
  
    // @LINE:17
    def incrementar(produto:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "incrementar/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("produto", produto)))
    }
  
    // @LINE:10
    def inserir(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "inserir")
    }
  
    // @LINE:15
    def remover(produto:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remover/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("produto", produto)))
    }
  
    // @LINE:8
    def listar(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
