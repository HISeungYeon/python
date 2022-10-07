class Animal:
    def __init__(self):
        self.hungry = 5
        
    def timegoby(self):
        if self.hungry > 0 :
            self.hungry -= 1
    
    def manttang(self):
        self.hungry = 10
        
class Human(Animal):
    def __init__(self):
        super().__init__() #슈퍼를 해주어야 상속가능!!
        self.skill_lang = 0
    
    def momstouch(self, stroke):
        self.skill_lang += stroke
    
        
        
# ani = Animal()
hum = Human()
print(hum.hungry)
hum.timegoby()
hum.manttang()
print(hum.hungry)