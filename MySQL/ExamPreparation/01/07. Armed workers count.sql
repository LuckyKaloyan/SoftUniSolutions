SELECT name, SUM(is_armed) FROM preserves JOIN workers ON preserves.id = workers.preserve_id 
GROUP BY name HAVING SUM(is_armed)>0 ORDER BY SUM(is_armed) DESC, name;