CREATE TABLE usuarios(
	user_id SERIAL PRIMARY KEY,
	username VARCHAR(50),
	email VARCHAR(50),
	rol VARCHAR(50),
	created_at timestamp
);
CREATE TABLE posts(
	post_id SERIAL PRIMARY KEY,
	titulo VARCHAR(50),
	mensaje TEXT NOT NULL,
	user_id INT,
	estado VARCHAR(100),
	created_at timestamp
);
COMMENT ON COLUMN posts.mensaje IS 'Cuerpo del post';
ALTER TABLE posts
ADD CONSTRAINT fk_usuarios
FOREIGN KEY (user_id) REFERENCES usuarios(user_id);

CREATE TABLE comentarios(
comment_id SERIAL PRIMARY KEY,
comentario TEXT NOT NULL,
user_id INT,
post_id INT,
estado VARCHAR(100),
created_at timestamp,
FOREIGN KEY (user_id) REFERENCES usuarios(user_id),
FOREIGN KEY (post_id) REFERENCES posts(post_id)
);

COMMENT ON COLUMN comentario.comentario IS 'comentario sobre un post';

CREATE TABLE seguidores(
seguidor_user_id INT,
seguido_user_id INT,
created_at timestamp,
PRIMARY KEY (seguidor_user_id , seguido_user_id),
FOREIGN KEY (seguido_user_id) REFERENCES usuarios(user_id),
FOREIGN KEY (seguidor_user_id) REFERENCES usuarios(user_id)
);
DELETE FROM seguidores;

ALTER TABLE seguidores
ADD CONSTRAINT fk_usuarios
FOREIGN KEY (seguidor_user_id) REFERENCES usuarios(user_id);
ALTER TABLE seguidores
FOREIGN KEY (seguido_user_id) REFERENCES usuarios(user_id);


INSERT INTO usuarios (username, email, rol, created_at) 
VALUES('sebaslombardi_','sebaslomba23@gmail.com','programador',CURRENT_TIMESTAMP),('Bardi','sebaslombaog@gmail.com','alter ego',CURRENT_TIMESTAMP);
INSERT INTO posts (titulo, mensaje, estado, created_at)
VALUES ('Viaje a San Ber','viajando tres findes de enero a sb con mis amigos','publicado',CURRENT_TIMESTAMP);
INSERT INTO comentarios(comentario, estado, created_at)
VALUES ('recopilacion de fotos','activo', CURRENT_TIMESTAMP);