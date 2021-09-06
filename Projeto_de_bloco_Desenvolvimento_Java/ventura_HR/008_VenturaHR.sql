CREATE DATABASE `ads_m_2021`;

CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `senha` varchar(32) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `razao_social` varchar(50) DEFAULT NULL,
  `cnpj` varchar(14) DEFAULT NULL,
  `tipo` char(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `cnpj_UNIQUE` (`cnpj`)
);

CREATE TABLE `vagas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `forma_contratacao` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_usuario_idx` (`id_usuario`),
  CONSTRAINT `fk_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`)
);

CREATE TABLE `criterios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_vaga` int NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `perfil` int NOT NULL,
  `peso` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vaga_idx` (`id_vaga`),
  CONSTRAINT `fk_vaga` FOREIGN KEY (`id_vaga`) REFERENCES `vagas` (`id`)
);

CREATE TABLE `respostas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_vaga` int NOT NULL,
  `data` datetime NOT NULL,
  `indice` decimal(2,1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_respostas_usuario_idx` (`id_usuario`),
  KEY `fk_respostas_vaga_idx` (`id_vaga`),
  CONSTRAINT `fk_respostas_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `fk_respostas_vaga` FOREIGN KEY (`id_vaga`) REFERENCES `vagas` (`id`)
);

CREATE TABLE `respostas_criterios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_resposta` int NOT NULL,
  `id_criterio` int NOT NULL,
  `resposta` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_respostas_criterios_resposta_idx` (`id_resposta`),
  KEY `fk_respostas_criterios_criterio_idx` (`id_criterio`),
  CONSTRAINT `fk_respostas_criterios_criterio` FOREIGN KEY (`id_criterio`) REFERENCES `criterios` (`id`),
  CONSTRAINT `fk_respostas_criterios_resposta` FOREIGN KEY (`id_resposta`) REFERENCES `respostas` (`id`)
);
