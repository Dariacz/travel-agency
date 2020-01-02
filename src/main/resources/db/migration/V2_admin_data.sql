DROP DATABASE IF EXISTS coountry;
DROP DATABASE IF EXISTS continents;
DROP DATABASE IF EXISTS trip;
DROP DATABASE IF EXISTS hotel;
DROP DATABASE IF EXISTS city;
DROP DATABASE IF EXISTS airport;

INSERT INTO continents
VALUES ('1', 'Europa');
INSERT INTO continents
VALUES ('2', 'Azja');
INSERT INTO continents
VALUES ('3', 'Afryka');
INSERT INTO continents
VALUES ('4', 'Ameryka Południowa');
INSERT INTO continents
VALUES ('5', 'Ameryka Północna');
INSERT INTO continents
VALUES ('6', 'Australia');
INSERT INTO continents
VALUES ('7', 'Antarktyda');

INSERT INTO country
VALUES ('1', 'Polska', '1');
INSERT INTO country
VALUES ('2', 'Hiszpania', '1');

INSERT INTO city
VALUES ('1', 'Warszawa', '1');
INSERT INTO city
VALUES ('2', 'Alicante', '2');

INSERT INTO hotel
VALUES ('1', 'Hotel harmonijnie łączący współczesną infrastrukturę z tradycją arabskiej architektury. Przesłanie hotelu brzmi czuj się jak w domu".', 'First Central Apartments', '5', '1');
INSERT INTO hotel
VALUES ('2', 'publiczna, piaszczysto-kamienista, ok. 1,5 km od hotelu (Bugibba)', 'Gillieru Harbour', '5', '2');


INSERT INTO airport
VALUES ('1', 'Lotnisko Chopina', '2');
INSERT INTO airport
VALUES ('2', 'Port lotniczy Alicante', '1');


INSERT INTO trip
VALUES ('1', '8099.99', '50', '1349.99', '35', '7', '2020-08-23', '1', '2020-12-16', 'BB', '1', '1', '2', '2', '1');
INSERT INTO trip
VALUES ('2', '9899.99', '30', '2499.99', '10', '12', '2020-09-29', '0', '2020-12-17', 'HB', '2', '1', '2', '1', '1');
