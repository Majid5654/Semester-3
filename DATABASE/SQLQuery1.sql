-- try to create our own database
-- Use batch separator to make sure create finishes first
CREATE DATABASE TestTI2I;
go --batch1

USE TestTI2I;
go --batch2

-- database context;
-- change databases context by using USE statemnt;
-- or by selecting from top-left corner combo-box

SELECT * FROM HR.Employees;


--Matery 1
-- Predicates and Operator
-- example of one pridicate (IN)
-- show orders data from certain city

--Example:
SELECT * FROM 
Sales.Orders WHERE shipcity IN ('Lyon','Rio de Janeiro'); --This is predicate


--Matery 2
--Operator
--Operator is something between 2 words and /or value.
-- when it is evaluated it will returns another value
-- Example of operator * and -
-- Show the total price from each item in sales.OrderDetails
-- TP = UP * Qty * (1- discount)

--Example:
SELECT 
*, unitprice * qty * (1 - discount) AS totalprice 
FROM Sales.OrderDetails;


--Matery 3
-- Concatenantion Operator
--This is to combine 2 or more strings
-- By using plus (+) sign.
--Show full name of the employees

--Example:
SELECT 
*, (titleofcourtesy + ' ' +firstname + ' ' +lastname ) AS fullname
FROM HR.Employees;


--Matery 4
-- Function
-- it is something that processes input to become output.
--Several examples of function:
--string function to take certain number of chars from the right side
--Case : only the customer that are managers

--Example:
SELECT * FROM Sales.Customers
WHERE RIGHT(contacttitle, 7) ='Manager'; --built in function RIGHT()

--Show the result:
SELECT RIGHT (contacttitle,7) AS Manager FROM Sales.customers;

--Date:
SELECT SYSDATETIME() AS currenttime;

--SUM() aggregation function,to count the total number of all sold items
SELECT SUM(qty) AS TotalSold FROM Sales.OrderDetails;


--Matery 5
--Variables:Something that we can use to store temporary value
--Declaring variable:

--Example:
DECLARE @Year AS INT = 2007;
-- Showing the value of a variable
SELECT @Year;
--use variable in a SELECT Statement.
--EX: Show the orders data based on the year in variable
SELECT * FROM Sales.Orders
WHERE YEAR (shippeddate) = @Year;


--Matery 6
-- Is a kind of T-SQL elements that allows us to use it like programming
-- languanges (declarative)
--Ex : BEGIN..END

--EXAMPLE:

--Create a function to count total weight of sales based on certain given year
CREATE FUNCTION calculateTotalFreight(@Year INT) RETURNS FLOAT AS
BEGIN
	DECLARE @Total AS FLOAT;
	SELECT @Total = SUM(freight) FROM Sales.Orders WHERE YEAR (shippeddate) = @Year;
	RETURN @Total;
END

--Use the function
SELECT dbo.calculateTotalFreight(2006);
--Another Way to Use Function
SELECT
	dbo.calculateTotalFreight(2006) AS Total2006;
	dbo.calculateTotalFreight(2007) AS Total2007;


--Matery 7:
--Case:This is like branching but it is used as an expression in a SELECT statement.
--CASE is not a type of control flow

--Ex:
--show the category name of products based on the category id.

--EXAMPLE:
SELECT
*,
CASE categoryid	
	WHEN 1 THEN 'Food'
	WHEN 2 THEN 'Medicine'
	WHEN 3 THEN 'Drinks'
	ELSE 'Uknown Category'
END
AS CategoryName
FROM Production.Products;



