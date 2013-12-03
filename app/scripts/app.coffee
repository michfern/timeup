angular.module("timeupApp", ['ngResource',
                              'ngRoute',
                              'ngAnimate',
                              'timer'])
  .config ($routeProvider, $locationProvider) ->

    # $locationProvider.html5Mode(true)
    homePath = "/"

    $routeProvider
      .when homePath,
        templateUrl: "views/welcome.html"
        controller: "MainCtrl"

      .when "/articles",
        templateUrl: "views/articles.html"
        controller: "ArticlesCtrl"

      .when "/settings",
        templateUrl: "views/settings.html"
        controller: "SettingsCtrl"


      .otherwise redirectTo: "/"
