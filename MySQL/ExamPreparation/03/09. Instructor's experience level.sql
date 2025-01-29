SELECT CONCAT(first_name,' ',last_name) AS 'full_name',
IF(YEAR(has_a_license_from)>=1980 AND YEAR(has_a_license_from)<1990,'Specialist',
IF(YEAR(has_a_license_from)<2000,'Advanced',
IF(YEAR(has_a_license_from)<2008,'Experienced',
IF(YEAR(has_a_license_from)<2015,'Qualified',
IF(YEAR(has_a_license_from)<2020,'Provisional',"Trainee"
)))))


 AS 'level' FROM instructors ORDER BY YEAR(has_a_license_from) ASC, first_name;