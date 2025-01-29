SELECT id,name, IF(area<=100,'very small',
IF(area<=1000,'small',
IF(area<=10000,'medium',
IF(area<=50000,'large','very large')))) FROM preserves ORDER BY area DESC;