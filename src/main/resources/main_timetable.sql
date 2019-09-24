CREATE TABLE main_timetable 
(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, 
time_start VARCHAR(20),
time_end VARCHAR(20),
subject_name VARCHAR(100) NOT NULL,
teacher VARCHAR(100),
room VARCHAR(20) NOT NULL,
is_cancelled BOOL DEFAULT 0
);
INSERT INTO main_timetable (time_start, time_end, subject_name, teacher, room, is_cancelled) VALUES ('08:15', '09:35', 'Матанализ', 'Мазанник А.А.', '521', 0);
INSERT INTO main_timetable (time_start, time_end, subject_name, teacher, room, is_cancelled) VALUES ('09:45', '11:15', 'Алгебра', 'Иванов А.А.', '431', 0);
INSERT INTO main_timetable (time_start, time_end, subject_name, teacher, room, is_cancelled) VALUES ('14:30', '15:50', 'СД-31', 'Федченко В.А.', '313 ВФ', 0);
INSERT INTO main_timetable (time_start, time_end, subject_name, teacher, room, is_cancelled) VALUES ('13:00', '14:20', 'Введение в криптографию', 'Бурделев П.И.Д.О.Р.', '111', 0);

/*
drop table main_timetable; -- если надо удалить таблицу и создать по-новой
DELETE from main_timetable where id = 6;  --удалить конкретную строку
*/
SELECT * from main_timetable -- посмотреть содержимое
