show user;

select * from board where board.boardname = '프로젝트모집';

select * from memberdetail;

select * from member;

/* bookmarks: 북마크 목록을 저장할 테이블 */
select * from bookmarks;

insert into bookmarks (bookidx, idx, userid, title, writedate, lovenum) 
values (1, 2, 'hi', 'DOBBY IS FREE!', sysdate, 0);

select * from bookmarks where userid = 'hi';


select count(*) as cnt from bookmarks where userid = 'hi' and idx =2;

select * from love;

select count(*) cnt from love where idx = 24 and userid = 'hi';

select * from bookmarks;

commit;

CREATE SEQUENCE book_idx
START WITH 1
INCREMENT BY 1
NOCACHE;

commit;

insert into bookmarks(bookidx, idx, userid, title, ) values(1, 1, 'hi');

select * from board;

select * from bookmarks;

show user;

select * from board;

select * from bookmarks where userid = 'hi';
