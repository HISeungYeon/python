class Byden:
    def __init__(self):
        self.ac = 10
    
    def makewar(self):
        self.ac -= 1
    
class Putin:
    def __init__(self):
        self.nuclear = 6600
        
    def altzheimer(self):
        self.nuclear -= 1


class Mugun(Byden, Putin):
    def __init__(self):
        Byden.__init__(self) #다중 상속은 따로 super 해주어야 함!!
        Putin.__init__(self)
 
mugun = Mugun()
print(mugun.ac)
print(mugun.nuclear)
mugun.makewar()
mugun.altzheimer()
print(mugun.ac)
print(mugun.nuclear)