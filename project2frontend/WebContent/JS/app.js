var app=angular.module('myApp',[]);

app.controller('ctrl',function ($scope,$http,$window,$location)
{
var url = "http://"+$window.location.host+"/prjt2backend";	

$scope.add=function reg()
{
	alert ("function");
	$http.post(url+'/register/'+$scope.username_2+'/'+$scope.email_2+'/'+$scope.password_2+'/'+$scope.confirmpassword_2+'/'+$scope.phno_2).success(function(data)
{
		
alert("controller");
});
}

})


var app = angular.module('login',[])
app.controller('logctrl',function ($scope,$http)
		{
	$scope.log = function log(){
		
		$http.post(url+'/login/'+$scope.username_2+'/'+$scope.password_2).success(function(data)
	
				{
			
			alert("controller");
			});
	
		

		}


})