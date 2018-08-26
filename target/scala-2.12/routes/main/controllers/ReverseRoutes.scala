
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Delfin/eclipse-workspace/Recambios/conf/routes
// @DATE:Sun Aug 26 20:43:50 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:29
  class ReverseDataBaseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def deleteDB(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "db")
    }
  
    // @LINE:30
    def resetDB(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "db")
    }
  
  }

  // @LINE:20
  class ReverseFactoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def retrievePiece(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "piece/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:20
    def addPiece(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "piece")
    }
  
    // @LINE:26
    def getPieces(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pieces")
    }
  
    // @LINE:27
    def findPiecesByTag(tag:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pieces/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tag", tag)))
    }
  
    // @LINE:22
    def updatePiece(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "piece")
    }
  
    // @LINE:23
    def deletePiece(): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "piece")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:32
  class ReverseTagsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def addTag(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tag")
    }
  
    // @LINE:34
    def getTags(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tags")
    }
  
    // @LINE:32
    def retrieveTag(tag:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tag/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tag", tag)))
    }
  
  }


}
