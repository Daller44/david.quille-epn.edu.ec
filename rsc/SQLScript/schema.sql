(C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/
CREATE TABLE IF NOT EXISTS USUARIOS
(    USUARIOS             VARCHAR(20) NOT NULL
    ,CONTRASENA        VARCHAR(100)NOT NULL
);
------------------------------------------------------------------------
INSERT INTO USUARIOS   (USUARIOS, CONTRASENA )
            VALUES      ('david.quille@epn.edu.ec', '8425d7aa5a697e5b7f5f7646b42bedca'); 
INSERT INTO USUARIOS   (USUARIOS, CONTRASENA )
            VALUES      ('profe', '81dc9bdb52d04dc20036dbd8313ed055');
------------------------------------------------------------------------
SELECT * FROM USUARIOS;

DROP TABLE IF EXISTS COORDENADAS;

    CREATE TABLE IF NOT EXISTS COORDENADAS
    (
    
    AM_CAPACIDAD       INTEGER NUll,
    AM_GEO             VARCHAR(20) NOT NULL,
    AM_ARSENAL         VARCHAR(20) NOT NULL,
    AM_FECHA_HACK      VARCHAR(20) DEFAULT(datetime('now'))
    );

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (8, 'GPS8', 'abbccdt');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (6, 'GPS6', 'act');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (6, 'GPS6', 'act');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (3, 'GPS3', 'bcd');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (5, 'GPS5', 'bct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (5, 'GPS5', 'bct');
    
    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (1, 'GPS1', 'bc');

SELECT * FROM COORDENADAS;