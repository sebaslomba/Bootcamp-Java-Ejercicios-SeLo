CREATE TABLE fases (
id_fase SERIAL PRIMARY KEY,
nombre_fases VARCHAR(20)
);

CREATE TABLE grupos (
id_grupo SERIAL PRIMARY KEY,
nombre_grupo VARCHAR(100)
);
CREATE TABLE equipos(
id_equipo SERIAL PRIMARY KEY,
nombre_equipo VARCHAR(50),
pais VARCHAR(30),
id_grupo INT,
FOREIGN KEY(id_grupo) REFERENCES grupos(id_grupo)
);

CREATE TABLE partidos(
id_partido SERIAL PRIMARY KEY,
id_fase INT,
FOREIGN KEY (id_fase) REFERENCES fases(id_fase)
);

CREATE TABLE partidos_equipo(
id_partido INT,
id_equipo INT,
id_fase INT,
PRIMARY KEY(id_partido, id_equipo),
resultado VARCHAR(30),
FOREIGN KEY (id_partido) REFERENCES partidos(id_partido),
FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo)
);
CREATE TABLE jugadores(
id_jugador SERIAL PRIMARY KEY,
nombre_jugador VARCHAR(100),
nacionalidad VARCHAR(100),
id_equipo INT,
id_grupo INT,
FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo)
);

INSERT INTO fases(nombre_fases)
VALUES ('final'),('final'),
('Semifinales'),
('Semifinales 2'),
('Cuartos de Final'),
('Cuartos de Final 2'),
('Octavos de Final'),
('Octavos de Final 2')
;
INSERT INTO grupos(nombre_grupo)
VALUES ('Grupo A'), ('Grupo B'),('Grupo D'),('Grupo E'),('Grupo F'), ('Grupo G'), ('Grupo H'), 
('Grupo I'), ('Grupo J'), ('Grupo K'), ('Grupo L'), ('Grupo M'), ('Grupo N'), ('Grupo O'), ('Grupo P')
;

INSERT INTO equipos(nombre_equipo,pais,id_grupo)
VALUES ('Real Madrid', 'España',1),('Olympique de Lyon', 'Francia',2),('Borussia Dortmund', 'Alemania',3),
('Paris Saint-Germain', 'Francia',4),
('Olympique de Lyon', 'Francia',5),
('Juventus', 'Italia',6),
('Manchester United', 'Inglaterra',7),
('Liverpool', 'Inglaterra',8),
('Bayern Munich', 'Alemania',9),
('Flamengo', 'Brasil',10),
('River Plate', 'Argentina',11),
('Boca Juniors', 'Argentina',12),
('Seattle Sounders', 'Estados Unidos',13),
('Olimpia', 'Paraguay',14),
('Paris Saint-Germain', 'Francia',15);
INSERT INTO partidos(id_fase)
VALUES (1),(2),(3), (4), (5), (6), (7), (8), (1), (2), (3), (4), (5), (6), (7), (8);
INSERT INTO partidos_equipo(id_partido,id_equipo)
VALUES (1,17),(2,18),(3,19),(4,20),(5,21),(6,22),(7,23),(8,24),(1,25),(2,26),(3,27),(4,28),(5,29),(6,30),(7,31);
INSERT INTO jugadores(nombre_jugador,nacionalidad,id_equipo)
VALUES ('Karim Benzema', 'Francia', 17), 
('Robert Lewandowski', 'Polonia', 18), 
('Bruno Fernandes', 'Portugal', 19), 
('Mohamed Salah', 'Egipto', 20), 
('Thomas Müller', 'Alemania', 21), 
('Marco Reus', 'Alemania',22), 
('Kylian Mbappé', 'Francia', 23), 
('Alexandre Lacazette', 'Francia', 24), 
('Dusan Vlahovic', 'Serbia', 25), 
('Lautaro Martínez', 'Argentina', 26), 
('Dusan Tadic', 'Serbia', 27),  
('Gabriel Barbosa', 'Brasil', 28), 
('Julián Álvarez', 'Argentina', 29), 
('Darío Benedetto', 'Argentina', 30), 
('Raúl Ruidíaz', 'Perú', 31); 
DROP TABLE partidos_equipo;
DROP TABLE fases,grupos,equipos,partidos,jugadores;
SELECT * FROM grupos;
SELECT * FROM equipos;
DELETE FROM partidos_equipo;
DELETE FROM equipos;
DELETE FROM jugadores;
DELETE FROM fases;
DELETE FROM grupos;
DELETE FROM partidos;