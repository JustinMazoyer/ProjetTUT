CREATE TABLE DISPOSITIF(ID INT GENERATED BY DEFAULT AS IDENTITY NOT NULL , NOM VARCHAR(128)  , DESCRIPTION VARCHAR(255)  , URL_PHOTO VARCHAR(255)  , VALIDE BOOLEAN ,     CONSTRAINT PK_DISPOSITIF PRIMARY KEY (ID) );

CREATE TABLE MODELE(ID INT GENERATED BY DEFAULT AS IDENTITY NOT NULL , ID_POSSEDE INT NOT NULL , NOM VARCHAR(32), DESCRIPTION VARCHAR(1000), CONSTRAINT PK_MODELE PRIMARY KEY (ID));

CREATE TABLE CATEGORIE(ID INT GENERATED BY DEFAULT AS IDENTITY NOT NULL, NOM VARCHAR(32), CONSTRAINT PK_CATEGORIE PRIMARY KEY (ID));

CREATE TABLE PATHOLOGIE(ID INT GENERATED BY DEFAULT AS IDENTITY NOT NULL, NOM VARCHAR(32), DESCRIPTION VARCHAR(255), CONSTRAINT PK_PATHOLOGIE PRIMARY KEY (ID));

CREATE TABLE REFERENCE(CODE INT GENERATED BY DEFAULT AS IDENTITY NOT NULL, LIEN VARCHAR(255), CONSTRAINT PK_REFERENCE PRIMARY KEY (CODE));

CREATE TABLE MENTION(ID INT NOT NULL, CODE INT NOT NULL, ID_1 INT NOT NULL, CONSTRAINT PK_MENTION PRIMARY KEY (ID, CODE,ID_1));

CREATE TABLE APPARTIENT(ID INT NOT NULL, ID_1 INT NOT NULL, CONSTRAINT PK_APPARTIENT PRIMARY KEY (ID, ID_1));

CREATE TABLE CONSTRUCTEUR(ID INT NOT NULL, NOM VARCHAR(255), CONSTRAINT PK_CONSTRUCTEUR PRIMARY KEY (ID));

CREATE TABLE CONCERNE(ID INT NOT NULL, ID_1 INT NOT NULL, CONSTRAINT PK_CONCERNE  PRIMARY KEY (ID, ID_1));

ALTER TABLE MODELE ADD CONSTRAINT FK_MODELE_DISPOSITIF FOREIGN KEY (ID_POSSEDE) REFERENCES DISPOSITIF(ID);

ALTER TABLE MENTION ADD CONSTRAINT FK_MENTION_DISPOSITIF FOREIGN KEY (ID) REFERENCES DISPOSITIF(ID);

ALTER TABLE MENTION ADD CONSTRAINT FK_MENTION_REFERENCE  FOREIGN KEY (CODE) REFERENCES REFERENCE (CODE);

ALTER TABLE MENTION ADD CONSTRAINT FK_MENTION_PATHOLOGIE FOREIGN KEY (ID_1) REFERENCES PATHOLOGIE (ID);

ALTER TABLE APPARTIENT ADD CONSTRAINT FK_APPARTIENT_DISPOSITIF FOREIGN KEY (ID) REFERENCES DISPOSITIF (ID);

ALTER TABLE APPARTIENT ADD CONSTRAINT FK_APPARTIENT_CATEGORIE FOREIGN KEY (ID_1) REFERENCES CATEGORIE (ID);

ALTER TABLE CONCERNE ADD CONSTRAINT FK_CONCERNE_DISPOSITIF FOREIGN KEY (ID) REFERENCES DISPOSITIF (ID);

ALTER TABLE CONCERNE ADD CONSTRAINT FK_CONCERNE_PATHOLOGIE FOREIGN KEY (ID_1) REFERENCES PATHOLOGIE (ID);



