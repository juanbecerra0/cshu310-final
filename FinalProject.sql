Create Database FinalProject;
USE FinalProject;

Create Table Item
(ID int auto_increment,
ItemCode varchar(10) UNIQUE,
ItemDescription varchar(50),
Price decimal(4,2) DEFAULT 0,
Primary key (ID));


Create Table Purchase
(ID int auto_increment, 
ItemID int NOT NULL,
Quantity int NOT NULL,
PurchaseDate datetime default now(),
Primary key (ID));

Alter table Purchase
ADD FOREIGN KEY (ItemID) REFERENCES Item(ID);

Create Table Shipment
(ID int auto_increment,
ItemID int NOT NULL,
Quantity int NOT NULL,
ShipmentDate date NOT NULL UNIQUE,
Primary key (ID));

Alter table Shipment
ADD FOREIGN KEY (ItemID) REFERENCES Item(ID);


-- Syntax is CreateItem(ItemCode, Item Description, Price)
Delimiter $$
Create Procedure CreateItem(iCode varchar(10), iDesc varchar(50), pri decimal)
BEGIN
	Insert Into Item(ItemCode, ItemDescription, Price)
	Values(iCode, iDesc, pri);
END;
$$

CALL CreateItem('Sock567890', 'A foot thing', 4.00);
CALL CreateItem('Jeans3', 'A legs thing', 40.00);
CALL CreateItem('xaswrfas', 'fasefas', 0.00);
CALL CreateItem('', '', -1.00);

-- DO WE ADD CONSTRAINTS FOR THESE SITUATIONS IN SQL OR JAVA?

SELECT * FROM Purchase;
SELECT * FROM Item;

DROP PROCEDURE CreateItem;


-- Syntax is CreatePurchase(ItemCode, PurchaseQuantity)
Delimiter $$
Create Procedure CreatePurchase(iCode varchar(10), pQ int)
BEGIN
	INSERT INTO Purchase(Quantity, ItemID)
    SELECT pQ as Quantity, ID as ItemID
    FROM Item
    WHERE Item.ItemCode = iCode;
END;
$$

CALL CreatePurchase('Jeans', 10);
CALL CreatePurchase('legos', 1000);
Call CreatePurchase('ssssssssssssssss', 1000);

-- How do I get the error for legos?

DROP PROCEDURE CreatePurchase;

