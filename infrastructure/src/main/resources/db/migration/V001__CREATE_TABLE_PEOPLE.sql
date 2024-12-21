CREATE TABLE people (
  person_id             INT NOT NULL,
  person_type           CHAR(3) NOT NULL,
  main_name             VARCHAR(60) NOT NULL,
  social_name           VARCHAR(60) NOT NULL,
  main_country_code     CHAR(3) NOT NULL,
  national_id           VARCHAR(50) NOT NULL,
  email_description     VARCHAR(250) NOT NULL,
  creation_timestamp    DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  last_update_timestamp DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE people
ADD CONSTRAINT pk_people
PRIMARY KEY (person_id);

ALTER TABLE people
MODIFY person_id INT AUTO_INCREMENT;

ALTER TABLE people
ADD CONSTRAINT ck_people_person_type
CHECK (person_type IN ('NAT', 'LEG'));

CREATE INDEX idx_people_main_name
ON people(main_name);

CREATE INDEX idx_people_social_name
ON people(social_name);

CREATE UNIQUE INDEX idx_people_national_id
ON people(national_id, main_country_code, person_type);