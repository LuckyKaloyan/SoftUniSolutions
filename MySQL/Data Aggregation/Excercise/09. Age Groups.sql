SELECT  IF(age<11,'0-10',
            IF(age<21,'[11-20]',
			IF(age<31,'[21-30]',
            IF(age<41,'[31-40]',
            IF(age<51,'[41-50]',
            IF(age<61,'[51-60]','[61+]')))))) 
            AS 'age_group', COUNT(age)
            FROM wizzard_deposits
            GROUP BY age_group 
            ORDER BY age_group ASC ;