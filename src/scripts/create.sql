##DB1
CREATE TABLE rc1table
(
  id bigint NOT NULL,
  name character(45),
  CONSTRAINT config_key_1 PRIMARY KEY (id)
)

CREATE TABLE rc2table
(
  id bigint NOT NULL,
  name character(45),
  org character(10),
  CONSTRAINT rc2table_key_1 PRIMARY KEY (id)
)

##DB2
CREATE TABLE demotable
(
  id bigint NOT NULL,
  name character(45),
  CONSTRAINT userdemo_key_1 PRIMARY KEY (id)
)

CREATE TABLE demo1table
(
  id bigint NOT NULL,
  name character(45),
  org character(10),
  CONSTRAINT demo1table_key_1 PRIMARY KEY (id)
)