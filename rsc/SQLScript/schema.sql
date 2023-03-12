(C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/

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