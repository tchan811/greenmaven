ALTER TABLE catalog ADD COLUMN units_available INT DEFAULT 0 NOT NULL;

ALTER TABLE inventory MODIFY measure FLOAT(8,4) DEFAULT 0.0000 NOT NULL;

ALTER TABLE inventory ADD COLUMN inventory_code VARCHAR(4) DEFAULT NULL;