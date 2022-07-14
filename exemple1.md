
mysql> desc aluno;
+-------------+-------------+------+-----+---------+----------------+
| Field       | Type        | Null | Key | Default | Extra          |
+-------------+-------------+------+-----+---------+----------------+
| id_aluno    | bigint      | NO   | PRI | NULL    | auto_increment |
| email_aluno | varchar(50) | YES  |     | NULL    |                |
| id_contato  | bigint      | YES  |     | NULL    |                |
| nome_aluno  | varchar(50) | YES  |     | NULL    |                |
| status      | varchar(50) | YES  |     | NULL    |                |
+-------------+-------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql> desc disciplina;
+-----------------+-------------+------+-----+---------+----------------+
| Field           | Type        | Null | Key | Default | Extra          |
+-----------------+-------------+------+-----+---------+----------------+
| id_disciplina   | bigint      | NO   | PRI | NULL    | auto_increment |
| media           | double      | YES  |     | NULL    |                |
| nome_disciplina | varchar(50) | YES  |     | NULL    |                |
| aluno_id        | bigint      | YES  | MUL | NULL    |                |
+-----------------+-------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> desc contato;
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| id_contato   | bigint       | NO   | PRI | NULL    | auto_increment |
| bairro       | varchar(255) | YES  |     | NULL    |                |
| caixa_postal | varchar(50)  | YES  |     | NULL    |                |
| cidade       | varchar(255) | YES  |     | NULL    |                |
| nome_aluno   | varchar(50)  | YES  |     | NULL    |                |
| telefone     | varchar(255) | YES  |     | NULL    |                |
| aluno_id     | bigint       | YES  | MUL | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
7 rows in set (0.00 sec)


