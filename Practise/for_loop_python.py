list=['A','B','C','D','E','F']
print(list)
for i in list:
    print(i)
    list.pop(0)
    print(i)
print(list)