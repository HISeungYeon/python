import pymysql

e_id="3"
e_name="5"
sex="5"
addr="5"
 
# MySQL Connection 연결
conn = pymysql.connect(host='localhost', port=3305, user='root', password='python',
                       db='python', charset='utf8')

curs = conn.cursor()
sql = f"""update emp
         set e_name = '{e_name}',
             sex = '{sex}',
             addr = '{addr}'
         where e_id = '{e_id}'"""
curs.execute(sql)

conn.commit()
conn.close()
curs.close()