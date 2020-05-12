SELECT * 
INTO OUTFILE '/tmp/data.csv'
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
ESCAPED BY '\\'
LINES TERMINATED BY '\n'
FROM tick
WHERE pair='BTC-DGB' AND 
    request_time > '2017-08-01' AND 
    request_time < '2017-08-15' limit 10;