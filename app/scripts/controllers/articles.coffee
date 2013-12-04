angular.module("timeupApp")
  .controller "ArticlesCtrl", ($scope, Articles) ->

    # $scope.slides = Articles.articles()
    $scope.slides = Articles.get()

    $scope.direction = "left"
    $scope.currentIndex = 0
    $scope.setCurrentSlideIndex = (index) ->
      $scope.direction = (if (index > $scope.currentIndex) then "left" else "right")
      $scope.currentIndex = index

    $scope.isCurrentSlideIndex = (index) ->
      $scope.currentIndex is index

    $scope.prevSlide = ->
      $scope.direction = "left"
      $scope.currentIndex = (if ($scope.currentIndex < $scope.slides.length - 1) then ++$scope.currentIndex else 0)

    $scope.nextSlide = ->
      console.log $scope.slides.length
      $scope.direction = "right"
      $scope.currentIndex = (if ($scope.currentIndex > 0) then --$scope.currentIndex else $scope.slides.length - 1)

  .animation ".slide-animation", ->
    addClass: (element, className, done) ->
      scope = element.scope()
      if className is "ng-hide"
        finishPoint = element.parent().width()
        finishPoint = -finishPoint  if scope.direction isnt "right"
        TweenMax.to element, 0.5,
          left: finishPoint
          onComplete: done
      else
        done()

    removeClass: (element, className, done) ->
      scope = element.scope()
      if className is "ng-hide"
        element.removeClass "ng-hide"
        startPoint = element.parent().width()
        startPoint = -startPoint  if scope.direction is "right"
        TweenMax.set element,
          left: startPoint
        TweenMax.to element, 0.5,
          left: 0
          onComplete: done
      else
        done()

