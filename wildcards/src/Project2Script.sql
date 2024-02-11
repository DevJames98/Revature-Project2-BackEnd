drop table if exists "invertory";

--fake address inserts

--fake payment info inserts

--fake user inserts
--insert into "users"(email,first_name,last_name,"password",username)
--	values('f@f.com','test','me','password','fakeUser1'),
--	('g@g.com','hello','world','password','fakeUser2'),
--	('h@h.com','test','me','password','fakeUser3');

--brand table inserts
insert into "brand"(brand)
	values('Moet'),
	('Armand de Brignac'),
	('Luc Belaire'),
	('Meiomi'),
	('Sutter Home'),
	('Chateau Souverain'),
	('Bernard Remy'),
	('Pierre Paillard'),
	('La Crema'),
	('Saracina'),
	('Ciroc'),
	('Gran Duque D’alba'),
	('Paul Masson'),
	('Christian Brothers'),
	('Courvoisier '),
	('D’usse'),
	('Henessy'),
	('Remy Martin'),
	('Bombay'),
	('Fremont Mischief'),
	('Tanqueray Rangpur'),
	('Bacardi'),
	('Malibu'),
	('Wray & Nephew'),
	('Captain Morgan'),
	('1800'),
	('Deleon'),
	('Don Julio'),
	('Jose Cuervo'),
	('Absolut'),
	('Effen'),
	('Grey Goose'),
	('Smirnoff'),
	('Jack Daniel’s'),
	('Jim Beam'),
	('Johnnie Walker'),
	('Makers Mark'),
	('Bulleit Bourbon'),
	('Blue Moon'),
	('Allagash'),
	('Piraat'),
	('Angry Orchard'),
	('Rekorderlig'),
	('101 Cider House '),
	('Corona '),
	('Becks'),
	('Bud Light'),
	('Coors Light'),
	('Heineken'),
	('Modelo'),
	('Unibroue'),
	('Guiness');
		

--type table inserts
insert into "type"(type_name)
	values('Champagne'),
	('Red Wine'),
	('Rosé'),
	('White Wine'),
	('Brandy'),
	('Cognac'),
	('Gin'),
	('Rum'),
	('Tequila'),
	('Vodka'),
	('Whiskey'),
	('Belgian'),
	('Cider'),
	('Lager'),
	('Saison'),
	('Stout');

--inventory table inserts
insert into "inventory"(item_description,price,stock,brand,"type")
	values('Moet Imperial Brut Rose 1.5L',139.99,20,1,1),
	('Moet Nectar Imperial Rose 750ML',49.50,20,1,1),
	('Moet 150th Anniversary Imperial Brut 750ML',49.95,5,1,1),
	('Armand de Brignac Ace of Spades',279.95,20,2,1),
	('Luc Belaire Gold Sparkling 750ML',24.95,20,3,1),
	('Luc Belaire Rose Sparkling 1.5L',69.95,5,3,1),
	('Meiomi Pinot Noir 2017 750ML',19.95,20,4,2),
	('Sutter Home Cabernet Sauvignon 750ML',6.95,20,5,2),
	('Chateau Souverain North Coast Cabernet Sauvignon 750ML',9.95,5,6,2),
	('Sutter Home White Zinfandel 1.5L',8.99,20,5,3),
	('Sutter Home Rosé 1.5L',8.99,20,5,3),
	('Bernard Remy Rose Champagne 750ML',34.95,20,7,3),
	('Pierre Paillard Les Terres Rose Extra Brut Rosé',69.95,20,8,3),
	('Chateau Souverain Sauvignon Blanc 750ML',9.95,5,6,4),
	('Bernard Remy Chardonnay Russian River Valley 2017 750ML',39.95,5,7,4),
	('La Crema Chardonnay Monterey 2017 750ML',13.95,20,9,4),
	('Saracina Atrea the Choir White 2016 750ML',16.99,20,10,4),
	('Ciroc Brandy VS 750ML',23.95,20,11,5),
	('Gran Duque D''alba Reserva 750ML',39.95,20,12,5),
	('Paul Masson VS 1.75',19.95,20,13,5),
	('Christian Brothers VS 1.75',16.95,20,14,5),
	('Courvoisier Avant Grande Bourbon Cask Edition 750ML',39.95,5,15,6),
	('D''usse VSOP 750ML',43.95,20,16,6),
	('D''usse XO 750ML',159.95,5,16,6),
	('Hennessy Black 750ML',37.95,5,17,6),
	('Hennessy VS 1.75ML',74.95,20,17,6),
	('Remy Martin VSOP 1L',59.99,20,18,6),
	('Hennessy',77.95,20,17,6),
	('Bombay Sapphire Gin 1L',32.99,20,19,7),
	('Fremont Mischief Gin 750ML',25.99,20,20,7),
	('Tanqueray Rangpur Gin 1.75ML',32.95,20,21,7),
	('Bacardi Gold 375ML',7.99,5,22,8),
	('Malibu Coconut Rum 1.75L',19.99,20,23,8),
	('Wray & Nephew Rum 126 Proof 750ML',24.99,20,24,8),
	('Captain Morgan Gingerbread Spiced Rum 750ML',10.95,5,25,8),
	('Bacardi Coconut 750ML',11.95,5,22,8),
	('1800 Coconut Tequila 750ML',21.99,20,26,9),
	('Deleon Platinum Tequila 1.75ML',49.95,20,27,9),
	('Don Julio Anejo 1.75L',104.99,20,28,9),
	('Jose Cuervo Especial Silver 1.75ML',21.99,5,29,9),
	('Absolut Vodka 1.75L',26.95,20,30,10),
	('Ciroc Coconut Vodka 1.75L',43.95,20,11,10),
	('Ciroc Vodka 1.75L',43.95,20,11,10),
	('Effen Vodka 750ML',19.95,20,31,10),
	('Grey Goose 1.75L',49.95,20,32,10),
	('Smirnoff 100 Proof 750ML',17.99,20,33,10),
	('Jack Daniel''s 1L',31.95,20,34,11),
	('Jim Beam 1.75L',23.99,20,35,11),
	('Johnnie Walker Black 1L',43.99,5,36,11),
	('Maker''s Mark 1.75L',46.95,20,37,11),
	('Bulleit Bourbon 1.75L',39.95,20,38,11),
	('Blue Moon Belgian White 12pk BTLS',15.95,20,39,12),
	('Allagash Tripel Ale 4pk',12.99,20,40,12),
	('Brouwerij Van Steenberge Piraat Belgium Ale 4pk',18.99,20,41,12),
	('Angry Orchard Unfiltered 6pk BTLS',10.49,5,42,13),
	('Rekorderlig Strawberry Lime 4pk Cans',9.99,20,43,13),
	('101 Cider Electric Pineapple 4pk BTLS',13.95,20,44,13),
	('Corona Extra 12pk BTLS',14.99,5,45,14),
	('Becks 24pk BTLS',19.99,20,46,14),
	('Bud Light 12pk Cans',9.95,20,47,14),
	('Coors Light 12pk BTLS',9.99,20,48,14),
	('Corona Refresca Variety 12pk Cans',15.95,5,45,14),
	('Heineken 5L Mini Keg',21.95,20,49,14),
	('Modelo Especial 12pk BTLS',15.95,20,50,14),
	('Allagash Saison 4pk',10.99,20,40,15),
	('Allagash Saison Dupont Brewer''s Bridge 4pk BTLS',13.99,20,40,15),
	('Unibroue Megadeth a Tout Le Monde Saison 4pk',6.99,20,51,15),
	('Guiness Stout 6pk BTLS',9.99,20,52,16),
	('Guiness Draught 6pk BTLS',9.95,20,52,16);

--order status inserts
insert into "order_status"(name)
	values('Completed'),('Cancelled');

--order table inserts

--fake shopping cart

--select * from users;
--select * from brand;
--select * from "type";
--select * from address;
--select * from inventory;
--select * from order_table
--inner join order_status on order_status = status_id ;
--select * from order_status;