CREATE TABLE board_tbl_01(
    board_no NUMBER PRIMARY KEY,
    board_title VARCHAR2(50),
    board_writer VARCHAR2(20),
    board_content VARCHAR2(100),
    board_image VARCHAR2(20),
    board_date DATE
);

INSERT INTO board_tbl_01 VALUES (100, '산책', '윤하', '친구들과 자전거를 타고', '100.jpg', TO_DATE('2022-05-03', 'YYYY-MM-DD'));
INSERT INTO board_tbl_01 VALUES (101, '고양이', '동규', '아기고양이와 놀아주다', '101.jpg', TO_DATE('2022-06-23', 'YYYY-MM-DD'));
INSERT INTO board_tbl_01 VALUES (102, '일러스트', '호진', '오랜만에 이것저것 만져보다가 나옴', '102.jpg', TO_DATE('2022-07-17', 'YYYY-MM-DD'));
INSERT INTO board_tbl_01 VALUES (103, '힐링', '강미', '아이와 강아지, 세상 평화롭다', '103.jpg', TO_DATE('2022-07-25', 'YYYY-MM-DD'));
INSERT INTO board_tbl_01 VALUES (104, '가을', '윤하', '열매가 야무지게 익어가는 중', '104.jpg', TO_DATE('2022-09-03', 'YYYY-MM-DD'));

CREATE TABLE view_tbl_01(
    view_no NUMBER PRIMARY KEY,
    board_no NUMBER,
    view_count NUMBER,
    view_date date
);

INSERT INTO view_tbl_01 VALUES (1101, 100, 1, TO_DATE('2022-05-05', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1102, 101, 1, TO_DATE('2022-06-10', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1103, 101, 1, TO_DATE('2022-06-21', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1104, 102, 1, TO_DATE('2022-07-18', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1105, 103, 1, TO_DATE('2022-07-31', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1106, 103, 1, TO_DATE('2022-08-11', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1107, 103, 1, TO_DATE('2022-08-17', 'YYYY-MM-DD'));
INSERT INTO view_tbl_01 VALUES (1108, 104, 1, TO_DATE('2022-09-13', 'YYYY-MM-DD'));

commit;