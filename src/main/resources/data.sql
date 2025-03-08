INSERT INTO
  tb_persons (name, profession, location, exp_level)
VALUES
  (
    'Gustavo Alves Dias',
    'Desenvolvedor FullStack',
    'A',
    2
  ),
  (
    'Larissa Rodrigues Oliveira',
    'Desenvolvedora FrontEnd',
    'C',
    4
  );

INSERT INTO
  tb_jobs (company, title, description, location, exp_level)
VALUES
  (
    'Porto Seguro Companhia de Seguros Gerais',
    'Desenvolvedor FullStack Jr',
    'Venha contribuir com o nosso time de desenvolvedores.',
    'A',
    2
  );

INSERT INTO
  tb_applications (job_id, person_id)
VALUES
  (1, 1),
  (1, 2);