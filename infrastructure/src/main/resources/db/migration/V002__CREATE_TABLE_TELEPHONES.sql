CREATE TABLE telephones (
  telephone_id           INT NOT NULL,
  person_id              INT NOT NULL,
  telephone_type         CHAR(3) NOT NULL,
  country_dialing_code   VARCHAR(8) NOT NULL,
  phone_number           VARCHAR(20) NOT NULL,
  phone_number_with_mask VARCHAR(20) NOT NULL,
  extension_code         VARCHAR(4) NOT NULL,
  verified_boolean       CHAR(1) NOT NULL DEFAULT 'N',
  creation_timestamp     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  last_update_timestamp  DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

ALTER TABLE telephones
ADD CONSTRAINT pk_telephones
PRIMARY KEY (telephone_id);

ALTER TABLE telephones
MODIFY telephone_id INT AUTO_INCREMENT;

ALTER TABLE telephones
ADD CONSTRAINT fk_people_telephones
FOREIGN KEY (person_id)
REFERENCES people(person_id);

ALTER TABLE telephones
ADD CONSTRAINT ck_telephones_telephone_type
CHECK (telephone_type IN ('MOB', 'HOM', 'WOR', 'FAX', 'OTH'));

ALTER TABLE telephones
ADD CONSTRAINT ck_telephones_number
CHECK (
  LENGTH(phone_number) > 3 AND
  phone_number = REGEXP_REPLACE(phone_number_with_mask, '[^0-9]', '')
);

ALTER TABLE telephones
ADD CONSTRAINT ck_telephones_verified
CHECK (verified_boolean IN ('Y', 'N'));

CREATE UNIQUE INDEX idx_telephones_phone_number
ON telephones(phone_number, country_dialing_code, person_id);