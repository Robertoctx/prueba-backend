CREATE SEQUENCE seq_sucursal
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 1000;
    
CREATE TABLE sucursal (
    codigo_empresa NUMBER,
    codigo_sucursal NUMBER DEFAULT seq_sucursal.NEXTVAL,
    nombre_sucursal VARCHAR2(100) NOT NULL,
    region VARCHAR2(3) CONSTRAINT check_region CHECK (region in ('COS', 'SIE','ORI','INS')) NOT NULL,
    usuario_registro VARCHAR2(50) NOT NULL,
    fecha_registro DATE NOT NULL,
    CONSTRAINT pk_sucursal PRIMARY KEY (codigo_empresa, codigo_sucursal)
)

CREATE SEQUENCE seq_medico
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 1000;
    
CREATE TABLE medico (
    codigo_medico NUMBER DEFAULT seq_medico.NEXTVAL,
    tipo_identificacion VARCHAR2(1) CONSTRAINT check_tipo_identificacion CHECK (tipo_identificacion in ('C','R','P')) NOT NULL,
    numero_identificacion VARCHAR2(20) NOT NULL,
    primer_nombre VARCHAR2(25) NOT NULL,
    segundo_nombre VARCHAR2(25),
    primer_apellido VARCHAR2(25) NOT NULL,
    segundo_apellido VARCHAR2(25) NOT NULL,
    nombre_completo VARCHAR2(100) NOT NULL,
    mail VARCHAR2(50) NOT NULL,
    fecha_nacimiento DATE,
    sueldo NUMBER NOT NULL,
    sexo VARCHAR2(1) CONSTRAINT check_sexo CHECK (sexo in ('F','M')) NOT NULL,
    codigo_sucursal NUMBER NOT NULL,
    codigo_empresa NUMBER NOT NULL,
    usuario_registro VARCHAR2(50) NOT NULL,
    fecha_registro DATE NOT NULL,
    CONSTRAINT pk_medico PRIMARY KEY (codigo_medico),
    CONSTRAINT fk_sucursal FOREIGN KEY (codigo_empresa, codigo_sucursal) REFERENCES sucursal(codigo_empresa, codigo_sucursal)
)

INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Costa Oeste', 'COS', 'Roberto', SYSDATE);
INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Costa Norte', 'COS', 'Roberto', SYSDATE);
INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Sierra Sur', 'SIE', 'Roberto', SYSDATE);
INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Sierra Norte', 'SIE', 'Roberto', SYSDATE);
INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Oriente Sur', 'ORI', 'Roberto', SYSDATE);
INSERT INTO sucursal (codigo_empresa, nombre_sucursal, region, usuario_registro, fecha_registro) VALUES (1, 'Veris Insular Norte', 'INS', 'Roberto', SYSDATE);

COMMIT;

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456789', 'Andre', 'Andre', 'Tapia', 'Centeno', 'Andre Andre Tapia Centeno', 'Andre@email.com', '23/09/1996', 405, 'M', 1, 1, 'Roberto', SYSDATE);

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456788', 'Jose', 'Maria', 'Velasco', 'Ibarra', 'Jose Maria Velasco Ibarra', 'Maria@email.com', '24/06/1997', 405, 'M', 3, 1, 'Roberto', SYSDATE);

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456787', 'Jose', 'Francisco', 'Cevallos', 'Pinargote', 'Jose Francisco Cevallos Pinargote', 'Jose@email.com', '23/09/1996', 405, 'M', 2, 1, 'Roberto', SYSDATE);
    
INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456786', 'Gabriel', 'Jose', 'Barbosa', 'Antepara', 'Gabriel Jose Barbosa Antepara', 'Gabriel@email.com', '23/09/1996', 405, 'M', 3, 1, 'Roberto', SYSDATE);
    
INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456785', 'Jaime', 'Victor', 'Nebot', 'Erazo', 'Jaime Victor Nebot Erazo', 'Jaime@email.com', '23/09/1996', 405, 'M', 3, 1, 'Roberto', SYSDATE);

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456784', 'Hugo', 'Roberto', 'Chavez', 'Farias', 'Hugo Roberto Chavez Farias', 'Hugo@email.com', '23/09/1996', 405, 'M', 1, 1, 'Roberto', SYSDATE);

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456783', 'Jose', 'Elias', 'Arias', 'Maldonado', 'Jose Elias Arias Maldonado', 'Elias@email.com', '23/09/1996', 405, 'M', 1, 1, 'Roberto', SYSDATE);

INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456782', 'Ronnie', 'Jesus', 'Carrillo', 'Delgado', 'Ronnie Jesus Carrillo Delgado', 'Ronnie@email.com', '23/09/1996', 405, 'M', 2, 1, 'Roberto', SYSDATE);


INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456782', 'Jaime', 'Jacinto', 'Alarcón', 'Martinez', 'Jaime Jacinto Alarcón Martinez', 'Jaime@email.com', '23/09/1996', 405, 'M', 2, 1, 'Roberto', SYSDATE);
    
    
INSERT INTO medico (tipo_identificacion, numero_identificacion, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
    nombre_completo, mail, fecha_nacimiento, sueldo, sexo, codigo_sucursal, codigo_empresa, usuario_registro, fecha_registro)
    VALUES
    ('C', '0123456782', 'Juan', 'Antonio', 'Lapasaran', 'Medina', 'Juan Antonio Lapasaran Medina', 'Juan@email.com', '23/09/1996', 405, 'M', 1, 1, 'Roberto', SYSDATE);
    
COMMIT;