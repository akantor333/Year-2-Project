// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Gabriel/Year%202%20Project/conf/routes
// @DATE:Sun Apr 28 21:18:40 BST 2019


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
