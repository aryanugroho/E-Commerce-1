<body data-ng-app="webapp" data-ng-controller="homeController">
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="http://www.softtek.com/es"><img
					height="100%" alt="Softtek"
					src="http://www.artech-consulting.com/view/images/logos/logo_softtek.png"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="home">Home</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Categories <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Browse All</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header">Categories</li>
							<li data-ng-repeat="c in categories"><a href="#">{{c}}</a></li>

						</ul></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
</body>