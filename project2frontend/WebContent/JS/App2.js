var app = angular.module('login',[])
app.controller('logctrl',function ($scope,$http,$window,$location)
		{
	alert("entering");
	var url = "http://"+$window.location.host+"/prjt2backend";		
	$scope.log = function login(){
		alert("Controller");
		$http.post(url+'/log/'+$scope.username_2+'/'+$scope.password_2).success(function(data)
	
				{
			
			alert("login controller");
			});
	
		

		}


})






