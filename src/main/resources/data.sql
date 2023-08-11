-- Order테이블 5개 테스트 데이터
insert into orders (order_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23081100000001', 85400,  '2023-08-11 10:07:50', 'Lowe', 'RECEIVED');
insert into orders (order_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23052100282121', 557400, '2023-05-21 16:10:15', 'Lambe', 'COMPLETE');
insert into orders (order_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('22052200670654', 48000,  '2022-05-22 20:28:44', 'Eales', 'RECEIVED');
insert into orders (order_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('22091600338253', 402500, '2022-09-16 22:50:19', 'Veryan', 'COMPLETE');
insert into orders (order_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23022200542224', 309000, '2023-02-22 18:22:50', 'Robertz', 'RECEIVED');

-- delivery_info 5개 데이터
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Kandace', '146 Carberry Place', '41953', '879-361-3681', 'et ultrices posuere cubilia curae nulla');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Waring', '984 Arkansas Plaza', '34213', '839-512-8739', 'nisl duis bibendum felis sed interdum venenatis turpis');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Renelle', '91029 Utah Point', '02260', '476-950-2023', 'maecenas tincidunt lacus at velit vivamus vel nulla');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Doris', '09985 Butternut Pass', '43121', '408-361-5615', 'dis parturient montes nascetur');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Doris', '09985 Butternut Pass', '43121', '408-361-5615', 'dis parturient montes nascetur');

-- order_detail 10개
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23081100000001', 24, 'lshort0', 521900);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23081100000001', 97, 'mcusty1', 127800);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23052100282121', 11, 'ebanner2', 497900);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23052100282121', 10, 'kbergeon3', 711400);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('22052200670654', 24, 'lshort0', 521900);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('22052200670654', 97, 'mcusty1', 127800);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('22091600338253', 11, 'ebanner2', 497900);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('22091600338253', 10, 'kbergeon3', 711400);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23022200542224', 11, 'ebanner2', 497900);
insert into order_detail (order_id, item_quantity, item_names, item_prices) values ('23022200542224', 10, 'kbergeon3', 711400);


-- item 10개
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('Flecainide Acetate','ipsum dolor sit amet consectetuer', '2023-02-20 17:38:05', 71600, 91500, 62700);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('No7 Protect', 'sapien urna pretium nisl ut', '2022-12-02 20:03:05', 26000, 63000, 31400);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('Atropine Sulfate', 'curae donec pharetra magna vestibulum alique', '2022-12-20 20:39:04', 67900, 16300, 72300);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('Enalapril Maleate', 'tincidunt ante vel ipsum praesent blandit lacinia erat', '2022-09-05 05:28:15', 1800, 72800, 62600);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('No7 Lifting', 'nisl duis ac nibh fusce lacus purus aliquet at feugiat non', '2022-11-25 23:49:39', 92800, 49300, 75300);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('quetiapine fumarate', 'volutpat sapien arcu sed augue aliquam erat volutpat in', '2022-09-19 22:27:13', 27900, 17700, 27300);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('LBel', 'tempus semper est quam pharetra magna ac consequat', '2023-06-25 09:53:23', 33500, 48200, 77500);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('Crest Anti-Cavity', 'posuere metus vitae ipsum aliquam non', '2023-04-18 13:16:17', 94800, 39000, 50500);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('up and up', 'donec diam neque vestibulum', '2023-04-09 07:23:20', 64900, 66400, 8800);
insert into items (item_name, item_explain, reg_date, cost_price, net_price, sell_price) values ('Darkleaves', 'sollicitudin vitae consectetuer eget', '2023-05-31 19:09:32', 28000, 42400, 23800);
