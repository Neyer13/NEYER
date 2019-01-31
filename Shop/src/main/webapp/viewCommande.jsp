<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon</title>
</head>
<body>
	<p>Données Personnels</p>
	<form action="ShopServelet" method="post">
		<input type="checkbox" name="produit" value="tv"> TV<br> 
		<input type="checkbox" name="produit1" value="four">Four<br> 
		<input type="checkbox" name="produit2" value="cafetiere" checked> Cafetière<br>
		<br> NOM : <input type="text" name="nom"><br>
		ADRESSE : <input type="text" name="adresse"><br>

		<p>Choisissez votre mode de livraison</p>

		<input type="radio" name="choixLib" value="EX"> Express<br>
		<input type="radio" name="choixLib" value="DO"> Domicile<br>
		<input type="radio" name="choixLib" value="PR"> Point Relay<br>
		<input type="radio" name="choixLib" value="RM"> Retirer en
		magasin<br>

		<p>Votre panier</p>
		<textarea rows="" cols=""></textarea>
		<br> <input type="submit" value="Submit">
	</form>

</body>
</html>