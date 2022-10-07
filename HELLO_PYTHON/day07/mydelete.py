import pymysql

e_id="4"
 
# MySQL Connection 연결
conn = pymysql.connect(host='localhost', port=3305, user='root', password='python',
                       db='python', charset='utf8')

curs = conn.cursor()
sql = f"""delete from emp
         where e_id = '{e_id}'"""
curs.execute(sql)

conn.commit()
conn.close()
curs.close()