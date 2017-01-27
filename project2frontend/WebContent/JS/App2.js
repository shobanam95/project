var app=angular.module('register',[]);

app.controller('regctrl',function ($scope,$http,$window,$location)
{
var url1 = "http://"+$window.location.host+"/prjt2backend";	

$scope.reg=function reg()
{

	

	$http.post(url1+'/register/'+$scope.username_2+'/'+$scope.email_2+'/'+$scope.password_2+'/'+$scope.confirmpassword_2+'/'+$scope.phno_2).success(function(data)
{
alert("registered successfully");		
{
	 $window.location.href = "http://localhost:8082/project2frontend/loginform.html";


}
	
}).error(function()
{
		   $window.alert("wrong username and password");
});

}

})

