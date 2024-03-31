-- Insertion des rôles
INSERT INTO `role` (`designation`) VALUES
                                       ('CHEF_CHANTIER'),
                                       ('OUVRIER'),
                                       ('TECHNICIEN'),
                                       ('ADMIN');

-- Insertion des utilisateurs
INSERT INTO `user` (`role_id`, `email`, `password`) VALUES
                                                                    (1, 'chef4', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (2, 'ouvrier4', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (3, 'technicien1', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (4, 'admin1', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (1, 'chef5', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (2, 'ouvrier5', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (3, 'technicien2', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS'),
                                                                    (4, 'admin2', '$2a$12$jjtv5b3.MDXtk8oGgslLoe1d6IhzRDzeERixHLtJw7by9c3gyHetS');
-- Insertion des consommables
INSERT INTO `consommable` (`name`) VALUES
                                      ('Ruban isolant'),
                                      ('Lampe LED'),
                                      ('Perceuse'),
                                      ('Scie circulaire'),
                                      ('Marteau'),
                                      ('Échelle'),
                                      ('Niveau laser'),
                                      ('Casque de sécurité'),
                                      ('Gants de travail');


-- Insertion des tâches
INSERT INTO `tache` (`temps`, `name`) VALUES
                                         (45, 'Isolation des combles'),
                                         (30, 'Installation de l’éclairage LED'),
                                         (120, 'Perçage des murs porteurs'),
                                         (150, 'Découpe des planches de bois'),
                                         (60, 'Montage des échafaudages'),
                                         (90, 'Vérification des niveaux'),
                                         (20, 'Équipement de sécurité'),
                                         (110, 'Manutention des matériaux');

-- Insertion des chantiers
INSERT INTO `chantier` (`client_id`, `ouvrier_id`, `name`, `adresse`) VALUES
                                                                         (1, 8, 'Rénovation Appartement Durand', '321 Rue Secondaire'),
                                                                         (2, 9, 'Construction Pavillon Lemaire', '654 Allée des Artisans'),
                                                                         (3, 10, 'Agrandissement Bureau Morel', '987 Voie Rapide');

-- Insertion des opérations
INSERT INTO `operation` (`chantier_id`, `date`, `ouvrier_id`, `tache_id`, `name`) VALUES
                                                                                     (4, '2024-04-07', 8, 13, 'Isolation des combles Durand'),
                                                                                     (4, '2024-04-08', 8, 14, 'Installation éclairage LED Durand'),
                                                                                     (5, '2024-04-09', 9, 15, 'Perçage murs porteurs Lemaire'),
                                                                                     (5, '2024-04-10', 9, 16, 'Découpe bois Lemaire'),
                                                                                     (6, '2024-04-11', 10, 17, 'Montage échafaudages Morel'),
                                                                                     (6, '2024-04-12', 10, 18, 'Vérification niveaux Morel');

-- Insertion des associations tâche-consommable
INSERT INTO `tache_consommable` (`tache_id`, `consommable_id`) VALUES
                                                                   (13, 19),
                                                                   (14, 20),
                                                                   (15, 21),
                                                                   (16, 22),
                                                                   (17, 23),
                                                                   (18, 24),
                                                                   (13, 25),
                                                                   (14, 26),
                                                                   (15, 27),
                                                                   (16, 28),
                                                                   (17, 29),
                                                                   (18, 19);