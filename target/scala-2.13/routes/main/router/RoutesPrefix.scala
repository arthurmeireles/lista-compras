// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Administrador/Desktop/Prova-recuperaco/questao-2/conf/routes
// @DATE:Wed Jul 17 11:29:59 GFT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
