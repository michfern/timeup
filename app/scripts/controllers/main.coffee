angular.module("timeupApp")
  .controller "MainCtrl", ($route, $scope) ->

    $scope.bulletPoints = [
      "Automated summation for bite-size reading",
      "No repeat content",
      "Reduce information overload",
      "Entry summation based on your reading speed"
    ]
