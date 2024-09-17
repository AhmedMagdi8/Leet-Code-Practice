SELECT p.project_id, round(AVG(e.experience_years),2) AS average_years
FROM project AS p
JOIN employee AS e 
ON p.employee_id = e.employee_id
GROUP BY p.project_id;
