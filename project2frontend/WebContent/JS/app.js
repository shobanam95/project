var app=angular.module('myApp',[]);

app.controller('ctrl',function ($scope,$http,$window,$location)
{
var url1 = "http://"+$window.location.host+"/prjt2backend";	

$scope.reg=function reg()
{
	alert ("function");
	

	$http.post(url1+'/register/'+$scope.username_2+'/'+$scope.email_2+'/'+$scope.password_2+'/'+$scope.confirmpassword_2+'/'+$scope.phno_2).success(function(data)
{
		
alert("controller");
});
}

})




