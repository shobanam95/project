
var app=angular.module("myApp",['ngRoute']); 

app.controller('ctrl',function($scope,$http,$route,$location,$window)
		
		{
	var url1 = "http://"+$window.location.host+"/prjt2backend";	
        
        

	           $scope.log=function log()
	{
      
               $http.post(url1+'/log').success(function(data)
	{
		     
	     
	    
	   {
		   
		   $window.location.href = "http://localhost:8082/project2frontend/check.html";
	   }
       
         console.log(data);
	
      }).error(function()
	{
    	  
			   $window.alert("wrong username and password");
	});
	}
	
	
    
	           
	
   
	});
	  

          app.config(function($routeProvider){
		  $routeProvider.when("/log",{templateUrl: "loginform.html"})
		  $routeProvider.when("/register",{templateUrl:"regform.html"})
		  $routeProvider.when("/index",{templateUrl: "index.html"});
	});


