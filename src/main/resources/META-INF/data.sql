INSERT INTO Categorie VALUES ( 1, 'Respiratoire');
INSERT INTO Categorie VALUES ( 2, 'Sanguin');
INSERT INTO Categorie VALUES ( 3, 'Cardiaque');
INSERT INTO Categorie VALUES ( 4, 'Poids');
INSERT INTO Categorie VALUES ( 5, 'Température');

INSERT INTO Dispositif VALUES ( 1, 'Débitmètre','Cet appareil mesure le volume d’air expiré par minutes dans le cas de patients atteints d’asthme', 'https://www.materielmedical.fr/1403-large_default/A-10022070-debitmetre-de-pointe-spengler-peak-flow-labo-fh.jpg',true);
INSERT INTO Dispositif VALUES ( 2, 'Lecteur glycémique','Cet appareil mesure le taux de sucre dans le sang dans le cas de diabètes', 'https://www.robe-materiel-medical.com/images_produits/zoom/image_3420_lecteur-portable-inr-appareil-u-pt_2.jpg?1558953578',true);
INSERT INTO Dispositif VALUES ( 3, 'Tensiomètre','Cet appareil mesure la pression artérielle et permet de prévenir les cas d’hypertension et surveiller les effets des traitements prescrits','https://www.smsp.fr/media/cache/sylius_shop_product_large_thumbnail/8b/d6/b7ee72faa3841ed896d59cd7cb91.jpeg',true);
INSERT INTO Dispositif VALUES ( 4, 'Thermomètre ','Cet appareil mesure la température corporelle','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cflou.com%2Fthermometre-parlant%2F168-thermometre-parlant-infrarouge.html&psig=AOvVaw1m19xD5VlpPjkODSwF0v1_&ust=1587977467348000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNj_p5nbhekCFQAAAAAdAAAAABAE',true);
INSERT INTO Dispositif VALUES ( 5,  'Impédancemetre ','Cet appareil mesure la  masse corporelle','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.boulanger.com%2Fref%2F8004142&psig=AOvVaw3tzEwCq2eFSUNObddXQ2EV&ust=1587977614790000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJivz-HbhekCFQAAAAAdAAAAABAD',true);
INSERT INTO Dispositif VALUES ( 6,  'Oxymetre de poul ','Cet appareil mesure la saturation en oxygène dans le sang','https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.girodmedical.com%2Foxymetre-de-pouls-oxy-one.html&psig=AOvVaw3-_lQGTp3sENingwOp6_zM&ust=1587978019017000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCIiSyaDdhekCFQAAAAAdAAAAABAE',true);

INSERT INTO Modele VALUES ( 1, 1,'Débitmètre SmartOne', 'Le SmartOne, le débitmètre connecté, mesure le DEP (débit expiratoire de pointe) et le VEMS (volume maximal expiré en 1 seconde)');
INSERT INTO Modele VALUES ( 2, 2,'MyGluco', 'Il permet de contrôler ses objectifs glycémiques de façon personnalisée');
INSERT INTO Modele VALUES ( 3, 3,'Tensiomètre TB-101 de Spengler', 'Il est capable de gérer les mesures pour deux utilisateurs.');
INSERT INTO Modele VALUES ( 4, 3,'B10', ' tensiomètre anéroïde');
INSERT INTO Modele VALUES ( 5, 3,' 04.11134.232', ' tensiomètre manopoire');
INSERT INTO Modele VALUES ( 6, 3,' SWITCH 2.0 HOMECARE', ' tensiomètre manopoire / avec stéthoscope');
INSERT INTO Modele VALUES ( 7, 3,' VARIO', ' tensiomètre à cadran');
INSERT INTO Modele VALUES ( 8, 3,' A-50', ' tensiomètre manobrassard');


INSERT INTO Modele VALUES ( 9, 2,'TD-4216', 'lecteur de glycémie à usage domestique / bluetooth / usb / cholestérol');
INSERT INTO Modele VALUES ( 10, 2,'TD-4239', 'lecteur de glycémie à usage domestique /Avertissement de cétone');
INSERT INTO Modele VALUES ( 11, 2,'GLUCOAEGIS 3 IN 1',  'lecteur de glycémie à usage domestique / cholestérol / acide urique');
INSERT INTO Modele VALUES ( 12, 2,' E2 SERIES', 'lecteur de glycémie à usage domestique / sans code / avec mode parlant');
INSERT INTO Modele VALUES ( 13, 2,'PM-900 FASTTEST DIAGNOPRO', 'glucomètre pour hôpitaux / mini / avec stylo autopiqueur / avec port usb');
INSERT INTO Modele VALUES ( 14, 2,'PM-100', 'glucomètre avec stylo autopiqueur');
INSERT INTO Modele VALUES ( 15, 2,'MEDISMART® SAPPHIRE','lecteur de glycémie automatique / à usage domestique / avec stylo autopiqueur / sans code');
INSERT INTO Modele VALUES ( 16, 1,' 4043', 'débitmètre massique / de gaz / avec afficheur LCD');
INSERT INTO Modele VALUES ( 17, 1,' 5000 SERIES','débitmètre de gaz / massique / avec affichage numérique');
INSERT INTO Modele VALUES ( 18, 1,' peakflow R-Plus',' Débimètre de mesure mécanique du DEP');
INSERT INTO Modele VALUES (19,3,'Tensiosmart','Les mesures s’affichent directement sur son écran et sont également synchronisées avec une tablette ou un smartphone via une connexion Bluetooth pour visualiser les courbes d’évolution de la tension grâce à l’application. L’appareil peut garder en mémoire les 60 dernières mesures. Il détecte également un rythme cardiaque irrégulier. Par un message d’erreur, il indique si le brassard est mal attaché ou si un mouvement a été détecté pendant la mesure.');
INSERT INTO Modele VALUES (20,3,'Tensoval Duo Control II','Le Tensoval Duo Control de Hartmann est un tensiomètre à bras qui peut gérer les prises de tension de deux utilisateurs. Ce modèle automatique garde en mémoire les 60 dernières mesures et calcule la tension moyenne sur les 7 derniers jours. Il détecte également les fréquences cardiaques irrégulières. Il se veut plus précis et plus fiable que ses concurrents car, en plus d’utiliser la mesure oscillométrique (technique traditionnelle des tensiomètres électroniques), il recourt à la méthode auscultatoire de Korotkoff : comme un médecin, il écoute les sons produits par le pouls grâce à son microphone intégré. ');
INSERT INTO Modele VALUES (21,3,'Beurer BM40','Le Beurer BM 40 est un tensiomètre électronique à bras qui mesure la tension artérielle et le pouls en appuyant sur un seul bouton. Muni d’un détecteur d’anomalies et d’arythmies cardiaques (susceptibles de fausser les mesures de tension), il peut enregistrer 60 mesures avec la date et l’heure pour deux utilisateurs et en calculer la moyenne sur les 7 derniers jours. Cet appareil est livré avec une trousse de rangement et un brassard standard pour les tours de bras compris entre 22 et 35 cm. ');
INSERT INTO Modele VALUES ( 22, 1,'Asmalert','Permet un auto-controle sonore. Créer pour les enfants. Plage de mesure entre 130 l/mn et 5340 l/mn');
INSERT INTO Modele VALUES ( 23, 1,'Respalert','Débimètre de pointe siffleur. A régler 20% en dessous de la valeur normale du patient. Ensuite, s’il entend un sifflement tout est bon.');
INSERT INTO Modele VALUES ( 24, 2,'Accu Check Performa','Glucométre destiné aux personnes diabétique. Dispositif d auto-surveillance gardant en mémoire les 500 dernières mesures ainsi que le taux de glycémie moyen des 7,14 et 30 derniers jours. Données pouvant être transféré sur un PC par infrarouge. S utilise avec des bandelettes larges à usage unique qui s éjectent automatiquement après utilisation. Durée de vie des piles: Environ 2000 mesures.');
INSERT INTO Modele VALUES ( 25, 5,'Beurer BF 700','Analyse complète - Le poids, la graisse, l eau, la masse musculaire et la masse osseuse, aussi bien que votre IMC, sont précisément mesurés et transférés directement via Bluetooth sur votre Smartphone. Balance connectée - Avec l application et le logiciel "Beurer HealthManager" (transmission par technologie basse consommation Bluetooth), vous pouvez évaluer graphiquement vos valeurs mesurées. 8 Mémoires utilisateurs - Le pèse-personne dispose de 8 emplacements de mémoire automatiques dans lesquels vous (et votre famille) pouvez enregistrer vos paramètres personnels individuellement. Écran XL noir - Les résultats sur le grand écran LCD noir, avec éclairage blanc et affichage des initiales de l utilisateur, sont faciles à lire et clairs à comprendre. Affichage des calories - Calcul précis des dépenses caloriques sous forme du taux de base (Basic Metabolic Rate) et du taux actif (Active Metabolic Rate) parfait pour la remise en forme et les régimes.');
INSERT INTO Modele VALUES ( 26, 4,'ThermoFlax LX26','Prise de température frontale, thermomètre sans contact, totalement indolore. Alerte sonore en cas de dépassement de température. Mémorisation des 32 dernières prises de température. Convient également aux personnes âgées et aux personnes à mobilité réduite. Pas de contact donc pas de désinfection nécessaire après utilisation (pas d embout à changer) sans risque de contamination. Arrêt automatique après 5 secondes (économiseur d énergie)');
INSERT INTO Modele VALUES ( 27, 6,'SP250 Pro','Sa haute précision diagnostiquera en temps réel un manque d oxygène et facilitera une prise en charge rapide des services médicaux. Vous obtenez le résultat immédiatement de votre saturation d oxygène dans le sang, ainsi que la fréquence et l intensité du pouls sanguin en insérant uniquement votre doigt. Sans aucune douleur ni prélèvement de sang.');


INSERT INTO Pathologie VALUES ( 1,'Asthme', 'Maladie respiratoire chronique due à une inflammation permanente des bronches');
INSERT INTO Pathologie VALUES ( 2,'Diabète','Maladie qui se caractérise par une hyperglycémie chronique, c est-à-dire un excès de sucre dans le sang et donc un taux de glucose (glycémie) trop élevé.');
INSERT INTO Pathologie VALUES ( 3,'Hypertension','Maladie qui se caractérise par une pression anormalement forte du sang sur la paroi des artères.');
INSERT INTO Pathologie VALUES ( 4,'Obésité','Maladie qui se caractérise par un surpoids de la personne.');
INSERT INTO Pathologie VALUES ( 5,'Température','Maladie qui se caractérise par une température corporelle anormalement élevée.');


INSERT INTO Concerne VALUES (1,1);
INSERT INTO Concerne VALUES (2,2);
INSERT INTO Concerne VALUES (3,3);
INSERT INTO Concerne VALUES (5,4);
INSERT INTO Concerne VALUES (4,5);


INSERT INTO Appartient VALUES (1,1);
INSERT INTO Appartient VALUES (2,2);
INSERT INTO Appartient VALUES (3,3);
INSERT INTO Appartient VALUES (5,4);
INSERT INTO Appartient VALUES (4,5);
INSERT INTO Appartient VALUES (6,2);


INSERT INTO Modele VALUES ( 30, 2,'Freestyle Optium Neo',  'Freestyle Optium Neo est un système de surveillance de la glycémie et de la cétonémie qui affiche un résultat en 5 secondes. Il est capable de mémoriser les 1000 derniers tests avec l heure, la date et le jour de la semaine');
INSERT INTO Modele VALUES ( 31, 2,'Contour XT de Bayer', 'C est un système d’autocontrôle glycémique fiable avec des fonctionnalités complètes et évolutives nécessitant une éducation d un personnel médical.');
INSERT INTO Modele VALUES ( 32, 2,'Sanofi Aventis BGStar', 'BGStar des laboratoires Sanofi Aventis est un lecteur de glycémie compact et intuitif, simple à utiliser et précis, il aide les personnes atteintes de diabète à gérer leur maladie paisiblement.');
INSERT INTO Modele VALUES ( 33, 3,'iHealth push', 'Avec le tensiomètre poignet iHealth push, mesurez votre pression artérielle et votre pouls, consultez vos résultats directement sur l écran qui change de couleur en fonction des résultats ou sur votre smartphone via l application iHealth MyVitals');
INSERT INTO Modele VALUES ( 34, 6,'Oxypad Home','Oxymètre sur doigt très pratique, cet appareil médical peut fonctionner jusqu à 30 heures en continu. L Oxypad s arrête automatiquement, après 5 secondes sans utilisation. Oxymètre digital complet et précis pour une surveillance rapide du rythme cardiaque et du taux de saturation en oxygène de l hémoglobine (SpO2)');
INSERT INTO Modele VALUES ( 35, 6,'Oxysmart Spengler', 'L oxymètre portable Oxystart est simple d’utilisation, placé au bout de l index, mesure avec précision la SpO2 (saturation pulsée en oxygène) et la fréquence du pouls, pour une surveillance ponctuelle ou continue');
INSERT INTO Modele VALUES ( 36, 3,'Rossmax CH155','Ce tensiomètre électronique Rossmax CH155, distribué par Colson est doté de la fonction Real Fuzzy Technology : niveau de gonflage/dégonflage adapté à chaque mesure. Dispose d’un détecteur d arythmie cardiaque (IHB). Doté d un indicateur de risque d hypertension.');
INSERT INTO Modele VALUES ( 37, 1,'Vitalograph ASMA-1','Le débitmètre de pointe électronique ASMA-1 calcule le FEV-1(VEMS : Volume Expiratoire Maximal en 1 Seconde) et le DEP(Débit Expiratoire de Pointe) et affiche les résultats de manière lisible sur son large écran LCD');
INSERT INTO Modele VALUES ( 38, 1,'Pocket Peak nSpire', 'Le Pocket Peak est un débitmètre mécanique discret et peu encombrant dont le design ergonomique facilite la prise en main. Il participe au dépistage et au suivi de l asthme ainsi qu à la prévention de crise.');
INSERT INTO Modele VALUES ( 39, 4,'ThermoScan 3 IRT 3030', 'Le thermomètre Braun ThermoScan 3 est un thermomètre auriculaire à usage domestique, mesurant précisément la chaleur infrarouge émise par le tympan et les tissus environnants. Le résultat s affiche en seulement 1 seconde sur l écran LCD. Une alarme sonore se déclenche en cas de fièvre.');
INSERT INTO Modele VALUES ( 40, 4,'Thermoscope LBS', 'Le Thermoscope LBS est un thermomètre hygiénique permettant de prendre la température corporelle ou d une surface sans contact. Il limite ainsi les risques de transmissions croisées de microbes ou de virus.');
INSERT INTO Modele VALUES ( 41, 5,'Tanita BC543 Innerscan', 'Cette balance impédancemètre plateforme BC543 Innerscan Tanita est parfaite pour suivre les variations de poids et de votre composition corporelle au fil du temps. Mémoire pour 4 utilisateurs différents de 7 à 99 ans.');
INSERT INTO Modele VALUES ( 42, 5,'Tanita DC430 MA P-Classe III', 'La balance impédancemètre colonne professionnelle DC430 MA P Tanita est la dernière venue de la gamme d analyseurs de composition corporelle Tanita, elle imprime les mesures de composition corporelle (poids, indice de masse corporelle, métabolisme de base, taux de masse graisseuse, masse graisseuse, masse hydrique, masse minérale osseuse) et est dotée d un indicateur de masse viscérale unique.');
INSERT INTO Modele VALUES ( 43, 5,'Omron BF 212', 'La balance impédancemètre Omron BF 212 est un dispositif médical conçu pour mesurer et afficher le poids en utilisant la méthode de l’impédance bioélectrique. La balance est dotée de 2 modes : un mode invité permettant de prendre les mesures sans pour autant que les données soient stockées et le mode profil personnel où il est possible d’enregistrer les données de 4 utilisateurs différents.');
INSERT INTO Modele VALUES ( 44, 5,'Seca 804 sensa', 'Le pèse-personne Seca Sensa 804 dispose de 24 électrodes chromées agencées de façon à assurer le contact avec la peau : outre le poids, elle permet également la mesure du taux de graisse et d’eau corporelle et le calcul automatique de l’indice BMI.');



