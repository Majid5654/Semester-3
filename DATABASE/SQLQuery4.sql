USE TSQL2012;

GO

--Aggregation functions
--It is kind of function that we use to calculate 1 or more values in the same column to results in single output.
--It is different from scalar function that calculate EXACTLY 1 input to become also 1 output
--Some example of aggregiation function:SUM,MIN,MAX,AVG,COUNT
--Example:What is the most expensice price of all products?
SELECT unitprice FROM Production.Products; --Result in 77 rows
SELECT MAX(unitprice) FROM Production.Products; --Only 1 row
-- How about the cheapest Price?
SELECT MIN (unitprice) FROM Production.Products; --Only 1 row
--And what is the average price
SELECT AVG (unitprice) FROM Production.Products;
--Then,what is the total price of all products
SELECT SUM (unitprice) FROM Production.Products; --Only 1 row
--Lastly,how many products do we have?
SELECT COUNT (unitprice) FROM Production.Products; --77
SELECT COUNT (productid) FROM Production.Products; --77
SELECT COUNT (productname) FROM Production.Products; --77
--Thats why we can use:
SELECT COUNT (*) FROM Production.Products; --77
--Now what if i want to see all of the statictic in one table?
SELECT
	MAX(unitprice) AS [Most Expensive Price], 
	AVG(unitprice) AS [Average Price],
	SUM(unitprice) AS [Totale Price] ,
	COUNT(unitprice) AS [#of Products]
FROM
	Production.Products;
	

--Notes by using only aggregation function,we are unable to know the name,or other
--attributes of the row.We can only know the value or the number
--If we want to know,for example what product is the most expensive one
--we have to use SQL combiantion,or subqueery

--1. Find the most expensive price first
SELECT MAX(unitprice) FROM Production.Products;
--2. Find the corresponding product product that has the same price with the preview result;
SELECT productname FROM Production.Products WHERE unitprice = 263.50;
--alternateive 2 :Use Subqueery
SELECT productname FROM Production.Products WHERE (unitprice) = (
SELECT MAX(unitprice) FROM Production.Products
);

--Group by Clause

--this is used to perform aggregation operations but the ones that need context
--or in another words:"based on what?.And 'what' here means which columns
--without Group By ,aggregation function will result in exactly in one value.
--But with group by,the reults can be one value or more,based on the unique value
--Of the desired column
--Example
SELECT SUM(freight)
FROM Sales.Orders
GROUP BY shipcity;
--And what if we want to order it so the largest amount of shipping put on the top?
--Example:what are the total weights of shipment for each city
SELECT shipcity,SUM(freight) AS [Total Weight]
FROM Sales.Orders
GROUP BY shipcity
ORDER BY [Total Weight] DESC;


--How much revenue coming from each of product sales?
SELECT produ,SUM (unitprice * qty) - (unitprice * qty * discount)) AS [Total Reveue]
FROM Sales.OrderDetails
GROUP BY productid
ORDER BY [Total Revenue] DESC

--Having clause
--This is used to filter the groups created by GORUP by clause
--Example:Show all cities that has more than one employees
SELECT
city,
COUNT(*) AS NumberOfEmployee
FROM HR.Employees
GROUP BY city
HAVING COUNT(*) > 1;

--Another Example:Show customer ID that has commited purchase more than 10x
-- Another example: Show customer ID that has commited purchase more than 1;
 SELECT 
	custid, COUNT(*) AS [How Many Times]
 FROM Sales.Orders
 GROUP BY custid
 HAVING COUNT(*) > 10
 ORDER BY [How Many Times] DESC;

 --Subquery
 --Is any SELECT statement that is put into another SELECT statement,
 --The indise one is called "inner query" or "SUB Queery"
--The outside one is called Outer querry
--Based on the result sub-queery can be divided into 3 categories
--Scalar --> 1 value
--Multi Valued More than 1 value but still 1 column
--Table valued more than 1 valued and more than 1 column
--Example:Show the id customer that commited the very last purchase
SELECT custid FROM Sales.Orders WHERE orderdate = (
SELECT MAX(orderdate) FROM Sales.Orders -- this is scalar sub queery because wegbe it is executed 
										--it will resulting only 1 value
);

--Another example :we got the ids of customer doing the last day purchaes
--Now we also want to know who are they,whats their name,how to do that?
SELECT * FROM Sales.Customers;
SELEct contactname FROM Sales.Customers
WHERE custid = 65 OR custid = 9 Or custid = 68 OR custid = 73;

