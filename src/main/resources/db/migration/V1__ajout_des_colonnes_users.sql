-- Script SQL pour ajouter les colonnes de UsersEntity dans la table yvs_users
ALTER TABLE yvs_users ADD COLUMN prenom VARCHAR(255);
ALTER TABLE yvs_users ADD COLUMN phone_number VARCHAR(50);
ALTER TABLE yvs_users ADD COLUMN email VARCHAR(255);
ALTER TABLE yvs_users ADD COLUMN blocked BOOLEAN;
ALTER TABLE yvs_users ADD COLUMN email_verified BOOLEAN;
ALTER TABLE yvs_users ADD COLUMN phone_number_verified BOOLEAN;
ALTER TABLE yvs_users ADD COLUMN only_connect_with_planing BOOLEAN;
ALTER TABLE yvs_users ADD COLUMN request_password_reset BOOLEAN;
ALTER TABLE yvs_users ADD COLUMN langue VARCHAR(10);
ALTER TABLE yvs_users ADD COLUMN theme_color VARCHAR(50);
ALTER TABLE yvs_users ADD COLUMN fuseau_horaire VARCHAR(50);

