insert into category ( name, description) values( 'Lenovo','Lenovo Brand');
insert into category ( name, description) values( 'Dell','Dell Brand');
insert into category ( name, description) values( 'HP','HP Brand');

insert into discount ( product_id, discount_name, discount_price) values(1, 'Flash Sale',100);
insert into discount ( product_id, discount_name, discount_price) values(2, 'Black Friday',50);

insert into PRODUCT (NAME, DESCRIPTION, IMAGE, PRICE, CATEGORY_CAT_ID,created_at,updated_at,stock_quantity, discount_id)  values('Thinkpad','nice laptop','',500,1,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),45,1);
insert into PRODUCT (NAME, DESCRIPTION, IMAGE, PRICE, CATEGORY_CAT_ID,created_at,updated_at,stock_quantity, discount_id)  values('Yoga','nice laptop','',1500,1,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),35,2);
insert into PRODUCT (NAME, DESCRIPTION, IMAGE, PRICE, CATEGORY_CAT_ID,created_at,updated_at,stock_quantity)  values('Envy','nice laptop','',600,3,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),25);
insert into PRODUCT (NAME, DESCRIPTION, IMAGE, PRICE, CATEGORY_CAT_ID,created_at,updated_at,stock_quantity)  values('Pavilion','nice laptop','',700,3,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),15);
insert into PRODUCT (NAME, DESCRIPTION, IMAGE, PRICE, CATEGORY_CAT_ID,created_at,updated_at,stock_quantity)  values('Vostro','nice laptop','',800,2,CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP(),15);