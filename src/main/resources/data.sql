-- delivery_info 5개 데이터
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Kandace', '146 Carberry Place', '41953', '879-361-3681', 'et ultrices posuere cubilia curae nulla');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Waring', '984 Arkansas Plaza', '34213', '839-512-8739', 'nisl duis bibendum felis sed interdum venenatis turpis');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Renelle', '91029 Utah Point', '02260', '476-950-2023', 'maecenas tincidunt lacus at velit vivamus vel nulla');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Doris', '09985 Butternut Pass', '43121', '408-361-5615', 'dis parturient montes nascetur');
insert into delivery_info (receiver, address, zip_code, phone_number, delivery_memo) values ('Doris', '09985 Butternut Pass', '43121', '408-361-5615', 'dis parturient montes nascetur');


-- item 10개
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (1, 'Lotstring', 'posuere felis sed', '2023-06-16 16:41:54', 300, 42100, 32500);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (2, 'Redhold', 'vel', '2023-08-02 05:31:34', 11300, 39000, 68600);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (3, 'Pannier', 'malesuada in imperdiet et commodo', '2023-02-09 19:46:47', 26800, 69400, 81600);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (4, 'Solarbreeze', 'aenean sit amet justo', '2022-09-08 10:33:51', 91700, 54200, 92500);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (5, 'Regrant', 'diam id ornare', '2023-07-29 22:10:59', 51400, 6300, 37000);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (6, 'Cardguard', 'dolor sit amet consectetuer adipiscing', '2022-09-23 03:04:31', 76400, 95900, 70400);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (7, 'Regrant', 'euismod scelerisque quam', '2022-11-09 08:10:16', 31100, 73000, 48800);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (8, 'Cardify', 'vitae', '2023-03-08 06:40:58', 44300, 27300, 77400);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (9, 'Wrapsafe', 'cubilia curae nulla', '2022-11-02 09:22:10', 2800, 70100, 39700);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (10, 'Sonair', 'ullamcorper', '2022-10-23 21:02:19', 80100, 40200, 28000);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (11, 'Fintone', 'ipsum primis', '2023-04-26 23:13:45', 75600, 94000, 27400);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (12, 'Voyatouch', 'odio justo sollicitudin ut', '2023-07-17 05:36:16', 27000, 14600, 62200);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (13, 'Toughjoyfax', 'tristique', '2023-03-28 00:34:14', 33800, 54200, 7800);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (14, 'Overhold', 'egestas metus', '2022-08-22 12:31:48', 96100, 96000, 55300);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (15, 'Flowdesk', 'sapien varius', '2023-01-07 02:08:40', 91400, 6100, 31100);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (16, 'Zontrax', 'consectetuer eget rutrum', '2023-01-22 12:28:07', 41300, 57100, 53600);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (17, 'Veribet', 'ridiculus mus etiam vel augue', '2022-11-18 00:27:24', 36300, 43700, 78600);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (18, 'Zaam-Dox', 'sollicitudin vitae', '2023-07-11 23:19:28', 40300, 90000, 58100);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (19, 'Domainer', 'est congue elementum', '2023-01-11 13:13:13', 73400, 99100, 45900);
insert into items (item_id, item_name, item_explain, reg_date, cost_price, net_price, sell_price) values (20, 'Bamity', 'magna', '2022-09-10 18:06:26', 15100, 60500, 92600);

-- Order테이블 5개 테스트 데이터
insert into orders (mgrcode, delivery_info_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23081100000001', 1, 85400,  '2022-09-15 10:07:50', 'Lowe', 'RECEIVED');
insert into orders (mgrcode, delivery_info_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23052100282121', 2, 557400, '2022-09-16 16:10:15', 'Lambe', 'COMPLETE');
insert into orders (mgrcode, delivery_info_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('22052200670654', 3, 48000,  '2022-05-22 20:28:44', 'Eales', 'RECEIVED');
insert into orders (mgrcode, delivery_info_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('22091600338253', 4, 402500, '2022-09-16 22:50:19', 'Veryan', 'COMPLETE');
insert into orders (mgrcode, delivery_info_id, total_amount, ordered_date, ordered_customer_name, order_status) values ('23022200542224', 5, 309000, '2023-02-22 18:22:50', 'Robertz', 'RECEIVED');




insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (1,1, 97, 'mcusty1', 127800);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (2,1, 24, 'lshort0', 521900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (3,2, 11, 'ebanner2', 497900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (4,2, 10, 'kbergeon3', 711400);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (5,3, 24, 'lshort0', 521900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (6,3, 97, 'mcusty1', 127800);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (7,4, 11, 'ebanner2', 497900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (8,4, 10, 'kbergeon3', 711400);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (9,5, 11, 'ebanner2', 497900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (10,5, 10, 'kbergeon3', 711400);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (11,1,21, 'mcust323', 134500);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (12,1,4, 'lshorasdsa', 221900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (13,2,8, 'ebanneasd', 397900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (14,2,21, 'kbergeasda', 411400);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (15,3,34, 'lshorasdas', 54300);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (16,3,47, 'mcusadsad', 627800);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (17,4,51, 'ebannasd', 77900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (18,4,60, 'kbergoasd', 811400);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (19,5,71, 'ebannasd', 97900);
insert into order_item (item_id, order_id, item_quantity, item_name, item_price) values (20,5,80, 'kberasdn', 10400);



