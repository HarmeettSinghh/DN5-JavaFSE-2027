Exercise 1: Control Structures

Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
o	Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.
Scenario 2: A customer can be promoted to VIP status based on their balance.
o	Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.
Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.
o	Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

using love sql on chrome which is a free sql interface , created two table loans and customers
tables creation - CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
); 

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER(5,2),
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
Scenario 1 -
BEGIN
    FOR customer_record IN (
        SELECT CustomerID, Age
        FROM Customers
    )
    LOOP

        IF customer_record.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    COMMIT;
END;
/


Scenario2- 
BEGIN

    FOR customer_record IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP

        IF customer_record.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

END;
/


Scenario3-
BEGIN

    FOR loan_record IN (

        SELECT CustomerID,
               LoanID,
               DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

            'Reminder: Loan ' ||

            loan_record.LoanID ||

            ' for Customer ' ||

            loan_record.CustomerID ||

            ' is due on ' ||

            loan_record.DueDate

        );

    END LOOP;

END;
/