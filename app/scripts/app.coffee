angular.module("timeupApp", ['ngResource',
                              'ngRoute',
                              'ngAnimate',
                              'ngTouch',
                              'timer'])

  .config ($routeProvider, $locationProvider) ->
    $routeProvider
      .when "/welcome",
        templateUrl: "views/welcome.html"
        controller: "WelcomeCtrl"

      .when "/articles",
        templateUrl: "views/articles.html"
        controller: "ArticlesCtrl"

      .when "/settings",
        templateUrl: "views/settings.html"
        controller: "SettingsCtrl"

      .when "/completed",
        templateUrl: "views/completed.html"

      .otherwise redirectTo: "/welcome"
