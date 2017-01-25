<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body data-ng-app="webapp">
	<div data-ng-controller="webappController">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img class="first-slide"
						src="http://www.jirehtech.com/wp-content/uploads/2012/09/tech_user_banner.jpg"
						alt="First slide">
					<div class="container">
						<div class="carousel-caption">
							<h1>Users.</h1>
							<p>A user's account allows a user to authenticate to a system
								and potentially to receive authorization to access resources
								provided by or connected to that system; however, authentication
								does not imply authorization.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="List" role="button">List
									Users</a>
							</p>
						</div>
					</div>
				</div>
				<div class="item">
					<img class="second-slide"
						src="http://www.incimages.com/uploaded_files/image/1940x900/1725x810_online_shopping_cart_19149.jpg"
						alt="Second slide" align="right">
					<div class="container">
						<div class="carousel-caption">
							<h1>Carts.</h1>
							<p>A shopping cart is a piece of software that acts as an
								online store's catalog and ordering process.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#" role="button">List
									Carts</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
</body>