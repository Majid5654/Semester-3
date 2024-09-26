USE tsql 2012;
GO

--INNER JOIN
--CASE : Show product name with the corresponding category name!
SELECT
p.productid,
p.productname,
c.categoryname

FROM
	Production.Products AS p
		INNER JOIN Production.Categories AS c ON p.categoryid=c.categoryid;

--INNER JOIN (more than 2 tables)
--Case : Show product name with category name,and supplier name
SELECT
p.productid,
p.productname,
c.categoryname,
s.companyname

FROM
	Production.Products AS p
		INNER JOIN Production.Categories AS c ON p.categoryid=c.categoryid
		INNER JOIN Production.Suppliers AS s ON s.supplierid = p.supplierid;

	--OUTER JOIN 
	--CASE: Show categories that are existed on product table as well as the ones
	-- that does not exist
	--Add new sample categories first

	INSERT INTO Production.Categories (categoryname,description) VALUES
	('Jajan Pasar', 'Tradisional food from indonesia'),
	('bumbu dapur', 'Common ingredients used to cook food');
--Show the data
SELECT
c.categoryid,
c.categoryname,
p.productname

FROM
	Production.Categories AS c
		RIGHT OUTER JOIN Production.Products AS p ON p.categoryid = c.categoryid;


		SELECT
c.categoryid,
c.categoryname,
p.productname

FROM
	Production.Categories AS c
		LEFT OUTER JOIN Production.Products AS p ON p.categoryid = c.categoryid;



	--CROSS JOIN
	-- it will show all of combination of the row 2 or more tables
	-- Case: Show cross join of products and category

	SELECT
	 p.productname,
	 c.categoryname
	 FROM
		Production.Products AS p
			CROSS JOIN Production.Categories AS c
-- It will give the results -> N of categories x n of product


-- SELF JOIN
--Perform join on the same table
--Case:Show the employee and their  respectitive managers

SELECT 
	emp.firstname AS empnname,
	mgr.firstname AS mgrname

FROM 
	HR.Employees AS emp
		INNER JOIN HR.Employees AS mgr ON emp.mgrid = mgr.empid;

--Order BY
-- This is to show data in certain order based on the given column(s)
-- Case: Show the name of the products in descending order based on categoryid
-- and product name

SELECT 
	categoryid,
	productname
FROM Production.Products
ORDER BY categoryid DESC ,productname DESC;   --put desc/asc directive in each column


--FIltering with where
-- Case: Show Only products that have categories of condiments,and beverages

SELECT
	p.productid,
	p.productname,
	c.categoryname

FROM
	Production.Products AS p
		INNER JOIN Production.Categories AS c ON p.categoryid = c.categoryid

		WHERE
		c.categoryname IN ('Condiments','Beverages');


--TOP
-- TO select certain number or percent of lines from a table
--Case:Show the top 5 most expensive products

SELECT TOP 5
 *
 FROM Production.Products
 ORDER BY unitprice DESC;
 SELECT TOP 1 PERCENT
  * 
  FROM Production.Products
  ORDER BY unitprice DESC;
-- Case: Show the top 1% most expensive products


--OFFSET-FETCH 
--To take some data from certain line number
--OFFSET -> The data you dont want to include
--FETCH -> How many rows you want to take
--Case :Show the most expensive products with rank 5-10!

SELECT * 
FROM Production.Products
ORDER BY unitprice DESC
OFFSET 4 ROWS FETCH NEXT 6 ROWS ONLY;
--Compare
SELECT * 
FROM Production.Products
ORDER BY unitprice DESC
