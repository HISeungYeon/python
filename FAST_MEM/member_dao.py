import pymysql


class MemberDao:
    def __init__(self):
        self.conn = pymysql.connect(host='localhost', port=3305, user='root', password='python',
                       db='python', charset='utf8')
 
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)
        
    def selects(self):
        sql = "select m_seq, m_name, tel, army_yn from member"
        self.curs.execute(sql)
        rows = self.curs.fetchall()
        return rows
    
    def select(self, m_seq):
        sql = f"""
                select m_seq, 
                        m_name, 
                        tel, 
                        army_yn 
                from member 
                where m_seq = '{m_seq}'
            """
        
        self.curs.execute(sql)
        rows = self.curs.fetchall()
        return rows[0]
    
    def insert(self, m_name, tel, army_yn):
        sql = f"""
                insert into member (m_name, tel, army_yn)
                values ('{m_name}', '{tel}', '{army_yn}')
            """
         
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def update(self, m_seq, m_name, tel, army_yn):
        sql = f"""
                update member
                 set m_name = '{m_name}',
                 tel = '{tel}',
                 army_yn = '{army_yn}'
                 where m_seq = '{m_seq}'
            """
         
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def delete(self, m_seq):
        sql = f"""
                delete from member
                where m_seq = '{m_seq}'
            """
        
        cnt = self.curs.execute(sql)
        self.conn.commit()
        return cnt
    
    def __del__(self):
        self.conn.close()
        self.curs.close()
        
if __name__ == '__main__':
    mem = MemberDao()
    rows = mem.selects()
    cnt = mem.delete('1')
    print(cnt)