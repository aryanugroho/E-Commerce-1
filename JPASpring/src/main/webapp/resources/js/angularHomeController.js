var app = angular.module('webapp', []);

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
	
	var init = function() {
		$scope.categories = $scope.getProductCategories();
	};
	
	init();

});