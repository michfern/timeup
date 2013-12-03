angular.module("timeupApp", ['ngResource',
                              'ngRoute',
                              'ngSanitize'])
  .config ($routeProvider) ->

    $routeProvider
      .when "/",
        templateUrl: "views/main.html"
        controller: "MainCtrl"

      .when "/articles",
        templateUrl: "views/articles.html"
        # controller: "ArticlesCtrl"

      .when "/settings",
        templateUrl: "views/settings.html"


      .otherwise redirectTo: "/"
