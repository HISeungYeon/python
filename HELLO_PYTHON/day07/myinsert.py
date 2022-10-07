import pymysql
 
# MySQL Connection 연결
conn = pymysql.connect(host='localhost', port=3305, user='root', password='python',
                       db='python', charset='utf8')
 
 
curs = conn.cursor()
sql = """insert into emp (e_id,e_name,sex,addr)
         values (%s, %s, %s, %s)"""
         
cnt = curs.execute(sql, ('4', '4', '4', '4'))
print("cnt ", cnt) #rowcount라는 것도 있다,,~ 정도

conn.commit()
conn.close()
curs.close()