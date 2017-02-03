var app = angular.module('webapp', []);

app.controller('userController', function($scope, $http) {
	
	$scope.getUserList = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/user/getuserlist'
		}).success(function(data, status, headers, config) {
			$scope.users = data;
		}).error(function(data, status, headers, config) {

		});

	};
	
	var init = function() {
		$scope.users = $scope.getUserList();
	};
	init();
	
	
	$scope.user = {
		name : '',
		lastname : '',
		email : ''
	};

	$scope.final = {
		name : undefined,
		lastname : undefined,
		email : undefined
	};

	$scope.isValid = false;
	$scope.showRes = false;

	$scope.buttonDisable = function() {
		$scope.checkValid();
		if ($scope.isValid)
			return true;
		else
			return false;
	}

	$scope.checkValid = function() {
		$scope.isValid = true;
		console.log($scope.user);
		angular.forEach($scope.user, function(value) {
			console.log(value);
			if (value == undefined || value == '')
				$scope.isValid = false;
		});
	}

	$scope.print = function() {
		$scope.final = angular.copy($scope.user);
	};

	$scope.reset = function() {
		$scope.user = {
			name : '',
			lastname : '',
			email : ''
		};
		console.log($scope.user);
		$scope.isValid = false;
	};
});

app.controller('cartController', function($scope, $http) {
	
	$scope.getCartList = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/portal/cart/getcartlist'
		}).success(function(data, status, headers, config) {
			$scope.carts = data;
			console.log($scope.carts);
		}).error(function(data, status, headers, config) {

		});

	};
	
	var init = function() {
		$scope.carts = $scope.getCartList();
	};
	init();
});