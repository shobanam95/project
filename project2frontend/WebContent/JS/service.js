app.factory('service',function($http){
	var userService=this;
	var BASE_URL="http://localhost:8001/prjt2backend/"
	userService.authenticate=function(add){
		return $http.post(BASE_URL + "/register",user);
	}
	return userService;
})

//var app=angular.module("myApp",['ngRoute'])
//app.config(function($routeProvider){
	//console.log('entering configuration')
	//$routeProvider
	//.when('/register',{
		//controller:'Controller2',
		//templateUrl:'/register.html'
	//})
	
//})
