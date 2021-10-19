CREATE database javaassignment;
use javaassignment;

/*
	All Data used in the these tables was found on Bodog
*/
DROP TABLE IF EXISTS mvp;
DROP TABLE IF EXISTS dpoy;

CREATE TABLE mvp (
mvpplayerId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
mvpplayer VARCHAR(50),
mvpdate VARCHAR(12),
mvpodds INT
);
CREATE TABLE dpoy (
dpoyplayerId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
dpoyplayer VARCHAR(50),
dpoydate VARCHAR(12),
dpoyodds INT
);

INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 1300, '2021-09-09');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 1900, '2021-09-09');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 1200, '2021-09-09');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 1950, '2021-09-09');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 500, '2021-09-09');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 950, '2021-09-16');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 2000, '2021-09-16');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 1300, '2021-09-16');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 950, '2021-09-16');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 575, '2021-09-16');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 675, '2021-09-22');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 2250, '2021-09-22');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 1350, '2021-09-22');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 675, '2021-09-22');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 525, '2021-09-22');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 925, '2021-09-29');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 1050, '2021-09-29');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 900, '2021-09-29');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 800, '2021-09-29');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 800, '2021-09-29');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 1300, '2021-10-06');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 825, '2021-10-06');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 650, '2021-10-06');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 450, '2021-10-06');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 725, '2021-10-06');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Tom Brady", 800, '2021-10-13');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Justin Herbert", 650, '2021-10-13');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Josh Allen", 450, '2021-10-13');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Kyler Murray", 500, '2021-10-13');
INSERT INTO mvp (mvpplayer, mvpodds, mvpdate) values ("Patrick Mahomes", 1650, '2021-10-13');

INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 550, "2021-09-09");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 500, "2021-09-09");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 8000, "2021-09-09");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 1450, "2021-09-09");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 825, "2021-09-09");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 550, "2021-09-16");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 525, "2021-09-16");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 7200, "2021-09-16");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 1500, "2021-09-16");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 825, "2021-09-16");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 700, "2021-09-22");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 625, "2021-09-22");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 7000, "2021-09-22");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 1500, "2021-09-22");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 1050, "2021-09-22");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 375, "2021-09-29");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 475, "2021-09-29");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 6500, "2021-09-29");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 2000, "2021-09-29");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 1600, "2021-09-29");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 375, "2021-10-06");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 625, "2021-10-06");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 1800, "2021-10-06");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 2000, "2021-10-06");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 1100, "2021-10-06");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Myles Garrett", 350, "2021-10-13");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Aaron Donald", 675, "2021-10-13");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Trevon Diggs", 900, "2021-10-13");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("Nick Bosa", 1700, "2021-10-13");
INSERT INTO dpoy (dpoyplayer, dpoyodds, dpoydate) values("T.J Watt", 1200, "2021-10-13");
