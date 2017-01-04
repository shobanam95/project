var app=angular.module('myApp',[]);

app.controller('ctrl',function ($scope,$http,$window,$location)
{
var url = "http://"+$window.location.host+"/prjt2backend";	

$scope.add=function()
{
	$http.post(url+'/register/'+$scope.username_2).success(function(data)
{
		$log.log(data);

});
}




})