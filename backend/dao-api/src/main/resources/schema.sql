DROP TABLE IF EXISTS sv_conf;

CREATE TABLE sv_conf (
    name VARCHAR(255) NOT NULL,
    value VARCHAR(500) NOT NULL,
    desc VARCHAR(100) NOT NULL DEFAULT '-',
    PRIMARY KEY (name)
);
