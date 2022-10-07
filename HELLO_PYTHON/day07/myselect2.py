import pymysql
 
# MySQL Connection 연결
conn = pymysql.connect(host='localhost', port=3305, user='root', password='python',
                       db='python', charset='utf8')
 
# Connection 으로부터 Cursor 생성
curs = conn.cursor(pymysql.cursors.DictCursor)
 
# SQL문 실행
sql = "select * from emp"
curs.execute(sql)
 
# 데이타 Fetch
rows = curs.fetchall()
print(rows)     # 전체 rows
 
# Connection 닫기
conn.close()
curs.close()