var app = angular.module('login',[])
app.controller('logctrl',function ($scope,$http,$window,$location)
		{
	alert("entering");
	var url1 = "http://"+$window.location.host+"/prjt2backend";	
	$scope.log = function log(){
		alert("Controller");
		$http.post(url1+'/login/'+$scope.username_2+'/'+$scope.password_2).success(function(data)
	
				{
			
			alert("controller");
			});
	
		

		}


})