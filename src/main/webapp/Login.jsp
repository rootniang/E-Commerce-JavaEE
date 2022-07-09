<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-icons.css" />
		<link rel="stylesheet" href="css/style.css" />
		<link rel="stylesheet" href="icofont/icofont.css" />
		<title>Bienvenu sur Jaaba Store</title>
	</head>
	<body>
		
		<h2>Bienvenu(e) sur Jaaba Store !</h2>
		<div class="container" id="container">
			<div class="form-container sign-up-container">
				<form action="#">
					<h1>Creer un compte</h1>
					<div class="social-container">
						<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
						<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
						<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
					</div>
					<span>ou utilise ton mail</span>
					<input type="text" placeholder="Name" />
					<input type="email" placeholder="Email" />
					<input type="password" placeholder="Password" />
					<button>Sign Up</button>
				</form>
			</div>
			<div class="form-container sign-in-container">
				<form action="#">
					<h1>Connexion</h1>
					<div class="social-container">
						<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
						<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
						<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
					</div>
					<span>ou utilise ton compte</span>
					<input type="email" placeholder="Email" />
					<input type="password" placeholder="Password" />
					<a href="#">Mot de passe oublie?</a>
					<button>Connexion</button>
				</form>
			</div>
			<div class="overlay-container">
				<div class="overlay">
					<div class="overlay-panel overlay-left">
						<h1>De retour!</h1>
						<p>Pour rester au courant de nos nouveautes veuillez renseigner des donnees exactes</p>
						<button class="ghost" id="signIn">Connexion</button>
					</div>
					<div class="overlay-panel overlay-right">
						<h1>Salam, Xarit!</h1>
						<p>Inscris toi et decouvre nos articles</p>
						<button class="ghost" id="signUp">Inscription</button>
					</div>
				</div>
			</div>
		</div>
		
		<footer>
			<p>
				Created with <i class="fa fa-heart"></i> by
				<a target="_blank" href="https://github.com/rootniang">Mame Mar Niang</a>
			</p>
		</footer>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/main.js"></script>
	</body>
</html>
