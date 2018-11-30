 app = angular.module('app', []);

app.controller('getController', ($scope, $http, $location) =>{
	$scope.getAllUsers = function(){
		var url = "/todos";
		
		$http.get(url).then((response) => {
			$scope.todos = response.data;
		}, (response) => {
			$scope.getErrMsg = "Error Status: " +  response.statusText;
		});
	}
	
	
	
	
});

app.controller('postController', ($scope, $http, $location) => {
	$scope.submitAddForm = function(){
		var url = "/todos";
		
		var config = {
                headers : {
                    'Accept': 'application/json'
                }
        }
		var data = {
            name: $scope.itemname,
            note: $scope.note
        };
		
		
		$http.post(url, JSON.stringify(data), config).then((response) => {
			$scope.todos= response.data;
		}, (response) => {
			$scope.postErrMsg = "Error Status: " +  response.statusText;
		});
		
		// reset data fields
		$scope.itemname = "";
		$scope.note = "";
	}
})