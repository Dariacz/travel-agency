DROP DATABASE IF EXISTS country;
DROP DATABASE IF EXISTS continents;
DROP DATABASE IF EXISTS trip;
DROP DATABASE IF EXISTS hotel;
DROP DATABASE IF EXISTS city;
DROP DATABASE IF EXISTS airport;

INSERT INTO continent
VALUES ('1', 'Europa');
INSERT INTO continent
VALUES ('2', 'Azja');
INSERT INTO continent
VALUES ('3', 'Afryka');
INSERT INTO continent
VALUES ('4', 'Ameryka Południowa');
INSERT INTO continent
VALUES ('5', 'Ameryka Północna');
INSERT INTO continent
VALUES ('6', 'Australia');
INSERT INTO continent
VALUES ('7', 'Antarktyda');

INSERT INTO country
VALUES ('1', 'Polska', '1');
INSERT INTO country
VALUES ('2', 'Hiszpania', '1');
INSERT INTO country
VALUES ('3', 'Wietnam', '2');
INSERT INTO country
VALUES ('4', 'Kenia', '3');

INSERT INTO city
VALUES ('1', 'Warszawa', '1');
INSERT INTO city
VALUES ('2', 'Alicante', '2');
INSERT INTO city
VALUES ('3', 'Ho Chi Minh City', '3');
INSERT INTO city
VALUES ('4', 'Mombasa', '4');

INSERT INTO hotel
VALUES ('1', 'Hotel harmonijnie łączący współczesną infrastrukturę z tradycją arabskiej architektury. Przesłanie hotelu brzmi czuj się jak w domu".', 'First Central Apartments', '5', '1');
INSERT INTO hotel
VALUES ('2', 'Publiczna, piaszczysto-kamienista, ok. 1,5 km od hotelu (Bugibba)', 'Gillieru Harbour', '5', '2');
INSERT INTO hotel
VALUES ('3', 'Dobrej klasy hotel zlokalizowany w zachodniej części kurortu Mui Ne, miejscowości która słynie z bajecznych, piaszczystych plaż ciągnących się przez kilkanaście kilometrów. ', 'Muine Bay Resort', '5', '3');
INSERT INTO hotel
VALUES ('4', 'Hotel położony jest na południowym wybrzeżu Mombasy, w bujnym, znakomicie utrzymanym ogrodzie. Obiekt składa się z kilku 3-piętrowych budynków zbudowanych w oryginalnym mauretańskim stylu.', 'Kaskazi Beach', '5', '4');


INSERT INTO airport
VALUES ('1', 'Lotnisko Chopina', '2');
INSERT INTO airport
VALUES ('2', 'Port lotniczy Alicante', '1');
INSERT INTO airport
VALUES ('3', 'Ho Chi Minh City / Saigon', '3');
INSERT INTO airport
VALUES ('4', 'Port lotniczy Mombasa', '4');


INSERT INTO trip
VALUES ('1', 'Wspaniała wycieszka', 'Najlepsza wycieczka twojego życia, która odmieni twój los', '8099.99', '50', '1349.99', '35', '7', '2020-08-23', '1', '2020-12-16', 'BB', '1', '1', '2', '2', '1');
INSERT INTO trip
VALUES ('2', 'Niepolecana wycieczka', 'Taka sobie wycieczka, bardzo droga, dużo ludzi i gorąco', '9899.99', '30', '2499.99', '10', '12', '2020-09-29', '0', '2020-12-17', 'HB', '2', '1', '2', '1', '1');
INSERT INTO trip
VALUES ('3', 'Wietnam / Wybrzeże Morza Południowochińskiego / Mui Ne', 'Obiekt znajduje się przy szerokiej, piaszczystej, prywatnej plaży. Leżaki i parasole na plaży - bezpłatne.', '1899.99', '30', '2499.99', '10', '15', '2020-11-01', '0', '2020-11-15', 'AL', '3', '3', '1', '1', '3');
INSERT INTO trip
VALUES ('4', 'Wybrzeże Mombasy', 'Rodzinny hotel położony w urokliwym ogrodzie, tuż przy pięknej piaszczystej plaży Diani. Polecamy zarówno parom jak i rodzinom z dziećmi ze względu na bogaty program animacyjny. Idealny hotel na aktywne wakacje w tropikalnym otoczeniu.', '11899', '30', '9000', '10', '10', '2020-11-01', '0', '2020-11-10', 'HB', '4', '4', '1', '1', '4');