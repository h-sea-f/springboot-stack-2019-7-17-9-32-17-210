CREATE TABLE `case`(
`id` INT auto_increment PRIMARY KEY,
`case_name` VARCHAR(255) NOT NULL ,
`case_time` LONG NOT NULL,
`information_id` INT NOT NULL,
`institute_id` INT NOT NULL
)