app.controller('Controller2',function($scope,$location,service) {
    var obj = this;
   
    obj.user = new User2(); 
    obj.add = function(){
    	 console.log('Inside save');
    	    ob.user.save(function(user){
    		 console.log(user); 
    	    }
    	    );
    	  
    }	     
    });
