DROP SCHEMA IF EXISTS `dbpayments` ;
CREATE SCHEMA IF NOT EXISTS `dbpayments` 

CREATE TABLE IF NOT EXISTS `dbpayments`.`gasoline_payments` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `name` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `last_name` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `card_number` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `expiration_date_year` INT(11) NOT NULL,
  `expiration_date_month` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `gas_type` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `amount` DOUBLE NOT NULL,
  `gas_station` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  `seller_name` VARCHAR(45) CHARACTER SET 'utf32' NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf32
COLLATE = utf32_spanish_ci