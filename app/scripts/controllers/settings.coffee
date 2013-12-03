angular.module("timeupApp")
  .controller "SettingsCtrl", ($scope) ->

    $scope.addSource = ->
      $scope.sources.push($scope.settings.newSource)
      $scope.settings.newSource

    $scope.sources = [
        "http://www.huffingtonpost.com",
        "http://www.aol.com"
      ]
