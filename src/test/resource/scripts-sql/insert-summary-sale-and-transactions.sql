-- insert 2 summary sale

INSERT INTO public.summary_sale
(uuid, created_at, updated_at, gross_amount_sale, merchant_discount_rate, net_amount_sale, number_of_installments, number_summary_sale)
VALUES('9abcdb62-5e52-4230-a6ca-3fd4253b8493', '2020-01-02 13:34:52.278', NULL, 799.00, 1.8, 776.00, 10, 12121214);
INSERT INTO public.summary_sale
(uuid, created_at, updated_at, gross_amount_sale, merchant_discount_rate, net_amount_sale, number_of_installments, number_summary_sale)
VALUES('a4c02d9f-bc69-4999-8b00-50eb2c68b10b', '2020-01-02 13:37:45.150', NULL, 799.00, 1.8, 776.00, 10, 12121);



-- insert 20 transactions

INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('6e7eab14-2991-4896-836a-8f08f3a02655', '2020-01-02 13:34:52.464', NULL, NULL, '2020-01-02 13:34:52.456', 'HIPERCARD', 79.90, 1, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('c6ae4e24-eb27-44bd-b78d-d1c14a3315b2', '2020-01-02 13:34:52.496', NULL, NULL, '2020-01-02 13:34:52.495', 'HIPERCARD', 79.90, 2, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('46e3f53f-7a9e-4aeb-b29f-8651fe2ac788', '2020-01-02 13:34:52.542', NULL, NULL, '2020-01-02 13:34:52.541', 'HIPERCARD', 79.90, 3, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('2e60ebbb-0faf-4740-bb83-31a412b6e5ac', '2020-01-02 13:34:52.552', NULL, NULL, '2020-01-02 13:34:52.552', 'HIPERCARD', 79.90, 4, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('59f05005-e70d-4398-af86-fd61abe81743', '2020-01-02 13:34:52.577', NULL, NULL, '2020-01-02 13:34:52.566', 'HIPERCARD', 79.90, 5, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('546d0cb5-b733-491b-b307-b0d534b206f1', '2020-01-02 13:34:52.614', NULL, NULL, '2020-01-02 13:34:52.612', 'HIPERCARD', 79.90, 6, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('037252b3-9cb5-4f43-9687-9b9616b2138b', '2020-01-02 13:34:52.684', NULL, NULL, '2020-01-02 13:34:52.681', 'HIPERCARD', 79.90, 7, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('b3502629-91d6-4c0c-b720-9c80841515c7', '2020-01-02 13:34:52.715', NULL, NULL, '2020-01-02 13:34:52.713', 'HIPERCARD', 79.90, 8, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('1616568c-7ce9-4728-9cf2-9deac9dc4914', '2020-01-02 13:34:52.727', NULL, NULL, '2020-01-02 13:34:52.726', 'HIPERCARD', 79.90, 9, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('c3511485-ec71-48c0-aa14-3163ddb533fa', '2020-01-02 13:34:52.738', NULL, NULL, '2020-01-02 13:34:52.737', 'HIPERCARD', 79.90, 10, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', '9abcdb62-5e52-4230-a6ca-3fd4253b8493');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('01d63c49-7f3f-4667-89b8-b6b5e4bd5ba6', '2020-01-02 13:37:45.167', NULL, NULL, '2020-01-02 13:37:45.164', 'HIPERCARD', 79.90, 1, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('8ce8c9bf-5a66-4123-acf2-a68bcbe4c148', '2020-01-02 13:37:45.174', NULL, NULL, '2020-01-02 13:37:45.174', 'HIPERCARD', 79.90, 2, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('35bbeadc-b43e-455a-8541-e1e26a64fef4', '2020-01-02 13:37:45.183', NULL, NULL, '2020-01-02 13:37:45.183', 'HIPERCARD', 79.90, 3, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('7e4afe08-ecc0-4ae9-8d48-798d126d0c63', '2020-01-02 13:37:45.192', NULL, NULL, '2020-01-02 13:37:45.191', 'HIPERCARD', 79.90, 4, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('eb1ae58c-78a5-488b-8967-a27aae29c442', '2020-01-02 13:37:45.200', NULL, NULL, '2020-01-02 13:37:45.200', 'HIPERCARD', 79.90, 5, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('37879974-bb52-442b-ae6e-b38c306228d3', '2020-01-02 13:37:45.211', NULL, NULL, '2020-01-02 13:37:45.210', 'HIPERCARD', 79.90, 6, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('1dd61483-e227-46e2-932a-28d1eb0f93cb', '2020-01-02 13:37:45.217', NULL, NULL, '2020-01-02 13:37:45.217', 'HIPERCARD', 79.90, 7, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('36e57108-d9f9-4966-b5c5-e18edbdb33f4', '2020-01-02 13:37:45.222', NULL, NULL, '2020-01-02 13:37:45.222', 'HIPERCARD', 79.90, 8, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('67e02f6d-6ca8-45b6-8a7b-944fa54c6732', '2020-01-02 13:37:45.227', NULL, NULL, '2020-01-02 13:37:45.227', 'HIPERCARD', 79.90, 9, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
INSERT INTO public.transactions
(uuid, created_at, updated_at, authorized_at, captured_at, card_holder, gross_amount, installment_number, masked_credit_card_number, merchant_code, net_amount, nsu, number_of_installments, payment_date, seller_id, transction_type, summary_sale_uuid)
VALUES('b6664198-c962-4d82-9705-1ab184606a13', '2020-01-02 13:37:45.239', NULL, NULL, '2020-01-02 13:37:45.239', 'HIPERCARD', 79.90, 10, '606282****085046', '3456765', 77.60, '9876543', 10, '2020-01-21', '92355437000166', 'CREDIT', 'a4c02d9f-bc69-4999-8b00-50eb2c68b10b');
