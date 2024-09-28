# Write your MySQL query statement below
select EmployeeUNI.unique_id as unique_id, Employees.name from employees left join EmployeeUNI on employees.id = EmployeeUNI.id 