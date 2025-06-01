CREATE TABLE IF NOT EXISTS application (
                                           id SERIAL PRIMARY KEY,
                                           designation VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    date_save TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE IF NOT EXISTS application_features (
                                                    id SERIAL PRIMARY KEY,
                                                    application_id INT NOT NULL,
                                                    feature_name VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    date_save TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (application_id) REFERENCES application(id) ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS societe_features (
                                                societe_id INT NOT NULL,
                                                feature_id INT NOT NULL,
                                                date_save TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                                date_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                                enabled BOOLEAN DEFAULT TRUE,
                                                FOREIGN KEY (societe_id) REFERENCES yvs_societes(id) ON DELETE CASCADE,
    FOREIGN KEY (feature_id) REFERENCES application_features(id) ON DELETE CASCADE,
    PRIMARY KEY (societe_id, feature_id)
    );