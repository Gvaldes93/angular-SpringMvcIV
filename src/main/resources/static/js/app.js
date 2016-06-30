var app = angular.module('books', [ "ngResource" ]);

app.controller('BookController', [ '$scope', '$http',	function($scope, $http) {
    $scope.images=[];
    $scope.imageURLToAdd;
    $scope.imageURL;

    $scope.addImage= function(image){
      this.images.push(image);
    }
    $scope.removeImage= function(image){
       $scope.items.splice(image, 1);
    }

    $scope.imageShown=function(image){
      $scope.imageURL=image;
    }

		$scope.getBooks = function() {

			$http.get('/books').success(function(data) {
				$scope.books = data;
			});
		}


		$scope.addBook = function() {
			$http.post('/books',
				{
					isbn : $scope.isbn,
					title : $scope.title,
					year : $scope.year,
          images: $scope.images
				}
			).success(function(data) {
				$scope.msg = 'Book added correctly';
				$scope.getBooks();

			}).error(function(data, status, headers, config){
        	$scope.msg =  {data: data, status: status, headers: headers, config: config};

			});
		}
}
 ]);
