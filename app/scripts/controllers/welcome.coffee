angular.module('timeupApp')
  .controller 'WelcomeCtrl', ($scope) ->

    $scope.bulletPoints = [
      "Automated summation based on your reading speed",
      "No repeat content",
      "Reduce information overload",
    ]
