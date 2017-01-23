var app = angular.module('login',['ngRoute'])

app.controller('logctrl',function ($scope,$http,$window,$location)
		{
	$scope.user={username_2:'',email_2:'',password_2:'',confirmpassword_2:'',phno_2:''};
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

app.controller('UserController',function($scope,$location,UserService){
	$scope.user={id:'',username:'',password:'',email:'',role:'',isOnline:'',enabled:''};
	$scope.message;
	$scope.submit=function(){
		console.log('Entering - submit function in usercontroller')
		UserService.authenticate($scope.user)
		.then(function(response){
			if(response.status==401)
				{
				  $scope.message="Invalid Username and Password";
				  $location.path("/login");
				}
			else{
				$scope.user=response.data;
				$location.path("/home");
			}
		})
	}
	
})
