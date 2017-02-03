<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body data-ng-app="myApp">
	<div data-ng-controller="homeController">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img class="first-slide"
						src="http://www.spademark.com/images/spade-mark-banner.jpg"
						alt="First slide" style="height: 100%;">
					<div class="container">
						<div class="carousel-caption">
							<h1>Portal Store</h1>
							<p>Save money, save time.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="List" role="button">Browse
									Products</a>
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
							<h1>Portal Store</h1>
							<p>Specific to a niche's greates need, emotionaly oriented.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#" role="button">Browse
									Products</a>
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
		<!--content-->
		<div class="container">
			<div class="cont">
				<div class="content">
					<div class="content-top">
						<h1>NEW PRODUCTS</h1>
						<div class="grid-in">
							<div data-ng-repeat="p in products"
								class="col-md-3 grid-top simpleCart_shelfItem">
								<a href="single.html"
									class="b-link-stripe b-animate-go  thickbox"> <img
									class="img-responsive" data-ng-src="{{p.imageUrl}}" alt="">
									<div class="b-wrapper">
										<h3 class="b-animate b-from-left    b-delay03 ">
											<span>{{p.name}}</span>
										</h3>
									</div>
								</a>
								<p>
									<a href="single.html">{{p.name}}</a>
								</p>
								<a href="#" class="item_add"><p class="number item_price">
										$<!-- -->{{p.price}}.00
									</p></a>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<!----->
			</div>
			<!---->
		</div>
	</div>
</body>