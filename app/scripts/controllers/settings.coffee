angular.module("timeupApp")
  .controller "SettingsCtrl", ($scope) ->

    $scope.addSource = ->
      $scope.sources.push($scope.settings.newSource)
      $scope.settings.newSource

    $scope.timelimits = [
      "8 Minutes",
      "6 Minutes"
    ]

    $scope.sources = [
      "http://www.huffingtonpost.com",
      "http://www.aol.com"
    ]
