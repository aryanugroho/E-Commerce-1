var app = angular.module('myApp', []);

app.controller('homeController', function($scope, $http) {

	// Gets list of different product categories from DB.

	$scope.getProductCategories = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/getproductcategories'
		}).success(function(data, status, headers, config) {
			$scope.categories = data;
		}).error(function(data, status, headers, config) {

		});

	};

	// Gets product list from DB.
	
	$scope.getProductList = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/getproductlist'
		}).success(function(data, status, headers, config) {
			$scope.products = data;
		}).error(function(data, status, headers, config) {

		});

	};

	var init = function() {
		$scope.categories = $scope.getProductCategories();
		$scope.products = $scope.getProductList();
	};

	init();

});

app.controller('cartController', function($scope, $http) {

	$scope.getCartList = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/getcartlist'
		}).success(function(data, status, headers, config) {
			$scope.carts = data;
			console.log(data,status,headers,config);
		}).error(function(data, status, headers, config) {

		});

	};

	var init = function() {
		$scope.carts = $scope.getCartList();
	};

	init();

});