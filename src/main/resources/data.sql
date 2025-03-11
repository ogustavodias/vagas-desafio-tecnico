INSERT INTO
  tb_persons (name, profession, location, exp_level)
VALUES
  (
    'Gustavo Alves Dias',
    'Desenvolvedor FullStack',
    'A',
    'TRAINEE'
  ),
  (
    'Larissa Rodrigues Oliveira',
    'Desenvolvedora FrontEnd',
    'C',
    'JUNIOR'
  ),
  (
    'Alex Teodoro da Silva',
    'Analista de Dados',
    'C',
    'SPECIALIST'
  );

INSERT INTO
  tb_jobs (company, title, description, location, exp_level)
VALUES
  (
    'Porto Seguro Companhia de Seguros Gerais',
    'Desenvolvedor FullStack Jr',
    'Venha contribuir com o nosso time de desenvolvedores.',
    'A',
    'JUNIOR'
  ),
  (
    'Azul Seguros',
    'Analista de Dados Sr',
    'Venha contribuir com o nosso time de dados.',
    'C',
    'SPECIALIST'
  );

INSERT INTO
  tb_applications (job_id, person_id)
VALUES
  (1, 1),
  (1, 2),
  (1, 3),
  (2, 3);