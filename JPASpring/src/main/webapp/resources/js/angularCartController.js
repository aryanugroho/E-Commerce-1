var app = angular.module('myApp');

app.controller('cartController', function($scope, $http) {

	$scope.getCartList = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/getcartlist'
		}).success(function(data, status, headers, config) {
			$scope.carts = data;
		}).error(function(data, status, headers, config) {

		});

	};

	var init = function() {
		$scope.carts = $scope.getCartList();
		console.log($scope.carts);
	};

	init();

});