-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema food-delivery-platform-user-db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema food-delivery-platform-user-db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `food-delivery-platform-user-db` DEFAULT CHARACTER SET utf8 ;
USE `food-delivery-platform-user-db` ;

-- -----------------------------------------------------
-- Table `food-delivery-platform-user-db`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `food-delivery-platform-user-db`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fullName` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `phonenumber` VARCHAR(45) NOT NULL,
  `dob` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `dietarypreference` VARCHAR(45) NOT NULL,
  `allergiesorFoodRestrictions:` VARCHAR(45) NOT NULL,
  `PreferredCuisine` VARCHAR(45) NOT NULL,
  `FavoriteIngredients` VARCHAR(45) NOT NULL,
  `PreferredDeliveryMethod` VARCHAR(45) NOT NULL,
  `Notification Preferences` VARCHAR(45) NOT NULL,
  `PreferredLanguage` VARCHAR(45) NOT NULL,
  `ReferralCode` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
