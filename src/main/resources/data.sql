INSERT INTO department (department_id, department_name) VALUES
('D01','Grocery'),
('D02', 'Meat'),
('D03', 'Liquor'),
('D04' , 'Flowers');

INSERT INTO promotion (promo_id, promo_name, promo_desc, department_id, promo_list_price, promo_disc_price, promo_img) VALUES
('P101','Lays', 'Sour Cream Lays', 'D01', 12.00, 10.00, 'imageurl'),
('P102','Pepsi', 'Pepsi', 'D01', 15.00, 14.00, 'imageurl'),
('P103','Chicken', 'Tender chicken', 'D02', 15.00, 14.00, 'imageurl'),
('P104','Crab', 'Fresh Crab', 'D02', 15.00, 14.00, 'imageurl'),
('P105','Beer', 'Beer', 'D03', 15.00, 14.00, 'imageurl'),
('P106','Vodka', 'Vodka', 'D03', 15.00, 14.00, 'imageurl'),
('P107','Biscuits', 'chocolate biscuits', 'D01', 6.00, 5.00, 'imageurl'),
('P108','Fish', 'salmon fish', 'D02', 20.00, 18.00, 'imageurl'),
('P109','Gin', 'Gin', 'D03', 15.00, 14.00, 'imageurl'),
('P110','Jasmine', 'Fresh Jasmines', 'D04', 3.00, 3.50, 'imageurl'),
('P111','Lilly', 'Purple Lillies', 'D04', 15.00, 14.00, 'imageurl'),
('P112','Roses', 'Red Roses', 'D04', 8.00, 7.00, 'imageurl');