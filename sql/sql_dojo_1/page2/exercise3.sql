/* 
dapatkan jumlah total usia unik pengguna dan
kelompokan pengguna tersebut berdasarkan usia
*/
SELECT age, count(age) AS "COUNT(*)"
FROM users
GROUP BY age
;