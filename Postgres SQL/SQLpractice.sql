----*******Easy
--Show first name, last name, and gender of patients who's gender is 'M'
SELECT first_name,last_name,gender
FROM patients
where gender = 'M'


--Show how many patients have a birth_date with 2010 as the birth year.
Select count(*)
from patients
Where Year(birth_date) = 2010; 








--****medium

--Show unique birth years from patients and order them by ascending
Select  distinct Year(birth_date) as birth_years
from patients
order by birth_date asc;


--Display every patient's first_name.
Order the list by the length of each name and then by alphbetically
Select first_name
from patients
order by len(first_name)asc, first_name asc;

--Show unique first names from the patients table which only occurs once in the list.
Select  first_name
from patients
GROUP BY first_name
having count(first_name) = 1;

--Show patient_id and first_name from patients where their first_name start and ends with 's'
--and is at least 6 characters long.
SELECT
  patient_id,
  first_name
FROM patients
WHERE
  first_name LIKE 's%s'
  AND len(first_name) >= 6;
  
  
--Show patient_id, first_name, last_name from patients whos diagnosis is 'Dementia'.
SELECT pat.patient_id, pat.first_name, pat.last_name 
from patients as pat 
join admissions as adm 
ON adm.patient_id = pat.patient_id
where adm.diagnosis = 'Dementia';




--Show the total amount of male patients and the total amount of female patients in the patients table.
--Display the two results in the same row.
SELECT 
  (SELECT count(*) FROM patients WHERE gender='M') AS male_count, 
  (SELECT count(*) FROM patients WHERE gender='F') AS female_count;
  
--  Show first and last name, allergies from patients which have allergies to either 'Penicillin' or 'Morphine'. 
--Show results ordered ascending by allergies then by first_name then by last_name.
SELECT first_name, last_name, allergies
FROM patients
WHERE allergies IN ('Penicillin', 'Morphine')
ORDER BY
  allergies,
  first_name,
  last_name;
  
--Show patient_id, diagnosis from admissions. Find patients admitted multiple times for the same diagnosis.
SELECT patient_id, diagnosis
FROM admissions
GROUP BY
  patient_id,
  diagnosis
HAVING COUNT(*) > 1;

--Show the city and the total number of patients in the city.
--Order from most to least patients and then by city name ascending.
SELECT city,
  COUNT(*) AS num_patients
FROM patients
GROUP BY city
ORDER BY num_patients DESC, city asc;

--Show all allergies ordered by popularity. Remove NULL values from query.
SELECT allergies,
  COUNT(*) AS total_diagnosis
FROM patients
WHERE allergies IS NOT NULL
GROUP BY allergies
ORDER BY total_diagnosis DESC