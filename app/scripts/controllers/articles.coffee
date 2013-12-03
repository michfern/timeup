angular.module("timeupApp")
  .controller "ArticlesCtrl", ($scope, Articles) ->

    $scope.articles = Articles.articles()

