  var app = angular.module('blogApp',[]);
  
  app.controller('BlogController',function($scope,$http,$location,$window)
		  {
    
   {
	   var url2 = "http://"+$window.location.host+"/prjt2backend";		  
	   $scope.blogsubmit = function()
	   {
		   
		   $http.post(url2+'/blogadd').success(function(data)
				 
		   {
			  alert("blog"); 
			   
		   })
		   
		   
	   }
	   
   }
      
  })
 
