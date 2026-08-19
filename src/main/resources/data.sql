INSERT INTO artistas (id, nome, nacionalidade, biografia, foto_url) VALUES
(1, 'Ana Castela', 'Brasileira', 'Cantora brasileira de sertanejo e piseiro, conhecida como a Boiadeira.', 'https://exemplo.com/ana-castela.jpg'),
(2, 'Bad Bunny', 'Porto-riquenho', 'Cantor e rapper porto-riquenho, um dos maiores nomes do reggaeton mundial.', 'https://exemplo.com/bad-bunny.jpg'),
(3, 'Taylor Swift', 'Americana', 'Cantora e compositora americana, uma das artistas mais premiadas da história.', 'https://exemplo.com/taylor-swift.jpg'),
(4, 'Seu Jorge', 'Brasileira', 'Cantor, compositor e ator brasileiro, referência na MPB e samba.', 'https://exemplo.com/seu-jorge.jpg'),
(5, 'Billie Eilish', 'Americana', NULL, 'https://exemplo.com/billie-eilish.jpg'),
(6, 'Ludmilla', 'Brasileira', 'Cantora brasileira de funk, pop e pagode, uma das maiores artistas do Brasil.', 'https://exemplo.com/ludmilla.jpg'),
(7, 'The Weeknd', 'Canadense', 'Cantor canadense de R&B e pop, conhecido por hits globais.', NULL),
(8, 'Anitta', 'Brasileira', 'Cantora e empresária brasileira com carreira internacional consolidada.', 'https://exemplo.com/anitta.jpg');

INSERT INTO musicas (id, titulo, genero, duracao_segundos, ano_lancamento, artista_id) VALUES
(1, 'Pipoco', 'Sertanejo', 178, 2022, 1),
(2, 'Nosso Quadro', 'Sertanejo', 195, 2023, 1),
(3, 'Solteiro Forçado', 'Piseiro', 162, 2023, 1),

(4, 'Tití Me Preguntó', 'Reggaeton', 244, 2022, 2),
(5, 'Dakiti', 'Reggaeton', 205, 2020, 2),
(6, 'Callaíta', 'Pop Latino', 251, 2019, 2),

(7, 'Anti-Hero', 'Pop', 200, 2022, 3),
(8, 'Blank Space', 'Pop', 231, 2014, 3),
(9, 'Cruel Summer', 'Pop', 178, 2019, 3),
(10, 'Fortnight', 'Pop', 228, 2024, 3),

(11, 'Burguesinha', 'MPB', 245, 2010, 4),
(12, 'Tive Razão', 'Samba', 198, 2001, 4),
(13, 'Carolina', 'MPB', 312, 2005, 4),

(14, 'Bad Guy', 'Pop Alternativo', 194, 2019, 5),
(15, 'Happier Than Ever', 'Pop Alternativo', 298, 2021, 5),
(16, 'Birds of a Feather', 'Pop', 210, 2024, 5),

(17, 'Maldivas', 'Pagode', 203, 2023, 6),
(18, 'Socadona', 'Funk', 168, 2022, 6),
(19, 'Rainha da Favela', 'Funk', 192, 2020, 6),

(20, 'Blinding Lights', 'Synthpop', 200, 2020, 7),
(21, 'Save Your Tears', 'Pop', 215, 2020, 7),
(22, 'Starboy', 'R&B', 230, 2016, 7),

(23, 'Envolver', 'Reggaeton', 185, 2021, 8),
(24, 'Girl From Rio', 'Pop', 191, 2021, 8),
(25, 'Vai Malandra', 'Funk', 195, 2017, 8);

INSERT INTO estatisticas (id, total_reproducoes, total_curtidas, total_compartilhamentos, musica_id) VALUES
(1, 850000000, 42000000, 15000000, 1),
(2, 320000000, 18000000, 6000000, 2),
(3, 210000000, 11000000, 4500000, 3),
(4, 1200000000, 55000000, 22000000, 4),
(5, 2100000000, 78000000, 31000000, 5),
(6, 1800000000, 65000000, 25000000, 6),
(7, 1500000000, 70000000, 28000000, 7),
(8, 3200000000, 95000000, 45000000, 8),
(9, 1900000000, 72000000, 30000000, 9),
(10, 600000000, 35000000, 12000000, 10),
(11, 95000000, 5000000, 2000000, 11),
(12, 78000000, 4200000, 1800000, 12),
(13, 45000000, 2800000, 1200000, 13),
(14, 2400000000, 88000000, 38000000, 14),
(15, 1100000000, 52000000, 20000000, 15),
(16, 750000000, 40000000, 16000000, 16),
(17, 380000000, 20000000, 8000000, 17),
(18, 290000000, 15000000, 6500000, 18),
(19, 410000000, 22000000, 9000000, 19),
(20, 4200000000, 120000000, 55000000, 20),
(21, 2800000000, 90000000, 40000000, 21),
(22, 2500000000, 82000000, 35000000, 22),
(23, 680000000, 38000000, 14000000, 23),
(24, 150000000, 9000000, 3500000, 24),
(25, 520000000, 28000000, 11000000, 25);
