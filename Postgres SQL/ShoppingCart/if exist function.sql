Create or Replace function ifexist_fn()
return void as 
BEGIN
-----where id is 1
IF EXISTS(Select * From cart where product_id = 1 )
 THEN 
   UPDATE cart SET qty = qty + 1 where product_id = 1;
   Else 
    Insert Into cart(product_id, qty)
	 Values(1,1);
	 END IF;
-----where id is 2
IF EXISTS(Select * From cart where product_id >= 2 )
 THEN 
   UPDATE cart SET qty = qty + 1 where product_id >= 2;
   Else 
    Insert Into cart(product_id, qty)
	 Values(2,1),
	  (3,1),
	  (4,1),
	  (5,1);
	 END IF;

/*--------	 
 IF EXISTS(Select * From cart where product_id >= 2 )
 THEN 
   UPDATE cart SET qty = qty + 1 where product_id >= 2;
   Else 
    Insert Into cart(product_id, qty)
	 Values(3,1),
	  (4,1),
	  (5,1);
	 END IF;
	 */
END; 
