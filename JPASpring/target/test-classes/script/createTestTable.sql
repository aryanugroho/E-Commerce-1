CREATE TABLE  STATUS  (
 status_id  INTEGER NOT NULL,
 description  VARCHAR(100),
 status_type  VARCHAR(20),
PRIMARY KEY( status_id )
);

CREATE TABLE  USERS  (
 username  VARCHAR(20) NOT NULL,
 password  VARCHAR(20),
 name  VARCHAR(50),
 address  VARCHAR(150) NOT NULL,
 city  VARCHAR(30) NOT NULL,
 zipcode  INTEGER,
 country  VARCHAR(30) NOT NULL,
 phone  VARCHAR(20),
 email  VARCHAR(50),
PRIMARY KEY( username )
);

CREATE TABLE  PRODUCTS (
 product_id  INTEGER NOT NULL,
 name  VARCHAR(100) NOT NULL,
 description  VARCHAR(250) NOT NULL,
 price  INTEGER UNSIGNED NOT NULL,
 discount  INTEGER UNSIGNED NOT NULL,
 stock  INTEGER UNSIGNED NOT NULL,
 category VARCHAR(50),
 imageurl VARCHAR(100)
PRIMARY KEY( product_id )
);

CREATE TABLE ORDERS (
 order_id  INTEGER NOT NULL,
 username  VARCHAR(20) NOT NULL,
 quantity  INTEGER UNSIGNED NOT NULL,
 total  INTEGER UNSIGNED NOT NULL,
 status_id  INTEGER NOT NULL,
 shipping_name  VARCHAR(50) NOT NULL,
 shipping_address  VARCHAR(150) NOT NULL,
 shipping_cost  INTEGER UNSIGNED NOT NULL,
 order_date  DATE,
 expected_date  DATE,
PRIMARY KEY( order_id )
);

CREATE TABLE  CARTS (
 cart_id  INTEGER NOT NULL,
 order_id INTEGER NOT NULL,
 product_id  INTEGER NOT NULL,
 quantity  INTEGER UNSIGNED NOT NULL,
PRIMARY KEY ( cart_id )
);